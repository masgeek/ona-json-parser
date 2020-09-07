package com.tsobu.parser.app

import com.sksamuel.hoplite.ConfigLoader
import com.sksamuel.hoplite.EnvironmentVariablesPropertySource
import com.sksamuel.hoplite.PropertySource
import com.tsobu.parser.config.AppConfig


class App {
    fun getGreeting(): String? {

//        val config = ConfigLoader()
//                .loadConfigOrThrow<AppConfig>("/application.yml")

        val configBuilder = ConfigLoader.Builder()
                .addSource(PropertySource.resource("/application.yml", false))
                .addSource(EnvironmentVariablesPropertySource(useUnderscoresAsSeparator = true, allowUppercaseNames = true))
                .build()
                .loadConfig<AppConfig>()

        val config = configBuilder.getUnsafe()
        return config.ona.api
    }
}

fun main(args: Array<String>) {
    println(App().getGreeting())
}