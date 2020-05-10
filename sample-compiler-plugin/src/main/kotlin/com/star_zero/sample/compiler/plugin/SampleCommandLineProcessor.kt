package com.star_zero.sample.compiler.plugin

import org.jetbrains.kotlin.compiler.plugin.AbstractCliOption
import org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor

class SampleCommandLineProcessor : CommandLineProcessor {
    override val pluginId: String = "sample-compiler-plugin"
    override val pluginOptions: Collection<AbstractCliOption> = emptyList()
}
