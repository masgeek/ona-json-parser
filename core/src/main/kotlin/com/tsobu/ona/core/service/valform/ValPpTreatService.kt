package com.tsobu.ona.core.service.valform


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.MapperFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.`val`.VaLPpTreatDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.valform.ValPpTreatEntity
import com.tsobu.ona.database.repositories.valform.ValPpTreatRepo
import com.tsobu.ona.forms.valform.ValPpTreatForm
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
class ValPpTreatService
constructor(
        transactionManager: PlatformTransactionManager,
        val treatRepo: ValPpTreatRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(ValPpTreatService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()

    private val fileName = "VAL_PP_Treat.json"

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
        val ppList = treatRepo.findAllByOrderBySubmissionDateAsc()


        val treatData = ppList.map { treatEntity ->
            val treatDto = modelMapper.map(treatEntity, VaLPpTreatDto::class.java)
            treatDto.submissionDate = myDateUtil.convertTimeToString(treatEntity.submissionDate)
            treatDto.start = myDateUtil.convertTimeToString(treatEntity.startDate)
            treatDto.end = myDateUtil.convertTimeToString(treatEntity.endDate)
            treatDto
        }


        writeCsvFile.writeCsv(classMap = VaLPpTreatDto::class.java, data = treatData,
                fileName = "VAL_PP_Treat", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true)
        val list = objectMapper.readValue(file, object : TypeReference<List<ValPpTreatForm>>() {})

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

        val treatData = ArrayList<ValPpTreatEntity>()
        list.forEach { treatForm ->
            //map and save to database
            val treatEntity = modelMapper.map(treatForm, ValPpTreatEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(treatForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                treatEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    treatEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    treatEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    treatEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            treatEntity.uuid = treatForm.formhubUuid
            treatEntity.submissionDate = myDateUtil.convertToDateTime(treatForm.submissionTime)
            treatEntity.todayDate = myDateUtil.convertToDate(treatForm.today)
            treatEntity.startDate = myDateUtil.convertToDateTime(treatForm.start)
            treatEntity.endDate = myDateUtil.convertToDateTime(treatForm.end)
            treatEntity.instanceId = treatForm.metaInstanceID
            treatEntity.controlKey = treatForm.metaInstanceID

            treatData.add(treatEntity)

        }

        treatRepo.saveAll(treatData)
        log.info("Finished saving the data for $fileName------->")

        log.info("Exporting to CSV $fileName------->")
        mapJsonFile()
    }
}