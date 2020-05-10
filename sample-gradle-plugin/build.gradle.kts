import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    `kotlin-dsl`
    `maven-publish`
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin-api:${KotlinCompilerVersion.VERSION}")
}

group = "com.star-zero"
version = "0.0.1"

gradlePlugin {
    plugins {
        register("sample-gradle-plugin") {
            id = "sample-gradle-plugin"
            implementationClass = "com.star_zero.sample.gradle.plugin.SampleGradlePlugin"
        }
    }
}

publishing {
    repositories {
        maven(url = "build/repository")
    }
}
