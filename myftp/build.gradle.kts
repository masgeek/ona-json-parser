import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

plugins {
    id("org.springframework.boot")
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":config"))

    implementation(kotlin("stdlib"))
    implementation(kotlin("stdlib-jdk8"))

//    implementation("commons-net:commons-net:3.8.0")
//    implementation("commons-fileupload:commons-fileupload:1.4")
//    implementation("commons-io:commons-io:20030203.000550")

//    implementation("org.apache.maven.wagon:wagon-ftp:3.4.3")


    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-integration")
    implementation("org.springframework.integration:spring-integration-ftp")
    implementation("org.springframework.integration:spring-integration-sftp")
}