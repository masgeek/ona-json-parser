package com.tsobu.ona.app

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OnaApplication : CommandLineRunner {
    private val log = LoggerFactory.getLogger(OnaApplication::class.java)

    override fun run(vararg args: String?) {
        log.info("Running Spring Boot Application");
        var sb = StringBuilder()
        for (option in args) {
            sb.append(" ").append(option)
            log.info("OPTION: {}", option)
        }
        sb = if (sb.isEmpty()) sb.append("No Options Specified") else sb
        log.info(String.format("JAR launched with following options: %s press CTR-C to kill the application", sb.toString()))
    }
}

fun main(args: Array<String>) {
    runApplication<OnaApplication>(*args)
}
