Sample Kotlin Compiler Plugin
===

This plugin automatically outputs the additional text for each called method.

## Usage

- At first, comment out this plugin in `sample/build.gradle.kts` because the plugin has not created yet.

```kotlin
plugins {
    application
    kotlin("jvm") version "1.3.72"
    // Comment out
    // id("sample-gradle-plugin") version "0.0.1"
}
```

- Create plugin

```shell script
$ ./gradlew publish
```

- Uncomment this plugin in `sample/build.gradle.kts`

```kotlin
plugins {
    application
    kotlin("jvm") version "1.3.72"
    id("sample-gradle-plugin") version "0.0.1"
}
```

- Run sample

```shell script
$ ./gradlw sample:run
```

- Even if you don't write the code, you can see additional text in console.

```shell script
> Task :sample:run
[Run `main` function] # <- Added by Compiler plugin
Hello World
[Run `test` function] # <- Added by Compiler plugin
test
```
