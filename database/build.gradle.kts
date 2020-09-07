plugins {
    kotlin("jvm")
}


buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.liquibase:liquibase-core:4.0.0")
        classpath("org.liquibase:liquibase-gradle-plugin:2.0.4")
        classpath("mysql:mysql-connector-java:8.0.21")
    }
}


tasks.getByName<Jar>("jar") {
    enabled = true
}

dependencies {
    val jacksonVersion = "2.11.2"

    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation(kotlin("reflect"))
    implementation(kotlin("stdlib"))
    implementation(kotlin("stdlib-jdk8"))

    implementation("org.hibernate:hibernate-core:5.4.21.Final")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}