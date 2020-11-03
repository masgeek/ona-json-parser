package com.tsobu.ona.core.service.dataval


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.dataval.IcDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.dataval.IcEntity
import com.tsobu.ona.database.repositories.dataval.IcRepo
import com.tsobu.ona.forms.dataval.IcForm
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
class IcService
constructor(
        transactionManager: PlatformTransactionManager,
        val icRepo: IcRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(IcService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()

    val fileName = "dataVAL_IC.json"
    fun mapJsonFile() {
        log.info("Reading table data....")
        val frList = icRepo.findAllByOrderBySubmissionDateAsc()

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


        val icData = frList.map { icEntity ->
            val icDto = modelMapper.map(icEntity, IcDto::class.java)
            icDto.submissionDate = myDateUtil.convertTimeToString(icEntity.submissionDate)
            icDto.startDate = myDateUtil.convertTimeToString(icEntity.startDate)
            icDto.endDate = myDateUtil.convertTimeToString(icEntity.endDate)
            icDto
        }

        val filePath = "${appConfig.globalProperties().outputPath}"
        writeCsvFile.writeCsv(classMap = IcDto::class.java, data = icData, fileName = "dataVAL_IC", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<IcForm>>() {})

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

        val icData = ArrayList<IcEntity>()
        list.forEach { icForm ->
            //map and save to database
            val geoPoint = myDateUtil.splitGeoPoint(icForm.geopoint)
            val icEntity = modelMapper.map(icForm, IcEntity::class.java)
            if (geoPoint.isNotEmpty()) {
                icEntity.geoPointLatitude = geoPoint[0]

                if (myDateUtil.indexExists(geoPoint, 1)) {
                    icEntity.geoPointLongitude = geoPoint[1]
                }
                if (myDateUtil.indexExists(geoPoint, 2)) {
                    icEntity.geoPointAltitude = geoPoint[2]
                }
                if (myDateUtil.indexExists(geoPoint, 3)) {
                    icEntity.geoPointAccuracy = geoPoint[3]
                }
            }
            icEntity.uuid = icForm.formhubUuid
            icEntity.submissionDate = myDateUtil.convertToDateTime(icForm.submissionTime)
            icEntity.todayDate = myDateUtil.convertToDate(icForm.today)
            icEntity.startDate = myDateUtil.convertToDateTime(icForm.start)
            icEntity.endDate = myDateUtil.convertToDateTime(icForm.end)
            icEntity.plantingDate = myDateUtil.convertToDate(icForm.plantingDate)
            icEntity.instanceiD = icForm.metaInstanceID
            icEntity.controlKey = icForm.metaInstanceID

//            icEntity.commentValue = icForm.commentValue

            try {
                icData.add(icEntity)
            } catch (ex: Exception) {
                log.error(ex.message, ex.stackTrace)
            }
        }

        icRepo.saveAll(icData)
        log.info("Finished saving the data for $fileName------->")
        mapJsonFile()
    }
}