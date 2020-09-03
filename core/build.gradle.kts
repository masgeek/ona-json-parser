
plugins {
    kotlin("jvm")
}

tasks.getByName<Jar>("jar") {
    enabled = true
}

dependencies {

    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation(kotlin("reflect"))
    implementation(kotlin("stdlib"))
    implementation(kotlin("stdlib-jdk8"))

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}