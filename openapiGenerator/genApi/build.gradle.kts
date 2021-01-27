plugins {
    //id("org.openapi.generator") version "5.0.0"
}

repositories {
    jcenter()
    mavenCentral()
}
dependencies {
    //implementation(group = "org.openapitools", name = "openapi-generator", version = "5.0.0")
    //implementation(group = "org.openapitools", name = "openapi-generator-mXaven-plugin", version = "5.0.0")
    //implementation(group = "org.openapitools", name = "openapi-generator-cli", version = "5.0.0")
}

//val apiName = "srdm"
//val buildApiDir = "$buildDir/gen/$apiName"
//val basePackage = "idpManager"

/*

// https://github.com/OpenAPITools/openapi-generator/blob/master/docs/generators/kotlin.md
// https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator-gradle-plugin
// https://qiita.com/warahiko/items/3676f1164f4619e8debc
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

*/

