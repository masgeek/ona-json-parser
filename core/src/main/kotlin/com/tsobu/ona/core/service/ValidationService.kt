package com.tsobu.ona.core.service

import com.tsobu.ona.core.config.AppConfig
import org.springframework.stereotype.Service
import java.io.File
import java.io.FilenameFilter
import java.nio.file.Files
import java.nio.file.Paths


@Service
class ValidationService(val appConfig: AppConfig) {

    fun validateCsvColumnCount() {
        val directoryPath = File(appConfig.globalProperties().outputPath!!)


        val textFilefilter = FilenameFilter { dir, name ->
            val lowercaseName = name.toLowerCase()
            lowercaseName.endsWith(".csv")
        }

        val fileList = directoryPath.listFiles(textFilefilter)
        fileList?.forEach { file ->
            val path = Paths.get(file.absolutePath)
            val bytes: Long = Files.size(path)
            val kbSize = bytes / 1024
            println("File name: " + file.name)
            println("File path: " + file.absolutePath)
            println("Size : $kbSize KB")
            println(" ")
        }
    }
}