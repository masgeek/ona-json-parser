package com.tsobu.ona.core.service.dataval


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.forms.dataval.Fr
import com.tsobu.ona.core.dto.json.dataval.FrDto
import com.tsobu.ona.core.dto.json.valsphstz.EzDto
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.core.utils.WriteCsvFile
import com.tsobu.ona.database.entities.dataval.FrEntity
import com.tsobu.ona.database.entities.valsphstz.SzEntity
import com.tsobu.ona.database.repositories.dataval.FrRepo
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
class FrService
constructor(
        transactionManager: PlatformTransactionManager,
        val frRepo: FrRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(FrService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val writeCsvFile = WriteCsvFile()
    fun mapJsonFile() {
        log.info("Reading table data....")
        val frList = frRepo.findAllByOrderBySubmissionDateAsc()

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

        val frData = frList.map { frEntity ->
            val sphsTzSzDto = modelMapper.map(frEntity, FrDto::class.java)
            sphsTzSzDto.submissionDate = myDateUtil.convertTimeToString(frEntity.submissionDate)
            sphsTzSzDto.startDate = myDateUtil.convertTimeToString(frEntity.startDate)
            sphsTzSzDto.endDate = myDateUtil.convertTimeToString(frEntity.endDate)
            sphsTzSzDto
        }
        writeCsvFile.writeCsv(pojoType = FrDto::class.java, data = frData, fileName = "dataVAL_FR-")
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset(fileName: String) {
        val filePath = "${appConfig.globalProperties().folderPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<Fr>>() {})

        val data = ArrayList<SzEntity>()
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

        val frEntityData = ArrayList<FrEntity>()
        list.forEach { myVal ->
            //map and save to database
            val geoPoint = myDateUtil.splitGeoPoint(myVal.geopoint)
            val frEntity = modelMapper.map(myVal, FrEntity::class.java)
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
            frEntity.uuid = myVal.formhubUuid
            frEntity.submissionDate = myDateUtil.convertToDateTime(myVal.submissionTime)
            frEntity.todayDate = myDateUtil.convertToDate(myVal.today)
            frEntity.startDate = myDateUtil.convertToDateTime(myVal.start)
            frEntity.endDate = myDateUtil.convertToDateTime(myVal.end)
            frEntity.plantingDate = myDateUtil.convertToDate(myVal.plantingDate)
            frEntity.harvestDate = myDateUtil.convertToDate(myVal.harvestDate)
            frEntity.instanceId = myVal.metaInstanceID
            frEntity.controlKey = myVal.metaInstanceID

            try {
                frEntityData.add(frEntity)
                log.info("Added data to table ${frEntity.controlKey} with surname as ${myVal.xformIdString}")
            } catch (ex: Exception) {
                log.error(ex.message, ex.stackTrace)
            }
        }

        frRepo.saveAll(frEntityData)

        log.info("Finished saving the data for $fileName------->")
    }
}