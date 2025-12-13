plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
}
version = "1.0.0"
group = "io.github.vafeen"
java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}
kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11
    }
}
