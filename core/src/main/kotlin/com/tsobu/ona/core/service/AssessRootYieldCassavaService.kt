package com.tsobu.ona.core.service


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.forms.rootyieldcassava.AssesRootYieldCassava
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.database.entities.RootYieldCassavaAc
import com.tsobu.ona.database.entities.RootYieldCassavaAcYieldAssessment
import com.tsobu.ona.database.entities.ScoreWeedControlAcWd
import com.tsobu.ona.database.repositories.RootYieldCassavaAcRepo
import com.tsobu.ona.database.repositories.RootYieldCassavaAcYieldAssessmentRepo
import org.modelmapper.AbstractCondition
import org.modelmapper.Condition
import org.modelmapper.ModelMapper
import org.modelmapper.convention.MatchingStrategies
import org.modelmapper.spi.MappingContext
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.transaction.PlatformTransactionManager
import org.springframework.transaction.TransactionStatus
import org.springframework.transaction.support.TransactionTemplate
import java.io.IOException
import java.nio.file.Paths
import kotlin.collections.ArrayList


@Service
class AssessRootYieldCassavaService
constructor(
        transactionManager: PlatformTransactionManager,
        val yieldCassavaRepo: RootYieldCassavaAcRepo,
        val yieldAssessmentRepo: RootYieldCassavaAcYieldAssessmentRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(AssessRootYieldCassavaService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)


    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset(fileName: String) {
        val filePath = "${appConfig.globalProperties().folderPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<AssesRootYieldCassava>>() {})

        val data = ArrayList<RootYieldCassavaAc>()
        val yieldAssesmentData = ArrayList<RootYieldCassavaAcYieldAssessment>()
        val weedWdData = ArrayList<ScoreWeedControlAcWd>()

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

        val result = transactionTemplate.execute { status: TransactionStatus? ->

            list.forEach { myVal ->
                //map and save to database
                val geoPoint = myDateUtil.splitGeoPoint(myVal.geopoint)
                val yieldCassavaEntity = RootYieldCassavaAc()
                if (geoPoint.isNotEmpty()) {
                    yieldCassavaEntity.geoPointLatitude = geoPoint[0].toDouble()

                    if (myDateUtil.indexExists(geoPoint, 1)) {
                        yieldCassavaEntity.geoPointLongitude = geoPoint[1].toDouble()
                    }
                    if (myDateUtil.indexExists(geoPoint, 2)) {
                        yieldCassavaEntity.geoPointAltitude = geoPoint[2].toDouble()
                    }
                    if (myDateUtil.indexExists(geoPoint, 3)) {
                        yieldCassavaEntity.geoPointAccuracy = geoPoint[3].toDouble()
                    }
                }
                yieldCassavaEntity.uuid = myVal.formhubUuid
                yieldCassavaEntity.submissionDate = myDateUtil.convertToDateTime(myVal.submissionTime)
                yieldCassavaEntity.todayDate = myDateUtil.convertToDate(myVal.today)
                yieldCassavaEntity.startDate = myDateUtil.convertToDateTime(myVal.start)
                yieldCassavaEntity.endDate = myDateUtil.convertToDateTime(myVal.end)
                yieldCassavaEntity.setOfYieldAssessment = "${myVal.metaInstanceID}/yieldAssessment"
                yieldCassavaEntity.instanceId = myVal.metaInstanceID
                yieldCassavaEntity.controlKey = myVal.metaInstanceID

                yieldCassavaEntity.rootEntity = myVal.entity
                yieldCassavaEntity.diseaseScoring = myVal.detailDiseaseScoring
                yieldCassavaEntity.rootQuality = myVal.detailRootQuality
                yieldCassavaEntity.sampling = myVal.detailSampling
                yieldCassavaEntity.fixedSize = myVal.plotSizeFixed
                yieldCassavaEntity.densityFixed = myVal.fixedDensityFixed
                yieldCassavaEntity.rootMethod = myVal.method
                yieldCassavaEntity.nrRowsFixed = myVal.fixedNrRowsFixed
                yieldCassavaEntity.nrPlantsRowFixed = myVal.fixedNrPlantsRowFixed
                yieldCassavaEntity.densityFixedCalc = myVal.densityFixedCalc
                yieldCassavaEntity.maxStandFixed = myVal.maxStandFixed
                yieldCassavaEntity.plotSizeFixed = myVal.plotSizeFixed



                yieldCassavaEntity.deviceId = myVal.deviceid
                yieldCassavaEntity.subscriberId = myVal.subscriberid
                yieldCassavaEntity.email = myVal.email
                yieldCassavaEntity.username = myVal.username
                yieldCassavaEntity.simSerial = myVal.simserial
                yieldCassavaEntity.phoneNumber = myVal.phonenumber
                yieldCassavaEntity.project = myVal.purposeProject
                yieldCassavaEntity.country = myVal.purposeCountry
                yieldCassavaEntity.login = myVal.login
                data.add(yieldCassavaEntity)

                log.info("Added data to list ${yieldCassavaEntity.controlKey}")

                //evaluate the yield assesment
                val yieldAssessmentList = myVal.yieldAssessment
                var assesmentCount = 1
                yieldAssessmentList?.forEach { ya ->
//                    val yieldAssessment = RootYieldCassavaAcYieldAssessment()
                    val yieldAssessment = modelMapper.map(ya, RootYieldCassavaAcYieldAssessment::class.java)

                    yieldAssessment.plotId = ya.yieldAssessmentPlotId
//                    yieldAssessment.plantId = ya.plantID
//                    yieldAssessment.tuberizedRootsNr = ya.tuberizedRootsNr
//                    yieldAssessment.tuberizedRootsFw = ya.tuberizedRootsFw
//                    yieldAssessment.tuberizedDiseasedRootsFw = ya.tuberizedDiseasedRootsFw
//                    yieldAssessment.tuberizedSmallRootsFw = ya.tuberizedSmallRootsFw
//                    yieldAssessment.tuberizedMarketableRootsFw = ya.tuberizedMarketableRootsFw
//                    yieldAssessment.tuberizedRootsFwSs = ya.tuberizedRootsFwSs
//                    yieldAssessment.plantSampleIdTuberizedRoots = ya.plantSampleIDTuberizedRoots
//                    yieldAssessment.tuberizedSmallRootsFwSs = ya.tuberizedSmallRootsFwSs
                    yieldAssessment.parentKey = yieldCassavaEntity.controlKey
                    yieldAssessment.controlKey = "${yieldCassavaEntity.setOfYieldAssessment}[$assesmentCount]"
                    yieldAssessment.setOfYieldAssessment = yieldCassavaEntity.setOfYieldAssessment

                    log.info("Added >>> ${yieldAssessment.plotId}: ${yieldAssessment.plantId} with for assessment being $assesmentCount")
                    assesmentCount = assesmentCount.plus(1)
                    yieldAssesmentData.add(yieldAssessment)
                }
            }

            log.info("Saving all the data to the database now")
            yieldCassavaRepo.saveAll(data)
            yieldAssessmentRepo.saveAll(yieldAssesmentData)
            log.info("Finished saving the data for $fileName------->")
        }
    }
}