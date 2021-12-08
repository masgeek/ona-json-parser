plugins {
    id("org.springframework.boot")
    kotlin("jvm")
    kotlin("plugin.spring")
}

tasks.register<Copy>("release") {
    dependsOn("build")
    from("$rootDir/java-downloader.sh", "$rootDir/example.env", "$rootDir/app/build/libs")
    into(file("$rootDir/dist"))

    rename("example.env", ".env")
    rename("([^a-zA-Z]+).jar", ".jar")

}

tasks.register<Zip>("package") {
    dependsOn("release")
    archiveFileName.set("ona-downloader.zip")
    destinationDirectory.set(layout.buildDirectory.dir("$rootDir/release"))

    from(layout.buildDirectory.dir("$rootDir/dist"))
}

tasks.withType<Delete> {
    delete("$rootDir/release")
    delete("$rootDir/dist")
}

dependencies {
    implementation(project(":config"))
    implementation(project(":core"))
    implementation(project(":enums"))
    implementation(project(":database"))

    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")

    developmentOnly("org.springframework.boot:spring-boot-devtools")

    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }
}