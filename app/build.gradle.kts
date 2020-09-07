plugins {
    kotlin("jvm")
}

tasks.getByName<Jar>("jar") {
    manifest {
        attributes["Main-Class"] = "com.tsobu.parser.app.AppKt"
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
