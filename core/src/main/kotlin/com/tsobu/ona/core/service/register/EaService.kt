package com.tsobu.ona.core.service.register


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.register.EaDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.database.entities.register.EaEntity
import com.tsobu.ona.database.repositories.register.EaRepo
import com.tsobu.ona.forms.register.EaForm
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
class EaService
constructor(
        transactionManager: PlatformTransactionManager,
        val eaRepo: EaRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(EaService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = CsvUtility()

    val fileName = "Register_EA.json"
    fun mapJsonFile() {
        log.info("Reading table data....")
        val frList = eaRepo.findAllByOrderBySubmissionDateAsc()

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
//        modelMapper.configuration.isAmbiguityIgnored = true
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD


        val eaData = frList.map { eaEntity ->
            val eaDto = modelMapper.map(eaEntity, EaDto::class.java)
            eaDto.submissionDate = myDateUtil.toDateTimeString(eaEntity.submissionDate)
            eaDto.startDate = myDateUtil.toDateTimeString(eaEntity.startDate)
            eaDto.endDate = myDateUtil.toDateTimeString(eaEntity.endDate)
            eaDto.today = myDateUtil.toDateTimeString(eaEntity.todayDate)
            eaDto
        }

        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(classMap = EaDto::class.java, data = eaData, fileName = "Register_EA", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<EaForm>>() {})

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
//        modelMapper.configuration.isAmbiguityIgnored = true
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val eaData = ArrayList<EaEntity>()
        list.forEach { eaForm ->
            //map and save to database
            val geoPoint = myDateUtil.splitGeoPoint(eaForm.geopoint)
            val frEntity = modelMapper.map(eaForm, EaEntity::class.java)
            if (geoPoint.isNotEmpty()) {
                frEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    frEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    frEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    frEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            frEntity.uuid = eaForm.formhubUuid
            frEntity.submissionDate = myDateUtil.convertToDateTime(eaForm.submissionTime)
            frEntity.todayDate = myDateUtil.convertToDate(eaForm.today)
            frEntity.startDate = myDateUtil.convertToDateTime(eaForm.start)
            frEntity.endDate = myDateUtil.convertToDateTime(eaForm.end)
            frEntity.instanceId = eaForm.metaInstanceID
            frEntity.controlKey = eaForm.metaInstanceID

            try {
                eaData.add(frEntity)
                log.info("Added data to table ${frEntity.controlKey} with surname as ${eaForm.xformIdString}")
            } catch (ex: Exception) {
                log.error(ex.message, ex.stackTrace)
            }
        }

        eaRepo.saveAll(eaData)

        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}