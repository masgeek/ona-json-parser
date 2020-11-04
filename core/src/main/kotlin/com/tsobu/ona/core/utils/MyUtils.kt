package com.tsobu.ona.core.utils

import org.slf4j.LoggerFactory
import java.time.Instant
import java.time.LocalDate
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
            return LocalDateTime.now()
        }

        val timeString = dateTimeString.split(".")
        val validDateString = timeString.first()
        val instant = Instant.parse("$validDateString.00Z")


        return LocalDateTime.ofInstant(instant, ZoneId.of("UTC"))
    }

    fun convertToDate(dateString: String?): LocalDate? {
        if (dateString == null) {
            return null
        }
        val instant = Instant.parse("${dateString}T00:00:00.00Z")
        return instant.atZone(ZoneId.of("UTC")).toLocalDate()
    }

    fun convertTimeToString(localDateTime: LocalDateTime?): String? {
        if (localDateTime == null) {
            return null
        }

        val date = localDateTime.toLocalDate()
        val time = localDateTime.toLocalTime().format(DateTimeFormatter.ISO_LOCAL_TIME)

        var dayMonth = date.dayOfMonth.toString()
        var yearMonth = date.monthValue.toString()
        if (date.dayOfMonth < 10) {
            dayMonth = "0${date.dayOfMonth}"
        }
        if (date.monthValue < 10) {
            yearMonth = "0${date.monthValue}"
        }
        return "${dayMonth}-${yearMonth}-${date.year} $time"
    }

}