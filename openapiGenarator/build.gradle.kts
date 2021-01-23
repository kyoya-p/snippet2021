import org.openapitools.generator.gradle.plugin.tasks.GenerateTask

plugins {
    //`kotlin-dsl`
    id("org.openapi.generator") version "5.0.0"
}

repositories {
    jcenter()
}

dependencies {
    //implementation(group = "org.openapitools", name = "openapi-generator", version = "5.0.0")
    //implementation(group = "org.openapitools", name = "openapi-generator-maven-plugin", version = "5.0.0")
    //implementation(group = "org.openapitools", name = "openapi-generator-cli", version = "5.0.0")

}

// https://qiita.com/warahiko/items/3676f1164f4619e8debc
task<GenerateTask>("apiGenerate") {
    generatorName.set("kotlin")
    inputSpec.set("$rootDir/SampleAPI.yml")
}
