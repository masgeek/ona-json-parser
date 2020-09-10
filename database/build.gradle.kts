import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


plugins {
    kotlin("jvm")
    id("org.liquibase.gradle") version "2.0.4"
}

tasks.getByName<Jar>("jar") {
    enabled = true
}

val dbChangeLog = "database/src/main/resources/db/changelog.xml"
//val dbChangeLog = "classpath:db/changelog.xml"

liquibase {
    activities.register("main") {
        this.arguments = mapOf(
                "logLevel" to "info",
                "changeLogFile" to dbChangeLog,
                "url" to "jdbc:mysql://127.0.0.1:3306/ona",
                "username" to "root",
                "password" to "")
    }
}

tasks.register("dev") {
    group = "Tsobu tasks"
    description = "Runs liquidbase migrations"

    // depend on the liquibase status task
    dependsOn("update")
}

val changeName: String? by project
tasks.register("migrate") {
    group = "Tsobu tasks"
    description = "Produces a migration file using date as the name"
}


val generateLiquibaseChangelog by tasks.registering {
    val changeName: String? by project
    if (changeName.isNullOrEmpty()) {
        return@registering
    }
    val date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"))
    val changeSetName = changeName?.replace(" ", "_")?.toLowerCase()
    val user = project.findProperty("author") ?: System.getProperty("user.name")
    val file = File("$projectDir/src/main/resources/db/changelog/${date}_$changeSetName.xml")
    val text = """<?xml version="1.0" encoding="utf-8"?>
<databaseChangeLog
        xmlns="http://www.liquibase.org/xml/ns/dbchangelog"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://www.liquibase.org/xml/ns/dbchangelog http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-3.4.xsd">
    
    <changeSet id="$date" author="$user">

    </changeSet>
</databaseChangeLog>
"""
    file.writeText(text)
}
dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation(kotlin("reflect"))
    implementation(kotlin("stdlib"))
    implementation(kotlin("stdlib-jdk8"))

    implementation("org.liquibase:liquibase-core:4.0.0")
    implementation("org.liquibase:liquibase-gradle-plugin:2.0.4")
    implementation("mysql:mysql-connector-java:8.0.21")

    add("liquibaseRuntime", "org.liquibase:liquibase-core:4.0.0")
    add("liquibaseRuntime", "org.liquibase:liquibase-gradle-plugin:2.0.4")
    add("liquibaseRuntime", "mysql:mysql-connector-java:8.0.21")

    implementation("org.hibernate:hibernate-core:5.4.21.Final")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}