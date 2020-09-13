package com.tsobu.ona.app

import com.tsobu.ona.core.service.AssessRootYieldCassavaService
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
        private val weedControlService: ScoreWeedControlService,
        private val yieldCassavaService: AssessRootYieldCassavaService
) : CommandLineRunner {
    override fun run(vararg args: String?) {
        log.info("Running Spring Boot Application press CTR-C to kill the application");

        weedControlService.readJsonAsset(fileName = "Score_Weed_Control_AC.json")
        yieldCassavaService.readJsonAsset(fileName = "Assess_Root_Yield_Cassava_AC.json")


        weedControlService.mapJsonFile()
        yieldCassavaService.mapJsonFile()
    }


    private val log = LoggerFactory.getLogger(OnaApplication::class.java)

}

fun main(args: Array<String>) {
    val app = SpringApplication(OnaApplication::class.java)
    app.setBannerMode(Banner.Mode.CONSOLE)
    runApplication<OnaApplication>(*args)
}
