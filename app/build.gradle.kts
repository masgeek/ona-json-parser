plugins {
    kotlin("jvm")
    id("com.github.johnrengelman.shadow") version "6.0.0"
}


tasks.getByName<Jar>("jar") {
    manifest {
        attributes["Main-Class"] = "com.tsobu.parser.app.AppKt"
    }
}

//tasks.withType<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar> {
////    archiveBaseName.set("app-full")
//    archiveClassifier.set("")
////    archiveVersion.set("1.0")
//}

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
    implementation(project(":config"))
    implementation(project(":core"))

    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation(kotlin("reflect"))
    implementation(kotlin("stdlib"))
    implementation(kotlin("stdlib-jdk8"))

    implementation("com.sksamuel.hoplite:hoplite-core:1.3.6")
    implementation("com.sksamuel.hoplite:hoplite-yaml:1.3.6")


    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}
