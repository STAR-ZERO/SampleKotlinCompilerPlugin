pluginManagement {
    repositories {
        jcenter()
        gradlePluginPortal()
        maven { url = uri("sample-gradle-plugin/build/repository") }
    }
}

rootProject.name = "SampleKotlinCompilerPlugin"
include("sample-compiler-plugin")
include("sample-gradle-plugin")
include("sample")
