plugins {
    id("org.jetbrains.kotlin.android") version "1.9.24" apply false
    id("org.jetbrains.kotlin.jvm") version "1.9.24" apply false
    id("com.android.application") version "8.4.1" apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
