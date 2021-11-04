plugins {
    kotlin("jvm") version "1.5.31"
    //id("org.jetbrains.kotlin.plugin.serialization") version "1.5.30-RC"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.31")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2-native-mt")    // https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-coroutines-core
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.3.1")

    //implementation("org.jetbrains.kotlin:kotlin-serialization:1.5.30-RC")  // https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-serialization
    implementation("org.jetbrains.kotlin:kotlin-test:1.5.31")
    implementation("org.junit.jupiter:junit-jupiter:5.8.1")
}

tasks.test {
    useJUnitPlatform()
}
