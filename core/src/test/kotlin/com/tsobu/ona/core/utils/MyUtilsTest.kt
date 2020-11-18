package com.tsobu.ona.core.utils

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MyUtilsTest {

    private val myUtil = MyUtils()

    @Test
    fun convert_date_to_human_readable_form() {
        val today = "2018-04-19"
        val submissionTime = "2018-04-19T14:47:04"
        val expectedDateTime = "Apr 19, 2018 2:47:04 PM"
        val expectedDate = "Apr 19, 2018"
        val dateTimeVal = myUtil.convertToDateTime(submissionTime)
        val dateVal = myUtil.convertToDate(today)

        val convertedDateTime = myUtil.toDateTimeString(dateTimeVal)
        val convertedDate = myUtil.toDateToString(dateVal)
        assertEquals(expectedDateTime, convertedDateTime)
        assertEquals(expectedDate, convertedDate)
    }

    @Test
    fun convert_date_to_human_readable_no_zero_form() {
        val today = "2018-01-10"
        val expectedDate = "Jan 10, 2018"
        val dateVal = myUtil.convertToDate(today)
        val convertedDate = myUtil.toDateToString(dateVal)
        assertEquals(expectedDate, convertedDate)
    }

    @Test
    fun convert_date_time_to_human_readable_no_zero_form() {
        val submissionTime = "2018-01-01T08:00:00"
        val expectedDateTime = "Jan 1, 2018 8:00:00 AM"
        val dateTimeVal = myUtil.convertToDateTime(submissionTime)

        val convertedDateTime = myUtil.toDateTimeString(dateTimeVal)
        assertEquals(expectedDateTime, convertedDateTime)
    }

    @Test
    fun convert_date_only_to_date_time() {
        val today = "2018-04-23"
        val dateVal = myUtil.convertToDate(today)
        assertEquals("2018-04-23T00:00", dateVal.toString())
    }
}