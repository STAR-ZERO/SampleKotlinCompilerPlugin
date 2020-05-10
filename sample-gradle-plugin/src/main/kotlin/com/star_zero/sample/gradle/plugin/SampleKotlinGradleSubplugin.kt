package com.star_zero.sample.gradle.plugin

import org.gradle.api.Project
import org.gradle.api.tasks.compile.AbstractCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinCommonOptions
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilation
import org.jetbrains.kotlin.gradle.plugin.KotlinGradleSubplugin
import org.jetbrains.kotlin.gradle.plugin.SubpluginArtifact
import org.jetbrains.kotlin.gradle.plugin.SubpluginOption

class SampleKotlinGradleSubplugin : KotlinGradleSubplugin<AbstractCompile> {
    override fun apply(
        project: Project,
        kotlinCompile: AbstractCompile,
        javaCompile: AbstractCompile?,
        variantData: Any?,
        androidProjectHandler: Any?,
        kotlinCompilation: KotlinCompilation<KotlinCommonOptions>?
    ): List<SubpluginOption> {
        return emptyList()
    }

    override fun getCompilerPluginId(): String = "sample-compiler-plugin"

    override fun getPluginArtifact(): SubpluginArtifact {
        return SubpluginArtifact(
            "com.star-zero",
            "sample-compiler-plugin",
            "0.0.1"
        )
    }

    override fun isApplicable(project: Project, task: AbstractCompile): Boolean {
        return true
    }
}
