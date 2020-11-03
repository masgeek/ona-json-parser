package com.tsobu.ona.core.service.valsphs


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.MapperFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.valdto.ValSphsOgDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.valform.ValSphsOgEntity
import com.tsobu.ona.database.repositories.valform.ValSphsOgRepo
import com.tsobu.ona.forms.valform.ValSphsOgForm
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
class ValSphsOgService
constructor(
        transactionManager: PlatformTransactionManager,
        val ogRepo: ValSphsOgRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(ValSphsOgService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()

    private val fileName = "VAL_SPHS_OG.json"

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
        val kwList = ogRepo.findAllByOrderBySubmissionDateAsc()


        val treatData = kwList.map { ogEntity ->
            val ogDto = modelMapper.map(ogEntity, ValSphsOgDto::class.java)
            ogDto.submissionDate = myDateUtil.convertTimeToString(ogEntity.submissionDate)
            ogDto.start = myDateUtil.convertTimeToString(ogEntity.startDate)
            ogDto.end = myDateUtil.convertTimeToString(ogEntity.endDate)

            ogDto
        }


        writeCsvFile.writeCsv(classMap = ValSphsOgDto::class.java, data = treatData,
                fileName = "VAL_SPHS_OG", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true)
        val list = objectMapper.readValue(file, object : TypeReference<List<ValSphsOgForm>>() {})

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

        val ogData = ArrayList<ValSphsOgEntity>()
        list.forEach { ogForm ->
            //map and save to database
            val ogEntity = modelMapper.map(ogForm, ValSphsOgEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(ogForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                ogEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    ogEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    ogEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    ogEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            ogEntity.uuid = ogForm.formhubUuid
            ogEntity.submissionDate = myDateUtil.convertToDateTime(ogForm.submissionTime)
            ogEntity.todayDate = myDateUtil.convertToDate(ogForm.today)
            ogEntity.startDate = myDateUtil.convertToDateTime(ogForm.start)
            ogEntity.endDate = myDateUtil.convertToDateTime(ogForm.end)
            ogEntity.instanceId = ogForm.metaInstanceID
            ogEntity.controlKey = ogForm.metaInstanceID

            ogEntity.gpDif = ogForm.gpDif

            ogData.add(ogEntity)

        }

        ogRepo.saveAll(ogData)
        log.info("Finished saving the data for $fileName------->")

        log.info("Exporting to CSV $fileName------->")
        mapJsonFile()
    }
}