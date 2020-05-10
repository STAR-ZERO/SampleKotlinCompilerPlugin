package com.star_zero.sample.compiler.plugin

import org.jetbrains.kotlin.codegen.extensions.ClassBuilderInterceptorExtension
import org.jetbrains.kotlin.com.intellij.mock.MockProject
import org.jetbrains.kotlin.compiler.plugin.ComponentRegistrar
import org.jetbrains.kotlin.config.CompilerConfiguration

class SampleComponentRegistrar : ComponentRegistrar {
    override fun registerProjectComponents(project: MockProject, configuration: CompilerConfiguration) {
        ClassBuilderInterceptorExtension.registerExtension(
            project,
            SampleClassBuilderInterceptorExtension()
        )
    }
}
