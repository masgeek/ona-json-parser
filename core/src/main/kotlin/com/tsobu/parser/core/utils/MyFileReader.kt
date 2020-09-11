package com.tsobu.parser.core.utils

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper
import com.tsobu.parser.core.dto.forms.scoreweed.ScoreWeedControl
import java.io.IOException
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
        val databaseReader = DatabaseReader()
        val file = Paths.get(fileName).toFile()

        val list = objectMapper.readValue(file, object : TypeReference<List<ScoreWeedControl>>() {})

        list.forEach { myVal ->

            println(myVal.uuid)
        }
        return "Hello"
    }

    fun createCSV(list: LinkedHashMap<String, ArrayList<Objects>>) {
        //val headers: List<String> = list.stream().flatMap { map -> map.keySet().stream() }.distinct().collect(Collectors.toList())
    }
}