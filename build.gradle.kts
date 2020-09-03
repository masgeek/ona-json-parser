buildscript {
    repositories {
        mavenCentral()
        mavenLocal()
        jcenter()
    }
}

plugins {
    val kotlinVersion = "1.4.0"
    kotlin("jvm") version kotlinVersion apply false

    id("name.remal.check-updates") version "1.0.211" apply false
}

allprojects {
    group = "com.tsobu"
    version = "1.0.0"

    tasks.withType<JavaCompile> {
        sourceCompatibility = "11"
        targetCompatibility = "11"
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "11"
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}

subprojects {
    repositories {
        mavenCentral()
        mavenLocal()
    }
    apply {
        plugin("name.remal.check-updates")
    }
}
