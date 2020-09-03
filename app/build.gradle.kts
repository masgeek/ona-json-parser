plugins {
    kotlin("jvm")
    id("com.github.johnrengelman.shadow") version "6.0.0"
}


tasks.getByName<Jar>("jar") {
    manifest {
        attributes["Main-Class"] = "com.tsobu.parser.app.AppKt"
    }
}

tasks.withType<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar> {
//    archiveBaseName.set("app-full")
    archiveClassifier.set("")
//    archiveVersion.set("1.0")
}

tasks {
    build {
//        dependsOn(shadowJar)
    }
}

tasks.register("deploy") {
    group = "Tsobu tasks"
    description = "Produces a fat jar to run from terminal"

    dependsOn("clean")
    dependsOn("shadowJar")
    doLast {
        println("Deployment completed")
    }
}
dependencies {
    implementation(project(":core"))

    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation(kotlin("reflect"))
    implementation(kotlin("stdlib"))
    implementation(kotlin("stdlib-jdk8"))

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}
