buildscript {
    repositories {
        mavenCentral()
        mavenLocal()
        jcenter()
    }
}

plugins {
    val kotlinVersion = "1.4.0"
    kotlin("jvm") version kotlinVersion apply false

    // Apply the application plugin to add support for building a CLI application.
    application
}

allprojects{
    group = "com.tsobu"
    version = "4.0.0"
}
dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    // Define the main class for the application.
    mainClassName = "ona.json.parser.AppKt"
}
