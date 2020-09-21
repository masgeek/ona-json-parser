package com.tsobu.ona.app

import com.tsobu.ona.core.service.AssessRootYieldCassavaService
import com.tsobu.ona.core.service.ScoreWeedControlService
import com.tsobu.ona.core.service.dataval.FrService
import com.tsobu.ona.core.service.datavalsphs.SphsService
import com.tsobu.ona.core.service.valsphstz.EzService
import com.tsobu.ona.core.service.valsphstz.LzeService
import com.tsobu.ona.core.service.valsphstz.LzwService
import com.tsobu.ona.core.service.valsphstz.SzService
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
        private val yieldCassavaService: AssessRootYieldCassavaService,
        private val szService: SzService,
        private val ezService: EzService,
        private val lzwService: LzwService,
        private val lzeService: LzeService,
        private val sphsService: SphsService,
        private val frService: FrService
) : CommandLineRunner {
    private val log = LoggerFactory.getLogger(OnaApplication::class.java)

    override fun run(vararg args: String?) {
        log.info("Running Spring Boot Application press CTR-C to close the application");

//        weedControlService.readJsonAsset(fileName = "Score_Weed_Control_AC.json")
//        yieldCassavaService.readJsonAsset(fileName = "Assess_Root_Yield_Cassava_AC.json")
//        valSphsTzSzService.readJsonAsset(fileName = "VAL_SPHS_TZSZ.json")
//        dataValSphsService.readJsonAsset(fileName = "dataVAL_SPHS.json")
//        ezService.readJsonAsset(fileName = "VAL_SPHS_TZEZ.json")
//        lzwService.readJsonAsset(fileName = "VAL_SPHS_TZLZW.json")
//        lzeService.readJsonAsset(fileName = "VAL_SPHS_TZLZE.json")
        frService.readJsonAsset(fileName = "dataVAL_FR.json")


//        weedControlService.mapJsonFile()
//        yieldCassavaService.mapJsonFile()
//        valSphsTzSzService.mapJsonFile()
//        dataValSphsService.mapJsonFile()
//        ezService.mapJsonFile()
//        lzwService.mapJsonFile()
//        lzeService.mapJsonFile()
        frService.mapJsonFile()
    }


}

fun main(args: Array<String>) {
    val app = SpringApplication(OnaApplication::class.java)
    app.setBannerMode(Banner.Mode.CONSOLE)
    runApplication<OnaApplication>(*args)
}
