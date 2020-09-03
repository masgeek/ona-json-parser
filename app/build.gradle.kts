plugins {
    kotlin("jvm")
}

tasks.getByName<Jar>("jar") {
    manifest {
        attributes["Main-Class"] = "com.tsobu.parser.app.AppKt"

        // To add all of the dependencies
//        from(sourceSets.main.get().output)
//        dependsOn(configurations.runtimeClasspath)
//        from({
//            configurations.runtimeClasspath.get().filter { it.name.endsWith("jar") }.map { zipTree(it) }
//        })
    }
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
