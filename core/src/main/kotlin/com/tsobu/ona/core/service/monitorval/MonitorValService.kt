package com.tsobu.ona.core.service.monitorval


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.forms.monitorval.MonitorValForm
import com.tsobu.ona.core.dto.json.dataval.FrDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.monitorval.*
import com.tsobu.ona.database.entities.valsphstz.SzEntity
import com.tsobu.ona.database.repositories.monitorval.*
import org.modelmapper.AbstractCondition
import org.modelmapper.Condition
import org.modelmapper.ModelMapper
import org.modelmapper.convention.MatchingStrategies
import org.modelmapper.spi.MappingContext
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.transaction.PlatformTransactionManager
import org.springframework.transaction.support.TransactionTemplate
import java.io.IOException
import java.nio.file.Paths


@Service
class MonitorValService
constructor(
        transactionManager: PlatformTransactionManager,
        val monitorValRepo: MonitorValRepo,
        val installCorrectDetailsRepo: InstallCorrectDetailsRepo,
        val leafSampleRepo: LeafSampleRepo,
        val maizePlantHeightRepo: MaizePlantHeightRepo,
        val phRepo: PhRepo,
        val plotLayoutRepo: PlotLayoutRepo,
        val trialRatingSomeRepo: TrialRatingSomeRepo,
        val problemPlotSomeRepo: ProblemPlotSomeRepo,
        val soilSampleRepo: SoilSampleRepo,
        val trialQualitySomeRepo: TrialQualitySomeRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(MonitorValService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()
    fun mapJsonFile() {
        log.info("Reading table data....")
        val frList = monitorValRepo.findAllByOrderBySubmissionDateAsc()

        val isStringBlank: Condition<*, *> = object : AbstractCondition<Any?, Any?>() {
            override fun applies(context: MappingContext<Any?, Any?>): Boolean {
                return if (context.source is String) {
                    null != context.source && "" != context.source
                } else {
                    context.source != null
                }
            }
        }

        modelMapper.configuration.propertyCondition = isStringBlank
        modelMapper.configuration.isSkipNullEnabled = true
        modelMapper.configuration.isAmbiguityIgnored = true
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT

        val monitorValData = frList.map { monitorValEntity ->
            val sphsTzSzDto = modelMapper.map(monitorValEntity, FrDto::class.java)
            sphsTzSzDto.submissionDate = myDateUtil.convertTimeToString(monitorValEntity.submissionDate)
            sphsTzSzDto.startDate = myDateUtil.convertTimeToString(monitorValEntity.startDate)
            sphsTzSzDto.endDate = myDateUtil.convertTimeToString(monitorValEntity.endDate)
            sphsTzSzDto
        }

        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(pojoType = FrDto::class.java, data = monitorValData, fileName = "dataVAL_FR", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset(fileName: String) {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<MonitorValForm>>() {})

        val data = ArrayList<SzEntity>()
        val isStringBlank: Condition<*, *> = object : AbstractCondition<Any?, Any?>() {
            override fun applies(context: MappingContext<Any?, Any?>): Boolean {
                return if (context.source is String) {
                    null != context.source && "" != context.source
                } else {
                    context.source != null
                }
            }
        }

        modelMapper.configuration.propertyCondition = isStringBlank
        modelMapper.configuration.isSkipNullEnabled = true
        modelMapper.configuration.isAmbiguityIgnored = true
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val monitorValEntityData = ArrayList<MonitorValEntity>()
        val correctDetailEntityData = ArrayList<InstallCorrectDetailsEntity>()
        val leafSampleEntityData = ArrayList<LeafSampleEntity>()
        val maizePlantHeightEntityData = ArrayList<MaizePlantHeightEntity>()
        val phEntityData = ArrayList<PhEntity>()
        val plotLayoutData = ArrayList<PlotLayoutEntity>()
        val trialRatingSomeData = ArrayList<TrialRatingSomeEntity>()
        val plotSomeEntityData = ArrayList<ProblemPlotSomeEntity>()
        val soilSampleEntityData = ArrayList<SoilSampleEntity>()
        val trialQualitySomeData = ArrayList<TrialQualitySomeEntity>()
        list.forEach { myVal ->
            //map and save to database
            val geoPoint = myDateUtil.splitGeoPoint(myVal.geopoint)
            val monitorValEntity = modelMapper.map(myVal, MonitorValEntity::class.java)
            if (geoPoint.isNotEmpty()) {
                monitorValEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    monitorValEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    monitorValEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    monitorValEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            monitorValEntity.uuid = myVal.formhubUuid
            monitorValEntity.submissionDate = myDateUtil.convertToDateTime(myVal.submissionTime)
            monitorValEntity.todayDate = myDateUtil.convertToDate(myVal.today)
            monitorValEntity.startDate = myDateUtil.convertToDateTime(myVal.start)
            monitorValEntity.endDate = myDateUtil.convertToDateTime(myVal.end)
            monitorValEntity.instanceId = myVal.metaInstanceID
            monitorValEntity.controlKey = myVal.metaInstanceID

            monitorValEntity.setOfPlotLayout = "${monitorValEntity.controlKey}/plotLayout"
            monitorValEntity.setOfMaizePlantHeight = "${monitorValEntity.controlKey}/maizePlantHeight"
            monitorValEntity.setOfSoilsample = "${monitorValEntity.controlKey}/soilSample"
            monitorValEntity.setOfLeafsample = "${monitorValEntity.controlKey}/leafSample"

            monitorValEntityData.add(monitorValEntity)

            val correctDetailsList = myVal.installCorrectDetails
            var correctDetailsCounter = 1
            correctDetailsList?.forEach { correctDetail ->
                val correctDetailEntity = modelMapper.map(correctDetail, InstallCorrectDetailsEntity::class.java)
                correctDetailEntity.parentKey = monitorValEntity.controlKey
                correctDetailEntity.controlKey = "${correctDetailEntity.parentKey}/installCorrectDetails[$correctDetailsCounter]"
                correctDetailEntity.setOfInstallCorrectDetails = "${correctDetailEntity.parentKey}/installCorrectDetails"

                correctDetailsCounter = correctDetailsCounter.plus(1)
                correctDetailEntityData.add(correctDetailEntity)
            }

            val leafSampleList = myVal.leafSample
            var leafSampleCounter = 1
            modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT
            leafSampleList?.forEach { leafSample ->
                val leafSampleEntity = modelMapper.map(leafSample, LeafSampleEntity::class.java)
                leafSampleEntity.parentKey = monitorValEntity.controlKey
                leafSampleEntity.plantSampleId = leafSample.plantSampleId
                leafSampleEntity.controlKey = "${leafSampleEntity.parentKey}/leafSample[$leafSampleCounter]"
                leafSampleEntity.setOfLeafSample = "${leafSampleEntity.parentKey}/leafSample"

                leafSampleCounter = leafSampleCounter.plus(1)
                leafSampleEntityData.add(leafSampleEntity)
            }

            val maizePlantHeightList = myVal.maizePlantHeight
            var maizePlantHeightCounter = 1
            modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD
            maizePlantHeightList?.forEach { maizePlantHeight ->
                val plantHeightEntity = modelMapper.map(maizePlantHeight, MaizePlantHeightEntity::class.java)
                plantHeightEntity.parentKey = monitorValEntity.controlKey
                plantHeightEntity.controlKey = "${plantHeightEntity.parentKey}/maizePlantHeight[$maizePlantHeightCounter]"
                plantHeightEntity.setOfPh = "${plantHeightEntity.parentKey}/maizePlantHeight[$maizePlantHeightCounter]/PH"
                plantHeightEntity.setOfMaizePlantHeight = "${plantHeightEntity.parentKey}/maizePlantHeight"

                maizePlantHeightCounter = maizePlantHeightCounter.plus(1)
                maizePlantHeightEntityData.add(plantHeightEntity)

                //insert the ph stuff
                var phCounter = 1
                val maizePlantPhList = maizePlantHeight.maizePlantHeightPh
                maizePlantPhList?.forEach { maizePlantHeightPh ->
                    val phEntity = modelMapper.map(maizePlantHeightPh, PhEntity::class.java)
                    phEntity.parentKey = plantHeightEntity.controlKey
                    phEntity.controlKey = "${plantHeightEntity.controlKey}/PH[$phCounter]"
                    phEntity.setOfPh = "${plantHeightEntity.controlKey}/PH"

                    phCounter = phCounter.plus(1)
                    phEntityData.add(phEntity)
                }
            }

            val plotLayoutList = myVal.plotLayout
            var plotLayoutCounter = 1
            modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD
            plotLayoutList?.forEach { plotLayout ->
                val plotLayoutEntity = modelMapper.map(plotLayout, PlotLayoutEntity::class.java)
                plotLayoutEntity.parentKey = monitorValEntity.controlKey
                plotLayoutEntity.controlKey = "${plotLayoutEntity.parentKey}/plotLayout[$plotLayoutCounter]"
                plotLayoutEntity.setOfPlotLayout = "${plotLayoutEntity.parentKey}/plotLayout"

                plotLayoutCounter = plotLayoutCounter.plus(1)
                plotLayoutData.add(plotLayoutEntity)
            }

            val trialRatingSomeList = myVal.trialRatingSome
            var trialRatingSomeCounter = 1
            modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD
            trialRatingSomeList?.forEach { trialRatingSome ->
                val trialRatingSomeEntity = modelMapper.map(trialRatingSome, TrialRatingSomeEntity::class.java)
                trialRatingSomeEntity.parentKey = monitorValEntity.controlKey
                trialRatingSomeEntity.controlKey = "${trialRatingSomeEntity.parentKey}/trialRating_Some[$trialRatingSomeCounter]"
                trialRatingSomeEntity.setOfProblemPlotSome = "${trialRatingSomeEntity.parentKey}/trialRating_Some[$trialRatingSomeCounter]/problemPlot_Some"
                trialRatingSomeEntity.setOfTrialRatingSome = "${trialRatingSomeEntity.parentKey}/trialRating_Some"

                trialRatingSomeCounter = trialRatingSomeCounter.plus(1)
                trialRatingSomeData.add(trialRatingSomeEntity)
                val problemPlotSomeList = trialRatingSome.problemPlotSome
                var plotSomeCounter = 1
                problemPlotSomeList?.forEach { problemPlotSome ->
                    val problemPlotSomeEntity = modelMapper.map(problemPlotSome, ProblemPlotSomeEntity::class.java)
                    problemPlotSomeEntity.parentKey = trialRatingSomeEntity.controlKey
                    problemPlotSomeEntity.setOfProblemPlotSome = "${problemPlotSomeEntity.parentKey}/problemPlot_Some"
                    problemPlotSomeEntity.controlKey = "${problemPlotSomeEntity.parentKey}/problemPlot_Some[$plotSomeCounter]"

                    plotSomeCounter = plotSomeCounter.plus(1)
                    plotSomeEntityData.add(problemPlotSomeEntity)
                }
            }

            val soilSampleList = myVal.soilSample
            var soilSampleCounter = 1
            modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT
            soilSampleList?.forEach { soilSample ->
                val soilSampleEntity = modelMapper.map(soilSample, SoilSampleEntity::class.java)
                soilSampleEntity.parentKey = monitorValEntity.controlKey
                soilSampleEntity.controlKey = "${soilSampleEntity.parentKey}/soilSample[$soilSampleCounter]"
                soilSampleEntity.setOfSoilSample = "${soilSampleEntity.parentKey}/soilSample"

                soilSampleCounter = soilSampleCounter.plus(1)
                soilSampleEntityData.add(soilSampleEntity)
            }

            val trialQualitySomeList = myVal.trialQualitySome
            var trialQualitySomeCounter = 1
            modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD
            trialQualitySomeList?.forEach { trialQualitySome ->
                val trialQualitySomeEntity = modelMapper.map(trialQualitySome, TrialQualitySomeEntity::class.java)
                trialQualitySomeEntity.parentKey = monitorValEntity.controlKey
                trialQualitySomeEntity.controlKey = "${trialQualitySomeEntity.parentKey}/trialQuality_Some[$trialQualitySomeCounter]"
                trialQualitySomeEntity.setOfTrialQualitySome = "${trialQualitySomeEntity.parentKey}/trialQuality_Some"

                trialQualitySomeCounter = trialQualitySomeCounter.plus(1)
                trialQualitySomeData.add(trialQualitySomeEntity)
            }

        }

//        monitorValRepo.saveAll(monitorValEntityData)
//        installCorrectDetailsRepo.saveAll(correctDetailEntityData)
//        leafSampleRepo.saveAll(leafSampleEntityData)
//        maizePlantHeightRepo.saveAll(maizePlantHeightEntityData)
//        phRepo.saveAll(phEntityData)
//        plotLayoutRepo.saveAll(plotLayoutData)
//        trialRatingSomeRepo.saveAll(trialRatingSomeData)
//        problemPlotSomeRepo.saveAll(plotSomeEntityData)
//        soilSampleRepo.saveAll(soilSampleEntityData)
        trialQualitySomeRepo.saveAll(trialQualitySomeData)

        log.info("Finished saving the data for $fileName------->")
    }
}