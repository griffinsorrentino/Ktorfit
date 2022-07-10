buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.20")
        classpath("com.android.tools.build:gradle:7.4.0-alpha08")
        classpath("org.jetbrains.kotlin:kotlin-serialization:1.6.21")

    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
