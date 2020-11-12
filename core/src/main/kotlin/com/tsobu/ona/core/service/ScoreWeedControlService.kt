package com.tsobu.ona.core.service


import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.core.dto.json.ScoreWeedControlAcDto
import com.tsobu.ona.core.dto.json.ScoreWeedControlAcIdDto
import com.tsobu.ona.core.dto.json.ScoreWeedControlAcWdDto
import com.tsobu.ona.core.utils.CsvUtility
import com.tsobu.ona.core.utils.MyUtils
import com.tsobu.ona.database.entities.scoreweedcontrol.AcIdEntity
import com.tsobu.ona.database.entities.scoreweedcontrol.WdEntity
import com.tsobu.ona.database.entities.scoreweedcontrol.WeedAcEntity
import com.tsobu.ona.database.repositories.ScoreWeedControlAcIdRepo
import com.tsobu.ona.database.repositories.ScoreWeedControlAcRepo
import com.tsobu.ona.database.repositories.ScoreWeedControlAcWdRepo
import com.tsobu.ona.forms.scoreweed.ScoreWeedControlForm
import org.modelmapper.ModelMapper
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.springframework.transaction.PlatformTransactionManager
import org.springframework.transaction.TransactionStatus
import org.springframework.transaction.support.TransactionTemplate
import java.io.IOException
import java.nio.file.Paths


@Service
class ScoreWeedControlService
constructor(
        transactionManager: PlatformTransactionManager,
        val scoreWeedControlAcRepo: ScoreWeedControlAcRepo,
        val scoreWeedControlAcIdRepo: ScoreWeedControlAcIdRepo,
        val scoreWeedControlAcWdRepo: ScoreWeedControlAcWdRepo,
        val appConfig: AppConfig) {

    private val log = LoggerFactory.getLogger(ScoreWeedControlService::class.java)
    private val modelMapper = ModelMapper()
    private val objectMapper = ObjectMapper()
    private val myDateUtil = MyUtils()
    private val transactionTemplate: TransactionTemplate = TransactionTemplate(transactionManager)
    private val fileName = "Score_Weed_Control_AC.json"
    fun mapJsonFile() {
        log.info("Reading weed table here")
        val scores = scoreWeedControlAcRepo.findAll()
        val scoresId = scoreWeedControlAcIdRepo.findAll()
        val scoresAc = scoreWeedControlAcWdRepo.findAll()

        val scoreWeedData = scores.map { scoreWeedControlAc ->
            val outboxDto = modelMapper.map(scoreWeedControlAc, ScoreWeedControlAcDto::class.java)
            outboxDto.submissionDate = myDateUtil.toDateTimeString(scoreWeedControlAc.submissionDate)
            outboxDto.startDate = myDateUtil.toDateTimeString(scoreWeedControlAc.startDate)
            outboxDto.endDate = myDateUtil.toDateTimeString(scoreWeedControlAc.endDate)
            outboxDto.todayDate = myDateUtil.toDateToString(scoreWeedControlAc.todayDate)
            outboxDto
        }

        val scoreWeedIdData = scoresId.map { scoreWeedControlAcId ->
            val outboxDto = modelMapper.map(scoreWeedControlAcId, ScoreWeedControlAcIdDto::class.java)
            outboxDto
        }

        val scoreWeedAcData = scoresAc.map { scoreWeedControlAcWd ->
            val scoreWeedControlAcWdDto = modelMapper.map(scoreWeedControlAcWd, ScoreWeedControlAcWdDto::class.java)
            scoreWeedControlAcWdDto
        }


        val writeCsvFile = CsvUtility()
        val filePath = "${appConfig.globalProperties().outputPath}"

        writeCsvFile.writeCsv(classMap = ScoreWeedControlAcDto::class.java, data = scoreWeedData, fileName = "Score_Weed_Control_AC", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = ScoreWeedControlAcIdDto::class.java, data = scoreWeedIdData, fileName = "Score_Weed_Control_AC-ID", outPutPath = filePath)
        writeCsvFile.writeCsv(classMap = ScoreWeedControlAcWdDto::class.java, data = scoreWeedAcData, fileName = "Score_Weed_Control_AC-WD", outPutPath = filePath)
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset() {
        val filePath = "${appConfig.globalProperties().jsonPath}${fileName}"
        val file = Paths.get(filePath).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<ScoreWeedControlForm>>() {})

        val data = ArrayList<WeedAcEntity>()
        val weedIdData = ArrayList<AcIdEntity>()
        val weedWdData = ArrayList<WdEntity>()

        val result = transactionTemplate.execute { status: TransactionStatus? ->

            list.forEach { myVal ->
                //map and save to database
                val geoPoint = myDateUtil.splitGeoPoint(myVal.geopoint)
                val weedEntity = WeedAcEntity()
                if (geoPoint.isNotEmpty()) {
                    weedEntity.geoPointLatitude = geoPoint[0]

                    if (myDateUtil.indexExists(geoPoint, 1)) {
                        weedEntity.geoPointLongitude = geoPoint[1]
                    }
                    if (myDateUtil.indexExists(geoPoint, 2)) {
                        weedEntity.geoPointAltitude = geoPoint[2]
                    }
                    if (myDateUtil.indexExists(geoPoint, 3)) {
                        weedEntity.geoPointAccuracy = geoPoint[3]
                    }
                }
                weedEntity.formHubUuId = myVal.formHubUuid
                weedEntity.submissionDate = myDateUtil.convertToDateTime(myVal.submissionTime)
                weedEntity.todayDate = myDateUtil.convertToDate(myVal.todayDate)
                weedEntity.startDate = myDateUtil.convertToDateTime(myVal.startDate)
                weedEntity.endDate = myDateUtil.convertToDateTime(myVal.endDate)
                weedEntity.setOfId = "${myVal.instanceId}/ID"
                weedEntity.instanceId = myVal.instanceId
                weedEntity.controlKey = myVal.instanceId

                data.add(weedEntity)

                //now we evaluate the weed id list
                val weedIdList = myVal.weedIdFormList
                var weedListIdCount = 1
                weedIdList?.forEach { weedList ->
                    val weedIdEntity = AcIdEntity()
                    weedIdEntity.parentKey = weedEntity.instanceId
                    weedIdEntity.setOfId = weedEntity.setOfId
                    weedIdEntity.setOfWd = "${weedEntity.setOfId}[$weedListIdCount]/WD"
                    weedIdEntity.controlKey = "${weedEntity.setOfId}[$weedListIdCount]"

                    weedIdData.add(weedIdEntity)
                    log.info("Added plot id is  ---->>> ${weedIdEntity.plotId} with for weed being $weedListIdCount")
                    weedListIdCount = weedListIdCount.plus(1)

                    //now we evaluate the weed ac list
                    log.info("Evaluating the weed ac now")
                    val weedAcList = weedList.weedIdentifierFormList
                    var weedListAcCount = 1
                    weedAcList?.forEach { weedIdentifier ->
                        val weedAcEntity = WdEntity()
                        weedAcEntity.parentKey = weedIdEntity.controlKey
                        weedAcEntity.imageLeafArea = weedIdentifier.imageLeafArea
                        weedAcEntity.controlKey = "${weedIdEntity.setOfWd}[$weedListIdCount]"
                        weedAcEntity.setOfWd = "${weedIdEntity.setOfWd}"
                        weedWdData.add(weedAcEntity)

                        log.info("Added plot id is  ---->>> ${weedAcEntity.imageLeafArea} with for weed being $weedListAcCount")
                        weedListAcCount = weedListAcCount.plus(1)
                    }
                }


            }

            log.info("Saving all the data to the database now")
            scoreWeedControlAcRepo.saveAll(data)
            scoreWeedControlAcIdRepo.saveAll(weedIdData)
            scoreWeedControlAcWdRepo.saveAll(weedWdData)
            log.info("Finished saving the data for $fileName------->")
            mapJsonFile()
        }
    }
}