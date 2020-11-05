package com.tsobu.ona.core.service.valform


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.MapperFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.valdto.ValIcDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.valform.ValIcEntity
import com.tsobu.ona.database.repositories.valform.ValIcRepo
import com.tsobu.ona.forms.valform.ValIcForm
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
class ValIcService
constructor(
        transactionManager: PlatformTransactionManager,
        val valIcRepo: ValIcRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(ValIcService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()

    private val fileName = "VAL_IC.json"

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
//        modelMapper.configuration.isAmbiguityIgnored = true
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val filePath = "${appConfig.globalProperties().outputPath}"
        val valIcEntityList = valIcRepo.findAllByOrderBySubmissionDateAsc()


        val valIcData = valIcEntityList.map { valIcEntity ->
            val valIcDto = modelMapper.map(valIcEntity, ValIcDto::class.java)
            valIcDto.submissionDate = myDateUtil.convertTimeToString(valIcEntity.submissionDate)
            valIcDto.start = myDateUtil.convertTimeToString(valIcEntity.startDate)
            valIcDto.end = myDateUtil.convertTimeToString(valIcEntity.endDate)
//            valIcDto.purposeVal = valIcEntity.confirmVal
            valIcDto
        }


        writeCsvFile.writeCsv(classMap = ValIcDto::class.java, data = valIcData,
                fileName = "VAL_IC", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true)
        val list = objectMapper.readValue(file, object : TypeReference<List<ValIcForm>>() {})

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
//        modelMapper.configuration.sourceNamingConvention = NamingConventions.NONE
//        modelMapper.configuration.destinationNamingConvention = NamingConventions.NONE
        modelMapper.configuration.matchingStrategy = MatchingStrategies.STANDARD

        val valIcData = ArrayList<ValIcEntity>()
        list.forEach { valIcForm ->
            //map and save to database
            val valFrEntity = modelMapper.map(valIcForm, ValIcEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(valIcForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                valFrEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    valFrEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    valFrEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    valFrEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            valFrEntity.uuid = valIcForm.formhubUuid
            valFrEntity.submissionDate = myDateUtil.convertToDateTime(valIcForm.submissionTime)
            valFrEntity.todayDate = myDateUtil.convertToDate(valIcForm.today)
            valFrEntity.startDate = myDateUtil.convertToDateTime(valIcForm.start)
            valFrEntity.endDate = myDateUtil.convertToDateTime(valIcForm.end)
            valFrEntity.plantingDate = myDateUtil.convertToDate(valIcForm.plantingDate)
            valFrEntity.instanceId = valIcForm.metaInstanceID
            valFrEntity.controlKey = valIcForm.metaInstanceID

//            valFrEntity.profitExtraPlot = valIcForm.callValue

            valIcData.add(valFrEntity)
            log.info("Added data to table ${valFrEntity.controlKey} with surname as ${valIcForm.xformIdString}")
        }

        valIcRepo.saveAll(valIcData)

        log.info("Finished saving the data for $fileName------->")

        log.info("Exporting to CSV $fileName------->")
        mapJsonFile()
    }
}