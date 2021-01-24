import org.openapitools.generator.gradle.plugin.tasks.GenerateTask

plugins {
    `kotlin-dsl`
    id("org.openapi.generator") version "5.0.0"
}

repositories {
    jcenter()
}

val apiName = "srdm"
val buildApiDir = "$buildDir/gen/$apiName"
val basePackage = "idpManager"

dependencies {
    //implementation(group = "org.openapitools", name = "openapi-generator", version = "5.0.0")
    //implementation(group = "org.openapitools", name = "openapi-generator-maven-plugin", version = "5.0.0")
    //implementation(group = "org.openapitools", name = "openapi-generator-cli", version = "5.0.0")

    implementation(project("gen:srdm"))
}

// https://github.com/OpenAPITools/openapi-generator/blob/master/docs/generators/kotlin.md
// https://qiita.com/warahiko/items/3676f1164f4619e8debc
task<GenerateTask>("apiGenerate") {

    inputSpec.set("$rootDir/SampleAPI.yaml")

    generatorName.set("kotlin")

    //library.set("jvm-retrofit2")
    library.set("multiplatform")
    //library.set("jvm-okhttp4")

    outputDir.set(buildApiDir)
    packageName.set(basePackage)
    apiPackage.set("$basePackage.$apiName.api")
    modelPackage.set("$basePackage.$apiName.model")
    //configOptions.set(mapOf("dateLibrary" to "java8"))
    //additionalProperties.set(mapOf("doNotUseRxAndCoroutines" to "true"))
    generateApiTests.set(false)

}
