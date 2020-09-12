package com.tsobu.ona.core.config

import com.tsobu.fuelrod.config.properties.OnaProperties
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class AppConfig {


    @Bean
    @ConfigurationProperties(prefix = "ona")
    fun globalProperties(): OnaProperties {
        return OnaProperties()
    }
}