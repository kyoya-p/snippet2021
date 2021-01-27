plugins {
    kotlin("plugin.serialization") version "1.3.50"
    `kotlin-dsl`
}

repositories {
    jcenter()
    mavenCentral()
}


dependencies({
    //implementation(group = "org.openapitools", name = "openapi-generator", version = "5.0.0")
    //implementation(group = "org.openapitools", name = "openapi-generator-maven-plugin", version = "5.0.0")
    //implementation(group = "org.openapitools", name = "openapi-generator-cli", version = "5.0.0")

    implementation(project(":genapi"))
    //implementation(project(":gen:srdm"))
})
