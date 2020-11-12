package com.tsobu.ona.core.service

import com.opencsv.CSVReader
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.database.entities.FormColumnValidationEntity
import com.tsobu.ona.database.repositories.FormColumnValidationRepo
import org.springframework.stereotype.Service
import java.io.File
import java.io.FilenameFilter
import java.io.Reader
import java.nio.file.Files
import java.nio.file.Paths


@Service
class ValidationService(
        val columnValidationRepo: FormColumnValidationRepo,
        val appConfig: AppConfig) {

    fun validateCsvColumnCount() {
        val destinationFileList = readFileList(appConfig.globalProperties().outputPath!!)
        val sourceFileList = readFileList(appConfig.globalProperties().comparePath!!)

        val validationData = processDestinationFiles(destinationFileList)
        columnValidationRepo.saveAll(validationData)

        val sourceValidation = processSourceFiles(sourceFileList)
        columnValidationRepo.saveAll(sourceValidation)
    }

    fun processDestinationFiles(fileList: Array<File>?): ArrayList<FormColumnValidationEntity> {
        val validationData = ArrayList<FormColumnValidationEntity>()
        fileList?.forEach { file ->
            val exists = columnValidationRepo.findById(file.name)
            var validationEntity = FormColumnValidationEntity()
            if (exists.isPresent) {
                validationEntity = exists.get()
            }
            val path = Paths.get(file.absolutePath)
            val bytes: Long = Files.size(path)
            val kbSize = bytes / 1024
            println("File name: " + file.name)
            println("File path: " + file.absolutePath)
            println("Size : $kbSize KB")
            println(" ")

            //read the thing
            val reader: Reader = Files.newBufferedReader(path)
            val csvReader = CSVReader(reader)
            val records = csvReader.readNext()

            validationEntity.formName = file.name
            validationEntity.actualColumnCount = records.size
            validationEntity.actualFileSizeKb = kbSize
            csvReader.close()
            reader.close()
            validationData.add(validationEntity)
        }
        return validationData
    }

    fun processSourceFiles(fileList: Array<File>?): ArrayList<FormColumnValidationEntity> {
        val validationData = ArrayList<FormColumnValidationEntity>()
        fileList?.forEach { file ->
            val exists = columnValidationRepo.findById(file.name)
            var validationEntity = FormColumnValidationEntity()
            if (exists.isPresent) {
                validationEntity = exists.get()
            }
            val path = Paths.get(file.absolutePath)
            val bytes: Long = Files.size(path)
            val kbSize = bytes / 1024
            println("File name: " + file.name)
            println("File path: " + file.absolutePath)
            println("Size : $kbSize KB")
            println(" ")

            //read the thing
            val reader: Reader = Files.newBufferedReader(path)
            val csvReader = CSVReader(reader)
            val records = csvReader.readNext()

            validationEntity.formName = file.name
            validationEntity.expectedColumnCount = records.size
            validationEntity.expectedFileSizeKb = kbSize
            validationEntity.processed = true
            csvReader.close()
            reader.close()
            validationData.add(validationEntity)
        }
        return validationData
    }

    fun readFileList(directoryPath: String, fileSuffix: String = ".csv"): Array<File>? {
        val fileDirectory = File(directoryPath)

        val filter = FilenameFilter { _, fileName ->
            val lowercaseName = fileName.toLowerCase()
            lowercaseName.endsWith(fileSuffix)
        }
        return fileDirectory.listFiles(filter)
    }
}