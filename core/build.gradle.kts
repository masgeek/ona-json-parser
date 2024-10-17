import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    id("org.springframework.boot")
    kotlin("jvm")
    kotlin("plugin.spring")
}

tasks.getByName<BootJar>("bootJar") {
    enabled = false
}

tasks.getByName<Jar>("jar") {
    enabled = true
}

dependencies {

    implementation(project(":config"))
    implementation(project(":database"))
    implementation(project(":forms"))

    implementation(kotlin("reflect"))
    implementation(kotlin("stdlib"))
    implementation(kotlin("stdlib-jdk8"))

    implementation("org.springframework.boot:spring-boot-starter-web")

//    api("org.springframework.boot:spring-boot-starter-data-jpa")
//    api("org.springframework.security:spring-security-crypto")
//    api("org.springframework.boot:spring-boot-starter-validation")
    api("org.springframework.boot:spring-boot-starter-validation")

//    implementation("org.simpleflatmapper:sfm-csv:8.2.3")

    // https://mvnrepository.com/artifact/com.fasterxml.jackson.dataformat/jackson-dataformat-csv
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-csv:2.13.0")


    implementation("com.googlecode.libphonenumber:libphonenumber:8.13.48")

    api("commons-codec:commons-codec:1.15")
    api("com.github.rozidan:modelmapper-spring-boot-starter:2.3.1")

    implementation("com.opencsv:opencsv:5.5.2")

    implementation("org.apache.commons:commons-collections4:4.4")

    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}
