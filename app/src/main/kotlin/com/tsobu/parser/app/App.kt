package com.tsobu.parser.app

import com.sksamuel.hoplite.ConfigLoader
import com.sksamuel.hoplite.EnvironmentVariablesPropertySource
import com.sksamuel.hoplite.PropertySource
import com.tsobu.parser.config.AppConfig
import com.tsobu.parser.config.Ona
import com.tsobu.parser.core.utils.DatabaseReader
import com.tsobu.parser.core.utils.MyFileReader


class App {
    fun getJsonList(): Ona {
        val configBuilder = ConfigLoader.Builder()
                .addSource(PropertySource.resource("/application.yml", true))
                .addSource(EnvironmentVariablesPropertySource(useUnderscoresAsSeparator = true, allowUppercaseNames = true))
                .build()
                .loadConfig<AppConfig>()

        val config = configBuilder.getUnsafe()
        return config.ona
    }
}

fun main(args: Array<String>) {
    val folderPath = App().getJsonList().jsonFolder
    println("Started application.....")

    val myFileReader = MyFileReader()

//    myFileReader.returnFileInDirectory(folderPath)

    myFileReader.readJsonAsset("I:\\development\\python\\ona-download\\downloads\\json\\Score_Weed_Control_AC.json")

        val databaseReader = DatabaseReader()
    databaseReader.readTable()
}