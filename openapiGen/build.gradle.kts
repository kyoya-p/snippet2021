plugins {
    kotlin("jvm") version "1.3.50"
    //`kotlin-dsl`
    //kotlin("plugin.serialization") version "1.4.21"
    id("org.openapi.generator") version "5.0.0"
}

/*
val kotlin_version by extra { "1.3.5" }
val kotlinx_version by extra { "1.1.0" }
val coroutines_version by extra { "1.3.1" }
val serialization_version by extra { "0.12.0" }
val ktor_version by extra { "1.2.4" }
*/


group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(project("genApi"))
    implementation(project("gen:srdm"))
}
