package com.tsobu.ona.core.utils

import org.slf4j.LoggerFactory
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter


class MyUtils {

    private val log = LoggerFactory.getLogger(MyUtils::class.java)

    fun splitGeoPoint(geoPoint: String?): List<String> {
        if (geoPoint != null) {
            return geoPoint.split(" ")
        }
        return emptyList<String>()
    }

    fun indexExists(list: List<*>, index: Int): Boolean {
        return index >= 0 && index < list.size
    }

    fun convertToDateTime(dateTimeString: String?): LocalDateTime? {
        if (dateTimeString == null) {
            return null
        }

        val timeString = dateTimeString.split(".")
        val validDateString = timeString.first()
        val instant = Instant.parse("$validDateString.00Z")


        return LocalDateTime.ofInstant(instant, ZoneId.of("UTC"))
    }

    fun convertToDate(dateString: String?): LocalDateTime? {
        if (dateString == null) {
            return null
        }
        val instant = Instant.parse("${dateString}T00:00:00.00Z")
        return instant.atZone(ZoneId.of("UTC")).toLocalDateTime()
    }

    fun toDateTimeString(localDateTime: LocalDateTime?, format: String = "MMM dd, yyyy hh:mm:ss a"): String? {
        if (localDateTime == null) {
            return null
        }
        val dateFormat2 = DateTimeFormatter.ofPattern(format)

        return dateFormat2.format(localDateTime)
    }

    fun toDateToString(localDateTime: LocalDateTime?, format: String = "MMM dd, yyyy"): String? {
        return toDateTimeString(localDateTime, format)
    }
}