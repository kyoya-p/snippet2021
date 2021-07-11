plugins {
    id("org.jetbrains.kotlin.js") version "1.5.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("io.ktor:ktor-client-js:1.6.1") // https://mvnrepository.com/artifact/io.ktor/ktor-client-js
}

kotlin {
    js {
        browser {
            webpackTask {
                cssSupport.enabled = true
            }

            runTask {
                cssSupport.enabled = true
            }

            testTask {
                useKarma {
                    useChromeHeadless()
                    webpackConfig.cssSupport.enabled = true
                }
            }
        }
        binaries.executable()
    }
}
kotlin {
    js {
        nodejs {
        }
        binaries.executable()
    }
}