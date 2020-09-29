package com.tsobu.ona.core.service.greenbiomass


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.forms.greenbiomass.YieldCassavaAcForm
import com.tsobu.ona.core.dto.json.addsample.AcDto
import com.tsobu.ona.core.dto.json.addsample.AcSampleDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.greenbiomass.YieldCassEntity
import com.tsobu.ona.database.entities.greenbiomass.YieldCassYaEntity
import com.tsobu.ona.database.entities.monitorval.MonitorValEntity
import com.tsobu.ona.database.repositories.greenbiomass.YieldCassRepo
import com.tsobu.ona.database.repositories.greenbiomass.YieldCassYaRepo
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
class GreenBiomassService
constructor(
        transactionManager: PlatformTransactionManager,
        val yieldCassRepo: YieldCassRepo,
        val yieldCassYaRepo: YieldCassYaRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(GreenBiomassService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()
    fun mapJsonFile() {
        log.info("Reading table data....")
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

        val filePath = "${appConfig.globalProperties().outputPath}"
        val acEntityList = yieldCassRepo.findAllByOrderBySubmissionDateAsc()
        val acSampleList = yieldCassYaRepo.findAll()


        val acData = acEntityList.map { acEntity ->
            val acDto = modelMapper.map(acEntity, AcDto::class.java)
            acDto.submissionDate = myDateUtil.convertTimeToString(acEntity.submissionDate)
            acDto.start = myDateUtil.convertTimeToString(acEntity.startDate)
            acDto.end = myDateUtil.convertTimeToString(acEntity.endDate)
            acDto
        }

        val acSampleData = acSampleList.map { acSampleEntity ->
            val acDto = modelMapper.map(acSampleEntity, AcSampleDto::class.java)
            acDto
        }

        writeCsvFile.writeCsv(pojoType = AcDto::class.java, data = acData, fileName = "Add_Sample_Label_AC", outPutPath = filePath)
        writeCsvFile.writeCsv(pojoType = AcSampleDto::class.java, data = acSampleData, fileName = "Add_Sample_Label_AC-sample", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset(fileName: String) {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<YieldCassavaAcForm>>() {})

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

        val yieldCassData = ArrayList<YieldCassEntity>()
        val yieldCassYaData = ArrayList<YieldCassYaEntity>()
        list.forEach { cassavaAcForm ->
            //map and save to database
            val yieldCassEntity = modelMapper.map(cassavaAcForm, YieldCassEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(cassavaAcForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                yieldCassEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    yieldCassEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    yieldCassEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    yieldCassEntity.geoPointAccuracy = geoPoint[3]
                }
            }

            yieldCassEntity.uuid = cassavaAcForm.formhubUuid
            yieldCassEntity.submissionDate = myDateUtil.convertToDateTime(cassavaAcForm.submissionTime)
            yieldCassEntity.todayDate = myDateUtil.convertToDate(cassavaAcForm.today)
            yieldCassEntity.startDate = myDateUtil.convertToDateTime(cassavaAcForm.start)
            yieldCassEntity.endDate = myDateUtil.convertToDateTime(cassavaAcForm.end)
            yieldCassEntity.instanceId = cassavaAcForm.metaInstanceID
            yieldCassEntity.controlKey = cassavaAcForm.metaInstanceID
            yieldCassEntity.setOfYieldAssessment = "${yieldCassEntity.controlKey}/yieldAssessment"

            yieldCassData.add(yieldCassEntity)

            val yieldAssessmentList = cassavaAcForm.yieldAssessmentList
            var yieldAssessmentCounter = 1
            yieldAssessmentList.forEach { assessmentForm ->
                val cassYaEntity = modelMapper.map(assessmentForm, YieldCassYaEntity::class.java)
                cassYaEntity.parentKey = yieldCassEntity.controlKey
                cassYaEntity.setOfYieldAssessment = "${yieldCassEntity.controlKey}/yieldAssessment"
                cassYaEntity.controlKey = "${yieldCassEntity.controlKey}/yieldAssessment[$yieldAssessmentCounter]"

                yieldAssessmentCounter = yieldAssessmentCounter.plus(1)
                yieldCassYaData.add(cassYaEntity)
            }
        }


//        yieldCassRepo.saveAll(yieldCassData)
        yieldCassYaRepo.saveAll(yieldCassYaData)

        log.info("Finished saving the data for $fileName------->")
    }
}