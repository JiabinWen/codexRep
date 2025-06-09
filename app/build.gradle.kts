plugins {
    id("com.android.application") version "8.4.1"
    kotlin("android") version "1.9.24"
}

android {
    namespace = "com.example.homeautomation"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.homeautomation"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":core"))
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
}
