plugins {
    kotlin("jvm") version "1.9.24"
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation(kotlin("stdlib"))
}
