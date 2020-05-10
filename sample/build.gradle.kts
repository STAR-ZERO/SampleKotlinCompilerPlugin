plugins {
    application
    kotlin("jvm") version "1.3.72"
    id("sample-gradle-plugin") version "0.0.1"
}

repositories {
    jcenter()
    maven { url = uri("../sample-compiler-plugin/build/repository") }
}

dependencies {
    implementation(kotlin("stdlib"))
}

application {
    mainClassName = "com.star_zero.sample.MainKt"
}
