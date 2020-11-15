package com.tsobu.ona.core.service

import com.opencsv.CSVReader
import com.tsobu.ona.core.config.AppConfig
import com.tsobu.ona.database.entities.FormColumnValidationEntity
import com.tsobu.ona.database.repositories.FormColumnValidationRepo
import org.slf4j.LoggerFactory
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

    private val log = LoggerFactory.getLogger(ValidationService::class.java)

    fun processCsvFiles() {
        try {
            val destinationFileList = readFileList(appConfig.globalProperties().outputPath!!)
            val sourceFileList = readFileList(appConfig.globalProperties().comparePath!!)

            val sourceValidation = processSourceFiles(sourceFileList)
            columnValidationRepo.saveAll(sourceValidation)

            val validationData = processDestinationFiles(destinationFileList)
            columnValidationRepo.saveAll(validationData)

            val formList = columnValidationRepo.findAll()
            validateData(formList)
        } catch (ex: Exception) {
            log.warn("Data could not be validated maybe files are empty?")
            log.error(ex.message, ex)
        }
    }

    protected fun processDestinationFiles(fileList: Array<File>?): ArrayList<FormColumnValidationEntity> {
        val destinationData = ArrayList<FormColumnValidationEntity>()
        fileList?.forEach { file ->
            val validationEntity = queryFileInfo(file.name)
            val records = readCsvFile(file)

            validationEntity.formName = file.name
            validationEntity.actualDataCount = records.dataCount
            validationEntity.actualColumnCount = records.columnCount
            validationEntity.actualFileSizeKb = records.fileSizeKb
            destinationData.add(validationEntity)
        }
        return destinationData
    }

    protected fun processSourceFiles(fileList: Array<File>?): ArrayList<FormColumnValidationEntity> {
        val validationData = ArrayList<FormColumnValidationEntity>()
        fileList?.forEach { file ->
            val validationEntity = queryFileInfo(file.name)
            val records = readCsvFile(file)

            validationEntity.formName = records.fileName
            validationEntity.expectedColumnCount = records.columnCount
            validationEntity.expectedDataCount = records.dataCount
            validationEntity.expectedFileSizeKb = records.fileSizeKb
            validationData.add(validationEntity)
        }
        return validationData
    }

    protected fun validateData(formList: MutableList<FormColumnValidationEntity>?) {
        formList?.forEach { validationEntity ->
            val columnCountValid = validationEntity.expectedColumnCount == validationEntity.actualColumnCount
            val dataCountValid = validationEntity.actualDataCount!! >= validationEntity.expectedDataCount!!

            validationEntity.columnValid = columnCountValid
            validationEntity.dataCountValid = dataCountValid
            columnValidationRepo.save(validationEntity)
        }
    }

    protected fun queryFileInfo(fileName: String): FormColumnValidationEntity {
        val exists = columnValidationRepo.findById(fileName)
        var columnValidationEntity = FormColumnValidationEntity()
        if (exists.isPresent) {
            columnValidationEntity = exists.get()
        }
        return columnValidationEntity
    }

    protected fun readCsvFile(file: File): CsvInfo {
        val path = Paths.get(file.absolutePath)
        val bytes: Long = Files.size(path)
        val kbSize = bytes / 1024
        log.info("File name is: ${file.name}")
        log.info("File path is: ${file.absolutePath}")
        log.info("File size is : $kbSize KB")

        val reader: Reader = Files.newBufferedReader(path)
        val csvReader = CSVReader(reader)

        val headerCountResult = csvReader.readNext()
        val dataCountResult = csvReader.readAll()

        var rowCount = -1
        if (headerCountResult != null) {
            rowCount = headerCountResult.size
        }
        var dataCount = -1
        if (dataCountResult != null) {
            dataCount = dataCountResult.size
        }
        csvReader.close()
        reader.close()
        return CsvInfo(dataCount = dataCount, columnCount = rowCount, fileSizeKb = kbSize, fileName = file.name)
    }

    protected fun readFileList(directoryPath: String, fileSuffix: String = ".csv"): Array<File>? {
        val fileDirectory = File(directoryPath)

        val filter = FilenameFilter { _, fileName ->
            val lowercaseName = fileName.toLowerCase()
            lowercaseName.endsWith(fileSuffix)
        }
        return fileDirectory.listFiles(filter)
    }
}