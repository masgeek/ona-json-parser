package com.tsobu.ona.app

import com.tsobu.ona.core.service.AssessRootYieldCassavaService
import com.tsobu.ona.core.service.CheckIdRegService
import com.tsobu.ona.core.service.ScoreWeedControlService
import com.tsobu.ona.core.service.ValidationService
import com.tsobu.ona.core.service.addsample.AddSampleService
import com.tsobu.ona.core.service.assign.FdAcAssignService
import com.tsobu.ona.core.service.assign.PaAcAssignService
import com.tsobu.ona.core.service.assign.PoAcAssignService
import com.tsobu.ona.core.service.assign.TlAcAssignService
import com.tsobu.ona.core.service.batchcomposition.BatchCompositionService
import com.tsobu.ona.core.service.collect.CollectLeafTagsService
import com.tsobu.ona.core.service.collect.CollectPsService
import com.tsobu.ona.core.service.collect.CollectSsService
import com.tsobu.ona.core.service.confirm.PoConfirmService
import com.tsobu.ona.core.service.dataval.*
import com.tsobu.ona.core.service.greenbiomass.GreenBiomassService
import com.tsobu.ona.core.service.lignifiedstem.LignifiedStemService
import com.tsobu.ona.core.service.monitor.NonDestructiveCassService
import com.tsobu.ona.core.service.monitorval.MonitorValService
import com.tsobu.ona.core.service.partition.PartitionPsService
import com.tsobu.ona.core.service.pool.PoolSampleService
import com.tsobu.ona.core.service.record.CanopyDimensionsService
import com.tsobu.ona.core.service.record.RecordDmService
import com.tsobu.ona.core.service.register.EaService
import com.tsobu.ona.core.service.register.HhService
import com.tsobu.ona.core.service.replace.ReplaceFbService
import com.tsobu.ona.core.service.replace.ReplaceFdService
import com.tsobu.ona.core.service.replace.ReplacePoService
import com.tsobu.ona.core.service.replace.ReplaceTlService
import com.tsobu.ona.core.service.sphs.PraSphsService
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
        private val assessRootYieldCassavaService: AssessRootYieldCassavaService,
        private val szService: SzService,
        private val ezService: EzService,
        private val lzwService: LzwService,
        private val lzeService: LzeService,
        private val sphsService: SphsService,
        private val frService: FrService,
        private val hhService: HhService,
        private val eaService: EaService,
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
        private val cisService: CisService,
        private val poConfirmService: PoConfirmService,
        private val nonDestructiveCassService: NonDestructiveCassService,
        private val partitionPsService: PartitionPsService,
        private val poolSampleService: PoolSampleService,
        private val canopyDimensionsService: CanopyDimensionsService,
        private val recordDmService: RecordDmService,
        private val replacePoService: ReplacePoService,
        private val replaceFbService: ReplaceFbService,
        private val replaceFdService: ReplaceFdService,
        private val replaceTlService: ReplaceTlService,
        private val praSphsService: PraSphsService,
        private val validationService: ValidationService
) : CommandLineRunner {
    private val log = LoggerFactory.getLogger(OnaApplication::class.java)

    override fun run(vararg args: String?) {
        log.info("Running Spring Boot Application press CTR-C to close the application")

//        valPpTzService.readJsonAsset()

        weedControlService.readJsonAsset()
        assessRootYieldCassavaService.readJsonAsset()
        szService.readJsonAsset()
        ezService.readJsonAsset()
        lzwService.readJsonAsset()
        lzeService.readJsonAsset()
        sphsService.readJsonAsset()
        frService.readJsonAsset()
        hhService.readJsonAsset()
        eaService.readJsonAsset()
        ppTzService.readJsonAsset()
        ppService.readJsonAsset()
        monitorValService.readJsonAsset()
        addSampleService.readJsonAsset()
        greenBiomassService.readJsonAsset()
        lignifiedStemService.readJsonAsset()
        starchContentService.readJsonAsset()
        fdAcAssignService.readJsonAsset()
        paAcAssignService.readJsonAsset()
        poAcAssignService.readJsonAsset()
        tlAcAssignService.readJsonAsset()
        checkIdRegService.readJsonAsset()
        collectPsService.readJsonAsset()
        collectSsService.readJsonAsset()
        collectLeafTagsService.readJsonAsset()
        valCisService.readJsonAsset()
        valFrService.readJsonAsset()
        valIcService.readJsonAsset()
        valPpService.readJsonAsset()
        valPpTreatService.readJsonAsset()
        valPpTzService.readJsonAsset()
        valSphsKwService.readJsonAsset()
        batchCompositionService.readJsonAsset()
        valSphsOgService.readJsonAsset()
        valSphsOnService.readJsonAsset()
        valSphsOyService.readJsonAsset()
        icService.readJsonAsset()
        cisService.readJsonAsset()
        poConfirmService.readJsonAsset()
        nonDestructiveCassService.readJsonAsset()
        partitionPsService.readJsonAsset()
        poolSampleService.readJsonAsset()
        canopyDimensionsService.readJsonAsset()
        recordDmService.readJsonAsset()
        replacePoService.readJsonAsset()
        replaceFbService.readJsonAsset()
        replaceFdService.readJsonAsset()
        replaceTlService.readJsonAsset()
        praSphsService.readJsonAsset()

        validationService.processCsvFiles()
        log.info("Hello, Iam finished");
    }


}

fun main(args: Array<String>) {
    val app = SpringApplication(OnaApplication::class.java)
    app.setBannerMode(Banner.Mode.CONSOLE)
    runApplication<OnaApplication>(*args)
}
