package com.tsobu.parser.core.utils

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.csv.CsvMapper
import com.fasterxml.jackson.dataformat.csv.CsvSchema
import com.tsobu.parser.core.dto.forms.DataValPPTz
import java.io.File
import java.io.FileInputStream
import java.io.IOException
import java.io.InputStream
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.*
import java.util.function.Consumer
import java.util.stream.Collectors


class MyFileReader {

    private val objectMapper = ObjectMapper()

    fun returnFileInDirectory(path: String, fileExt: String = ".json") {
        try {
            Files.walk(Paths.get(path)).use { walk ->
                val result = walk.map { x: Path -> x.toString() }
                        .filter { f: String -> f.endsWith(fileExt) }.collect(Collectors.toList())
                result.forEach(Consumer { x: String? -> println(x) })
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset(fileName: String): String {

        val jsonTree = objectMapper.readTree(File(fileName))
        val csvSchemaBuilder = CsvSchema.builder()
        val firstObject = jsonTree.elements().next()

        firstObject.fieldNames().forEachRemaining { fieldName: String? -> csvSchemaBuilder.addColumn(fieldName) }
        val csvSchema = csvSchemaBuilder.build().withHeader()

        val csvMapper = CsvMapper()
        csvMapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN, true);
        csvMapper.writerFor(JsonNode::class.java)
                .with(csvSchema)
                .writeValue(File("D:\\dev\\python\\ona-download\\downloads\\converted\\converted.csv"), jsonTree)

        return ""
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset(fileName: String, skip: Boolean, noSkip: Boolean): String {
        val input: InputStream = FileInputStream(fileName)

        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        val arrayOfAnys = objectMapper.readValue(Paths.get(fileName).toFile(), Array<Any>::class.java)

        arrayOfAnys.forEach { myVal ->
            val linkedHashMap: LinkedHashMap<String, ArrayList<Objects>> = myVal as LinkedHashMap<String, ArrayList<Objects>>
            //output to CSV or something
        }
        return ""
    }

    @Suppress("UNCHECKED_CAST")
    @Throws(IOException::class)
    fun readJsonAsset(fileName: String, skip: Boolean): String {

        val info = Paths.get(fileName).toFile()

        val values = objectMapper.readValue(info, object : TypeReference<List<DataValPPTz>>() {})
//        val values = objectMapper.readValue(, Array<ValPPTz>::class.java)

        values.forEach { myVal ->
//            val k: ValPPTz = objectMapper.readValue(myVal, ValPPTz::class.java)
            println(myVal.landPreparationClearing)
        }
        return ""
    }

    fun createCSV(list: LinkedHashMap<String, ArrayList<Objects>>) {
        //val headers: List<String> = list.stream().flatMap { map -> map.keySet().stream() }.distinct().collect(Collectors.toList())

    }
}