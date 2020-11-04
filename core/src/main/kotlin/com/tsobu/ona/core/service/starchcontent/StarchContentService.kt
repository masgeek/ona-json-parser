package com.tsobu.ona.core.service.starchcontent


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.starchcontent.AssessStarchDto
import com.tsobu.ona.core.dto.json.starchcontent.StarchContentAcDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.starchcontent.AssessStarchContentAcEntity
import com.tsobu.ona.database.entities.starchcontent.AssessStarchEntity
import com.tsobu.ona.database.repositories.starchcontent.AssessStarchContentAcRepo
import com.tsobu.ona.database.repositories.starchcontent.AssessStarchRepo
import com.tsobu.ona.forms.starchcontent.AssessStarchContentAcForm
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
class StarchContentService
constructor(
        transactionManager: PlatformTransactionManager,
        val starchContentAcRepo: AssessStarchContentAcRepo,
        val assessStarchRepo: AssessStarchRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(StarchContentService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()
    private val fileName = "Assess_Starch_Content_AC.json"
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
        val acEntityList = starchContentAcRepo.findAllByOrderBySubmissionDateAsc()
        val acSampleList = assessStarchRepo.findAll()


        val yieldCassAcData = acEntityList.map { starchContentAcEntity ->
            val starchContentAcDto = modelMapper.map(starchContentAcEntity, StarchContentAcDto::class.java)
            starchContentAcDto.submissionDate = myDateUtil.convertTimeToString(starchContentAcEntity.submissionDate)
            starchContentAcDto.start = myDateUtil.convertTimeToString(starchContentAcEntity.startDate)
            starchContentAcDto.end = myDateUtil.convertTimeToString(starchContentAcEntity.endDate)
            starchContentAcDto
        }

        val assessStarchData = acSampleList.map { assessStarchEntity ->
            val assessStarchDto = modelMapper.map(assessStarchEntity, AssessStarchDto::class.java)
            assessStarchDto
        }


        writeCsvFile.writeCsv(classMap = StarchContentAcDto::class.java, data = yieldCassAcData,
                fileName = "Assess_Starch_Content_AC", outPutPath = filePath)

        writeCsvFile.writeCsv(classMap = AssessStarchDto::class.java, data = assessStarchData,
                fileName = "Assess_Starch_Content_AC-assessStarch", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<AssessStarchContentAcForm>>() {})

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

        val starchContentAcData = ArrayList<AssessStarchContentAcEntity>()
        val assessStarchData = ArrayList<AssessStarchEntity>()
        list.forEach { starchContentAcForm ->
            //map and save to database
            val starchContentAcEntity = modelMapper.map(starchContentAcForm, AssessStarchContentAcEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(starchContentAcForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                starchContentAcEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    starchContentAcEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    starchContentAcEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    starchContentAcEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            starchContentAcEntity.uuid = starchContentAcForm.formhubUuid
            starchContentAcEntity.submissionDate = myDateUtil.convertToDateTime(starchContentAcForm.submissionTime)
            starchContentAcEntity.todayDate = myDateUtil.convertToDate(starchContentAcForm.today)
            starchContentAcEntity.startDate = myDateUtil.convertToDateTime(starchContentAcForm.start)
            starchContentAcEntity.endDate = myDateUtil.convertToDateTime(starchContentAcForm.end)
            starchContentAcEntity.instanceId = starchContentAcForm.metaInstanceID
            starchContentAcEntity.controlKey = starchContentAcForm.metaInstanceID
            starchContentAcEntity.setOfAssessStarch = "${starchContentAcEntity.controlKey}/assessStarch"

            starchContentAcData.add(starchContentAcEntity)
            log.info("Added data to table ${starchContentAcEntity.controlKey} with surname as ${starchContentAcForm.xformIdString}")

            val assessStarchList = starchContentAcForm.assessStarchList
            var assessStarchCounter = 1
            modelMapper.configuration.matchingStrategy = MatchingStrategies.STRICT
            assessStarchList?.forEach { acSample ->
                val yieldCassAcYaEntity = modelMapper.map(acSample, AssessStarchEntity::class.java)
                yieldCassAcYaEntity.parentKey = starchContentAcEntity.controlKey
                yieldCassAcYaEntity.controlKey = "${starchContentAcEntity.controlKey}/assessStarch[$assessStarchCounter]"
                yieldCassAcYaEntity.setOfAssessStarch = "${starchContentAcEntity.controlKey}/assessStarch"

                assessStarchCounter = assessStarchCounter.plus(1)
                assessStarchData.add(yieldCassAcYaEntity)
            }
        }

        starchContentAcRepo.saveAll(starchContentAcData)
        assessStarchRepo.saveAll(assessStarchData)

        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}