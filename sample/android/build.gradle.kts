plugins {
    id("org.jetbrains.compose") version "0.3.2"
    id("com.android.application")
    kotlin("android")
}

group = "moe.tlaster"
version = "1.0"

repositories {
    google()
}

dependencies {
    implementation(project(":sample:common"))
    implementation("androidx.activity:activity-compose:1.3.0-alpha03")
}

android {
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "moe.tlaster.android"
        minSdkVersion(21)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "0.1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}