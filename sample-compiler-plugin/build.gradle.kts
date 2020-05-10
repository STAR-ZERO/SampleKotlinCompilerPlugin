import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    kotlin("jvm") version "1.3.72"
    `maven-publish`
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin-api:${KotlinCompilerVersion.VERSION}")
    implementation("org.jetbrains.kotlin:kotlin-compiler-embeddable:${KotlinCompilerVersion.VERSION}")
}

group = "com.star-zero"
version = "0.0.1"

publishing {
    repositories {
        maven {
            url = uri("build/repository")
        }
    }
    publications {
        register("mavenJava", MavenPublication::class) {
            from(components["java"])
        }
    }
}
