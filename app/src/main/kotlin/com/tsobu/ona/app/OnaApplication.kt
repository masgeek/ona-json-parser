package com.tsobu.ona.app

import com.tsobu.ona.core.service.AssessRootYieldCassavaService
import com.tsobu.ona.core.service.CheckIdRegService
import com.tsobu.ona.core.service.ScoreWeedControlService
import com.tsobu.ona.core.service.addsample.AddSampleService
import com.tsobu.ona.core.service.assign.FdAcAssignService
import com.tsobu.ona.core.service.assign.PaAcAssignService
import com.tsobu.ona.core.service.assign.PoAcAssignService
import com.tsobu.ona.core.service.assign.TlAcAssignService
import com.tsobu.ona.core.service.batchcomposition.BatchCompositionService
import com.tsobu.ona.core.service.collect.CollectLeafTagsService
import com.tsobu.ona.core.service.collect.CollectPsService
import com.tsobu.ona.core.service.collect.CollectSsService
import com.tsobu.ona.core.service.dataval.*
import com.tsobu.ona.core.service.datavalsphs.SphsService
import com.tsobu.ona.core.service.greenbiomass.GreenBiomassService
import com.tsobu.ona.core.service.lignifiedstem.LignifiedStemService
import com.tsobu.ona.core.service.monitorval.MonitorValService
import com.tsobu.ona.core.service.register.HhService
import com.tsobu.ona.core.service.starchcontent.StarchContentService
import com.tsobu.ona.core.service.valform.*
import com.tsobu.ona.core.service.valsphs.ValSphsOgService
import com.tsobu.ona.core.service.valsphs.ValSphsOnService
import com.tsobu.ona.core.service.valsphs.ValSphsOyService
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
        private val frService: FrService,
        private val hhService: HhService,
        private val ppTzService: PpTzService,
        private val ppService: PpService,
        private val monitorValService: MonitorValService,
        private val addSampleService: AddSampleService,
        private val greenBiomassService: GreenBiomassService,
        private val lignifiedStemService: LignifiedStemService,
        private val starchContentService: StarchContentService,
        private val fdAcAssignService: FdAcAssignService,
        private val paAcAssignService: PaAcAssignService,
        private val poAcAssignService: PoAcAssignService,
        private val tlAcAssignService: TlAcAssignService,
        private val checkIdRegService: CheckIdRegService,
        private val collectPsService: CollectPsService,
        private val collectSsService: CollectSsService,
        private val collectLeafTagsService: CollectLeafTagsService,
        private val valCisService: ValCisService,
        private val valFrService: ValFrService,
        private val valIcService: ValIcService,
        private val valPpService: ValPpService,
        private val valPpTreatService: ValPpTreatService,
        private val valPpTzService: ValPpTzService,
        private val valSphsKwService: ValSphsKwService,
        private val batchCompositionService: BatchCompositionService,
        private val valSphsOgService: ValSphsOgService,
        private val valSphsOnService: ValSphsOnService,
        private val valSphsOyService: ValSphsOyService,
        private val icService: IcService,
        private val cisService: CisService
) : CommandLineRunner {
    private val log = LoggerFactory.getLogger(OnaApplication::class.java)

    override fun run(vararg args: String?) {
        log.info("Running Spring Boot Application press CTR-C to close the application");

        cisService.readJsonAsset()

//        weedControlService.readJsonAsset(fileName = "Score_Weed_Control_AC.json")
//        yieldCassavaService.readJsonAsset(fileName = "Assess_Root_Yield_Cassava_AC.json")
//        szService.readJsonAsset(fileName = "VAL_SPHS_TZSZ.json")
//        sphsService.readJsonAsset(fileName = "dataVAL_SPHS.json")
//        ezService.readJsonAsset(fileName = "VAL_SPHS_TZEZ.json")
//        lzwService.readJsonAsset(fileName = "VAL_SPHS_TZLZW.json")
//        lzeService.readJsonAsset(fileName = "VAL_SPHS_TZLZE.json")
//        frService.readJsonAsset(fileName = "dataVAL_FR.json")
//        hhService.readJsonAsset(fileName = "Register_HH.json")
//        ppTzService.readJsonAsset(fileName = "dataVAL_PP_TZ.json")
//        ppService.readJsonAsset()
//        monitorValService.readJsonAsset(fileName = "monitorVAL.json")
//        addSampleService.readJsonAsset(fileName = "Add_Sample_Label_AC.json")
//        greenBiomassService.readJsonAsset(fileName = "Assess_GreenBiomass_Yield_Cassava_AC.json")
//        lignifiedStemService.readJsonAsset(fileName = "Assess_LignifiedStem_Yield_Cassava_AC.json")
//        starchContentService.readJsonAsset(fileName = "Assess_Starch_Content_AC.json")
//        fdAcAssignService.readJsonAsset(fileName = "Assign_FD_AC.json")

    }


}

fun main(args: Array<String>) {
    val app = SpringApplication(OnaApplication::class.java)
    app.setBannerMode(Banner.Mode.CONSOLE)
    runApplication<OnaApplication>(*args)
}
