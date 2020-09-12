package com.tsobu.ona.app

import com.tsobu.ona.core.service.ScoreWeedControlService
import org.slf4j.LoggerFactory
import org.springframework.boot.Banner
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories


@SpringBootApplication
@ComponentScan("com.tsobu.ona")
@EntityScan("com.tsobu.ona.database.entities")
@EnableJpaRepositories("com.tsobu.ona.database.repositories")
class OnaApplication(
        private val myService: ScoreWeedControlService
) : CommandLineRunner {
    private val log = LoggerFactory.getLogger(OnaApplication::class.java)


    override fun run(vararg args: String?) {
        log.info("Running Spring Boot Application press CTR-C to kill the application");

        myService.readScores()
    }
}

fun main(args: Array<String>) {
    val app = SpringApplication(OnaApplication::class.java)
    app.setBannerMode(Banner.Mode.CONSOLE)
    runApplication<OnaApplication>(*args)
}
