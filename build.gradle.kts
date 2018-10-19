import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.0-rc-190" // "1.3.0-rc-190"
    id("kotlinx-serialization") version "1.3.0-rc-190"
}

group = "moe.nikky"
version = "1.0-SNAPSHOT"

repositories {
    maven(url = "http://dl.bintray.com/kotlin/kotlin-eap")
    maven(url = "https://kotlin.bintray.com/kotlinx")

    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
    compile(group = "org.jetbrains.kotlinx", name = "kotlinx-serialization-runtime", version = "0.8.2-rc13")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}