plugins {
    kotlin("jvm") //version "1.4.21"
    id("org.openapi.generator") version "5.0.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

val apiName = "srdm"
val buildApiDir = "$buildDir/gen/$apiName"
val basePackage = "idpManager"

task<org.openapitools.generator.gradle.plugin.tasks.GenerateTask>("generateApi") {
    inputSpec.set("$rootDir/SampleAPI.yaml")
    generatorName.set("kotlin")
    library.set("multiplatform")
    outputDir.set(buildApiDir)
    packageName.set(basePackage)
    apiPackage.set("$basePackage.$apiName.api")
    modelPackage.set("$basePackage.$apiName.model")
    generateApiTests.set(false)
}
