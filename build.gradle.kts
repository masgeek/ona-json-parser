import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        mavenCentral()
        mavenLocal()
//        jcenter()
    }
}

plugins {
    val kotlinVersion = "1.6.0"
    val springVersion = "2.6.1"

    id("org.springframework.boot") version springVersion apply false
    id("io.spring.dependency-management") version "1.0.10.RELEASE" apply false
    id("name.remal.check-updates") version "1.0.211" apply false

    kotlin("jvm") version kotlinVersion apply false
    kotlin("plugin.spring") version kotlinVersion apply false
    kotlin("plugin.jpa") version kotlinVersion apply false
}


allprojects {
    val versionTag: String = System.getenv("RELEASE_VERSION") ?: "2.0.1"

    group = "com.tsobu"
    version = versionTag


    tasks.withType<JavaCompile> {
        sourceCompatibility = "1.8"
        targetCompatibility = "1.8"
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "1.8"
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
        maven {
            url = uri("https://jitpack.io")
        }
    }
    apply {
        plugin("io.spring.dependency-management")
        plugin("name.remal.check-updates")
    }
}
