package com.tsobu.ona.core.utils


import com.tsobu.ona.core.dto.json.ScoreWeedControlAcDto
import org.simpleflatmapper.csv.CsvWriter
import org.simpleflatmapper.util.CheckedConsumer
import org.slf4j.LoggerFactory
import java.io.FileWriter


class WriteCsvFile {
    companion object {
        private const val STRING_ARRAY_SAMPLE = "I:\\development\\python\\ona-download\\downloads\\converted\\string-array-sample.csv"
    }

    private val log = LoggerFactory.getLogger(WriteCsvFile::class.java)
    fun writeToCsv(myUsers: List<ScoreWeedControlAcDto?>?) {
        try {
            val fileWriter = FileWriter(STRING_ARRAY_SAMPLE)

            val writerDsl: CsvWriter.CsvWriterDSL<ScoreWeedControlAcDto> = CsvWriter
                    .from(ScoreWeedControlAcDto::class.java)

            val writer: CsvWriter<ScoreWeedControlAcDto> = writerDsl.to(fileWriter)
            myUsers?.forEach(CheckedConsumer.toConsumer(writer::append))
            log.info("CSV written out")
        } catch (ex: Exception) {
            log.error(ex.message, ex)
        }
    }

}