package com.star_zero.sample.compiler.plugin

import org.jetbrains.kotlin.codegen.ClassBuilder
import org.jetbrains.kotlin.codegen.DelegatingClassBuilder
import org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin
import org.jetbrains.org.objectweb.asm.MethodVisitor
import org.jetbrains.org.objectweb.asm.Opcodes
import org.jetbrains.org.objectweb.asm.commons.InstructionAdapter

class SampleClassBuilder(
    private val delegateClassBuilder: ClassBuilder
) : DelegatingClassBuilder() {
    override fun getDelegate() = delegateClassBuilder

    override fun newMethod(
        origin: JvmDeclarationOrigin,
        access: Int,
        name: String,
        desc: String,
        signature: String?,
        exceptions: Array<out String>?
    ): MethodVisitor {

        val original = super.newMethod(origin, access, name, desc, signature, exceptions)

        // Add "println" to the beginning of all functions.
        return object : MethodVisitor(Opcodes.API_VERSION, original) {
            override fun visitCode() {
                super.visitCode()
                InstructionAdapter(this).apply {
                    getstatic("java/lang/System", "out", "Ljava/io/PrintStream;")
                    visitLdcInsn("[Run `$name` function]")
                    invokevirtual("java/io/PrintStream", "println", "(Ljava/lang/Object;)V", false)
                }
            }
        }
    }
}
