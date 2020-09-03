plugins {
    kotlin("jvm")
    id("com.github.johnrengelman.shadow") version "6.0.0"
}

//sourceSets {
//    getByName("main").java.srcDirs("src/main/kotlin")
//    getByName("test").java.srcDirs("src/test/kotlin")
//}

tasks.getByName<Jar>("jar") {
    manifest {
        attributes["Main-Class"] = "com.tsobu.parser.app.AppKt"
    }
}

tasks.withType<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar> {
    archiveBaseName.set("app-full")
}

tasks {
    build {
        dependsOn(shadowJar)
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
