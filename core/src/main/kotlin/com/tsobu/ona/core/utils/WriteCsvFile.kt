package com.tsobu.ona.core.utils


import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.MapperFeature
import com.fasterxml.jackson.dataformat.csv.CsvMapper
import com.fasterxml.jackson.dataformat.csv.CsvSchema
import org.slf4j.LoggerFactory
import java.io.File


class WriteCsvFile {

    private val log = LoggerFactory.getLogger(WriteCsvFile::class.java)

    fun writeCsv(classMap: Class<*>?, data: List<*>, fileName: String, outPutPath: String) {
        try {
            val mapper = CsvMapper()
            mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true)
//            mapper.configure(MapperFeature.USE_STD_BEAN_NAMING , true)
            mapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN, false)
            val schema: CsvSchema = mapper.schemaFor(classMap).withUseHeader(true)

            val fullFilePath = "$outPutPath$fileName.csv"
            val tempFile = File(fullFilePath)

            mapper.writer(schema).writeValue(tempFile, data)
            log.info("$fileName written out to $outPutPath")
        } catch (ex: Exception) {
            log.error(ex.message, ex)
        }
    }

}