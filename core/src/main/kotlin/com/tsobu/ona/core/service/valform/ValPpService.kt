package com.tsobu.ona.core.service.valform


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.MapperFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.valdto.ValPpDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.valform.ValPpEntity
import com.tsobu.ona.database.entities.valform.ValPpPwEntity
import com.tsobu.ona.database.repositories.valform.ValPpPwRepo
import com.tsobu.ona.database.repositories.valform.ValPpRepo
import com.tsobu.ona.forms.valform.ValPpForm
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
class ValPpService
constructor(
        transactionManager: PlatformTransactionManager,
        val valIcRepo: ValPpRepo,
        val valPpPwRepo: ValPpPwRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(ValPpService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()

    private val fileName = "VAL_PP.json"

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
        val valPpEntityList = valIcRepo.findAllByOrderBySubmissionDateAsc()
        val valPpPwList = valPpPwRepo.findAll()


        val valPpData = valPpEntityList.map { valPpEntity ->
            val valIcDto = modelMapper.map(valPpEntity, ValPpDto::class.java)
            valIcDto.submissionDate = myDateUtil.convertTimeToString(valPpEntity.submissionDate)
            valIcDto.start = myDateUtil.convertTimeToString(valPpEntity.startDate)
            valIcDto.end = myDateUtil.convertTimeToString(valPpEntity.endDate)

//            valIcDto.slashOneSprayOneNote = valPpEntity.slash1Spray0Note
            valIcDto
        }

//        val valPpPwData = valPpPwList.map { valPpEntity ->
//            val valIcDto = modelMapper.map(valPpEntity, ValPpPwDto::class.java)
//            valIcDto
//        }


        writeCsvFile.writeCsv(classMap = ValPpDto::class.java, data = valPpData,
                fileName = "VAL_PP", outPutPath = filePath)

//        writeCsvFile.writeCsv(classMap = ValPpPwDto::class.java, data = valPpPwData,
//                fileName = "VAL_PP-PW", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true)
        val list = objectMapper.readValue(file, object : TypeReference<List<ValPpForm>>() {})

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

        val valPpData = ArrayList<ValPpEntity>()
        val valPpPwData = ArrayList<ValPpPwEntity>()
        list.forEach { valPpForm ->
            //map and save to database
            val valPpEntity = modelMapper.map(valPpForm, ValPpEntity::class.java)

            val geoPoint = myDateUtil.splitGeoPoint(valPpForm.geopoint)
            if (geoPoint.isNotEmpty()) {
                valPpEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    valPpEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    valPpEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    valPpEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            valPpEntity.uuid = valPpForm.formhubUuid
            valPpEntity.submissionDate = myDateUtil.convertToDateTime(valPpForm.submissionTime)
            valPpEntity.todayDate = myDateUtil.convertToDate(valPpForm.today)
            valPpEntity.startDate = myDateUtil.convertToDateTime(valPpForm.start)
            valPpEntity.endDate = myDateUtil.convertToDateTime(valPpForm.end)
            valPpEntity.plantingDate = myDateUtil.convertToDate(valPpForm.plantingDate)
            valPpEntity.instanceId = valPpForm.metaInstanceID
            valPpEntity.controlKey = valPpForm.metaInstanceID

//            valPpEntity.basicTill1TractorCost = valPpForm.basicTill1TractorCost

            valPpData.add(valPpEntity)
            log.info("Added data to table ${valPpEntity.harrowPlot31} with surname as ${valPpForm.harrowPlot31}")
        }

//        valIcRepo.saveAll(valPpData)

        log.info("Finished saving the data for $fileName------->")

        log.info("Exporting to CSV $fileName------->")
        mapJsonFile()
    }
}