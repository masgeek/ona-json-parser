package com.tsobu.ona.core.service.assign


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.assign.AssignFdAcDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.database.entities.assign.AssignFdAcEntity
import com.tsobu.ona.database.repositories.assign.AssignFdAcRepo
import com.tsobu.ona.forms.assign.AssignFdAcForm
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
class FdAcAssignService
constructor(
        transactionManager: PlatformTransactionManager,
        val fdAcRepo: AssignFdAcRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(FdAcAssignService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()

    private val fileName = "Assign_FD_AC.json"
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
        modelMapper.configuration.isAmbiguityIgnored = false
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val filePath = "${appConfig.globalProperties().outputPath}"
        val fdAcEntityList = fdAcRepo.findAllByOrderBySubmissionDateAsc()


        val fdAcData = fdAcEntityList.map { fdAcEntity ->
            val starchContentAcDto = modelMapper.map(fdAcEntity, AssignFdAcDto::class.java)
            starchContentAcDto.submissionDate = myDateUtil.toDateTimeString(fdAcEntity.submissionDate)
            starchContentAcDto.start = myDateUtil.toDateTimeString(fdAcEntity.startDate)
            starchContentAcDto.end = myDateUtil.toDateTimeString(fdAcEntity.endDate)
            starchContentAcDto.today = myDateUtil.toDateToString(fdAcEntity.todayDate)
            starchContentAcDto
        }


        writeCsvFile.writeCsv(classMap = AssignFdAcDto::class.java, data = fdAcData,
                fileName = "Assign_FD_AC", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<AssignFdAcForm>>() {})

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
        modelMapper.configuration.isAmbiguityIgnored = false
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val fdAcData = ArrayList<AssignFdAcEntity>()
        list.forEach { assignFdAcForm ->
            //map and save to database
            val assignFdAcEntity = modelMapper.map(assignFdAcForm, AssignFdAcEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(assignFdAcForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                assignFdAcEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    assignFdAcEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    assignFdAcEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    assignFdAcEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            assignFdAcEntity.uuid = assignFdAcForm.formhubUuid
            assignFdAcEntity.submissionDate = myDateUtil.convertToDateTime(assignFdAcForm.submissionTime)
            assignFdAcEntity.todayDate = myDateUtil.convertToDate(assignFdAcForm.today)
            assignFdAcEntity.startDate = myDateUtil.convertToDateTime(assignFdAcForm.start)
            assignFdAcEntity.endDate = myDateUtil.convertToDateTime(assignFdAcForm.end)
            assignFdAcEntity.instanceId = assignFdAcForm.instanceId
            assignFdAcEntity.controlKey = assignFdAcForm.instanceId

            fdAcData.add(assignFdAcEntity)
            log.info("Added data to table ${assignFdAcEntity.controlKey} with surname as ${assignFdAcForm.xformIdString}")
        }

        fdAcRepo.saveAll(fdAcData)

        log.info("Finished saving the data for $fileName------->")

        log.info("Exporting to CSV $fileName------->")
        mapJsonFile()
    }
}