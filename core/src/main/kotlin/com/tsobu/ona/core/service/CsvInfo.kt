package com.tsobu.ona.core.service

data class CsvInfo(val dataCount: Int,
                   val columnCount: Int,
                   val fileSizeKb: Long,
                   val fileName: String)