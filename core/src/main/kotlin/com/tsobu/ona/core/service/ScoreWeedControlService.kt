package com.tsobu.ona.core.service


import com.tsobu.ona.database.repositories.ScoreWeedControlAcRepository
import org.modelmapper.ModelMapper
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class ScoreWeedControlService
constructor(val weedControl: ScoreWeedControlAcRepository) {

    private val log = LoggerFactory.getLogger(ScoreWeedControlService::class.java)
    private val modelMapper = ModelMapper()

    fun readScores() {
        log.info("Reading weed table here")
        val scores = weedControl.findAll()

        scores.forEach { scoreWeedControlAc ->
            log.info(scoreWeedControlAc.setOfId)
        }
    }

    fun mapJsonFile() {

    }
}