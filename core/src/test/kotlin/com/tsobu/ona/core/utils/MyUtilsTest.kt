package com.tsobu.ona.core.utils

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.time.LocalDate
import java.time.LocalDateTime

internal class MyUtilsTest {

    private val myUtil = MyUtils()

    @Test
    fun convert_date_to_human_readable_form() {
        val today = "2018-04-19"
        val submissionTime = "2018-04-19T14:47:04"
        val startDate = "2018-04-19T13:45:16.442+01"
        val endDate = "2016-01-01T01:30:00.664+01"

        val expectedDateTime = "Apr 19, 2018 02:47:04 PM"
        val expectedDate = "Apr 19, 2018"
        val dateTimeVal = myUtil.convertToDateTime(submissionTime)
        val dateVal = myUtil.convertToDate(today)

        val convertedDateTime = myUtil.convertTimeToString(dateTimeVal)
        val convertedDate = myUtil.convertTimeToString(dateVal, "MMM dd, yyyy")
        assertEquals(expectedDateTime, convertedDateTime)
        assertEquals(expectedDate, convertedDate)
    }
}