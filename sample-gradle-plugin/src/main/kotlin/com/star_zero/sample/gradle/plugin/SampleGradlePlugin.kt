package com.star_zero.sample.gradle.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class SampleGradlePlugin : Plugin<Project> {
    override fun apply(project: Project) {

        /**
         * // Enable this plugin
         * sample {
         *     enabled = true
         * }
         */
        project.extensions.create(
            "sample",
            SampleGradleExtension::class.java
        )
    }
}
