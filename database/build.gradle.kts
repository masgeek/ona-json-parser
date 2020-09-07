plugins {
    kotlin("jvm")
    id("org.liquibase.gradle") version "2.0.4"
}

tasks.getByName<Jar>("jar") {
    enabled = true
}

liquibase {
    activities.register("main") {
        this.arguments = mapOf(
                "logLevel" to "info",
                "changeLogFile" to "src/main/resources/db.changelog.xml",
                "url" to "jdbc:mysql://127.0.0.1:3306/fuelrod",
                "username" to "userName",
                "password" to "secret")
    }
}

tasks.register("dev") {
    // depend on the liquibase status task
    dependsOn("update")
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