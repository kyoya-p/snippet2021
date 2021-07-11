plugins {
    application
    kotlin("multiplatform") version "1.5.20"
}

//group = "org.example"
//version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm {}
    js {
        browser()
        nodejs()
    }
    mingwX64 { }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.2.1") // https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-datetime
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
    }
}

