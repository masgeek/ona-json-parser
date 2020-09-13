package com.tsobu.ona.core.utils


import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.dataformat.csv.CsvMapper
import com.fasterxml.jackson.dataformat.csv.CsvSchema
import com.tsobu.ona.core.dto.json.RootYieldCassavaAcDto
import com.tsobu.ona.core.dto.json.ScoreWeedControlAcDto
import com.tsobu.ona.core.dto.json.ScoreWeedControlAcIdDto
import com.tsobu.ona.core.dto.json.ScoreWeedControlAcWdDto
import org.slf4j.LoggerFactory
import java.io.File


class WriteCsvFile {
    companion object {
        private const val filePath = "I:\\development\\python\\ona-download\\downloads\\converted\\"
    }

    private val log = LoggerFactory.getLogger(WriteCsvFile::class.java)
    fun writeScoreWeedCsv(list: List<ScoreWeedControlAcDto?>?, fileName: String) {
        try {
            val mapper = CsvMapper()
            mapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN, true);
            val schema: CsvSchema = mapper.schemaFor(ScoreWeedControlAcDto::class.java)
                    .withUseHeader(true)

            val tempFile = File("$filePath$fileName")

            mapper.writer(schema).writeValue(tempFile, list)
            log.info("$fileName written out to $filePath")
        } catch (ex: Exception) {
            log.error(ex.message, ex)
        }

    }

    fun writeScoreWeedIdCsv(list: List<ScoreWeedControlAcIdDto>, fileName: String) {
        try {
            val mapper = CsvMapper()
            mapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN, true);
            val schema: CsvSchema = mapper.schemaFor(ScoreWeedControlAcIdDto::class.java)
                    .withUseHeader(true)

            val tempFile = File("$filePath$fileName")

            mapper.writer(schema).writeValue(tempFile, list)
            log.info("$fileName written out to $filePath")
        } catch (ex: Exception) {
            log.error(ex.message, ex)
        }
    }

    fun writeScoreWeedAcCsv(list: List<ScoreWeedControlAcWdDto>, fileName: String) {
        try {
            val mapper = CsvMapper()
            mapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN, true);
            val schema: CsvSchema = mapper.schemaFor(ScoreWeedControlAcWdDto::class.java)
                    .withUseHeader(true)

            val tempFile = File("$filePath$fileName")

            mapper.writer(schema).writeValue(tempFile, list)
            log.info("$fileName written out to $filePath")
        } catch (ex: Exception) {
            log.error(ex.message, ex)
        }
    }

    fun writeYieldCassavaCsv(list: List<RootYieldCassavaAcDto>, fileName: String) {
        try {
            val mapper = CsvMapper()
            mapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN, true);
            val schema: CsvSchema = mapper.schemaFor(RootYieldCassavaAcDto::class.java)
                    .withUseHeader(true)

            val tempFile = File("$filePath$fileName")

            mapper.writer(schema).writeValue(tempFile, list)
            log.info("$fileName written out to $filePath")
        } catch (ex: Exception) {
            log.error(ex.message, ex)
        }
    }

}