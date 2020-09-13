package com.tsobu.ona.core.utils

import com.opencsv.CSVWriter
import com.tsobu.ona.core.dto.json.ScoreWeedControlAcDto
import com.tsobu.ona.core.utils.WriteCsvFile
import com.opencsv.bean.StatefulBeanToCsv
import com.opencsv.bean.StatefulBeanToCsvBuilder
import com.tsobu.ona.core.service.ScoreWeedControlService
import org.slf4j.LoggerFactory
import java.io.Writer
import java.lang.Exception
import java.nio.file.Files
import java.nio.file.Paths

class WriteCsvFile {
    companion object {
        private const val STRING_ARRAY_SAMPLE = "I:\\development\\python\\ona-download\\downloads\\converted\\string-array-sample.csv"
    }

    private val log = LoggerFactory.getLogger(WriteCsvFile::class.java)
    fun writeToCsv(myUsers: List<ScoreWeedControlAcDto?>?) {
        try {
            val writer: Writer = Files.newBufferedWriter(Paths.get(STRING_ARRAY_SAMPLE))

            val beanToCsv: StatefulBeanToCsv<ScoreWeedControlAcDto?> = StatefulBeanToCsvBuilder<ScoreWeedControlAcDto?>(writer)
                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                    .build()
            beanToCsv.write(myUsers)

            log.info("CSV written out")
        } catch (ex: Exception) {
            log.error(ex.message, ex)
        }
    }

}