import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    id("org.springframework.boot")

    kotlin("jvm")
    kotlin("plugin.spring")
    kotlin("plugin.jpa")
}

val mysqlVersion: String by extra

tasks.getByName<BootJar>("bootJar") {
    enabled = false
}

tasks.getByName<Jar>("jar") {
    enabled = true
}

dependencies {
    implementation(project(":enums"))

    implementation(kotlin("reflect"))
    implementation(kotlin("stdlib-jdk8"))

    api("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("com.h2database:h2")
    implementation("org.liquibase:liquibase-core:4.0.0")
    implementation("mysql:mysql-connector-java:8.0.33")
}