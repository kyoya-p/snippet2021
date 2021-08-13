plugins {
    kotlin("jvm") version "1.5.10"
    //id("org.jetbrains.kotlin.plugin.serialization") version "1.5.30-RC"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1")    // https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-coroutines-core
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.2.1") // https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-datetime

    //implementation("org.jetbrains.kotlin:kotlin-serialization:1.5.30-RC")  // https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-serialization
}