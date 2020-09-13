package com.tsobu.ona.core.utils


import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.ObjectWriter
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.dataformat.csv.CsvMapper
import com.fasterxml.jackson.dataformat.csv.CsvSchema
import com.tsobu.ona.core.dto.json.ScoreWeedControlAcDto
import org.slf4j.LoggerFactory
import java.io.BufferedOutputStream
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStreamWriter


class WriteCsvFile {
    companion object {
        private const val STRING_ARRAY_SAMPLE = "I:\\development\\python\\ona-download\\downloads\\converted\\string-array-sample.csv"
    }

    private val log = LoggerFactory.getLogger(WriteCsvFile::class.java)
    fun writeToCsv(myUsers: List<ScoreWeedControlAcDto?>?) {
        try {
            val mapper = CsvMapper()
            mapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN, true);
            val schema: CsvSchema = mapper.schemaFor(ScoreWeedControlAcDto::class.java)
                    .withUseHeader(true)
//                .withColumnSeparator('\t')
            val tempFile = File(STRING_ARRAY_SAMPLE)

            mapper.writer(schema).writeValue(tempFile, myUsers)
            log.info("CSV written out")
        } catch (ex: Exception) {
            log.error(ex.message, ex)
        }

    }

    fun writeToCsv(myUsers: String?) {
        val mapper = CsvMapper()
        mapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN, true);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false); //Optional
        val schema: CsvSchema = mapper.schemaFor(ScoreWeedControlAcDto::class.java)
//                .withUseHeader(true)
//                .withColumnSeparator('\t')
        val csv = mapper.writer(schema).writeValueAsString(myUsers)
        log.info("CSV written out from string")
    }

    fun writeToCsvOld(myUsers: List<ScoreWeedControlAcDto?>?) {
//        try {
//            val fileWriter = FileWriter(STRING_ARRAY_SAMPLE)
//
//            val writerDsl: CsvWriter.CsvWriterDSL<ScoreWeedControlAcDto> = CsvWriter
//                    .from(ScoreWeedControlAcDto::class.java)
//
//            val writer: CsvWriter<ScoreWeedControlAcDto> = writerDsl.to(fileWriter)
//            myUsers?.forEach(CheckedConsumer.toConsumer(writer::append))
//            log.info("CSV written out")
//        } catch (ex: Exception) {
//            log.error(ex.message, ex)
//        }
    }


}