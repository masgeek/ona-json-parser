package com.tsobu.myftp.service

import com.tsobu.myftp.config.FtpConfig
import com.tsobu.myftp.config.FtpConfig.UploadGateway
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.io.File
import kotlin.system.exitProcess


@Service("iFileService")
class FtpClientService(
    val ftpConfig: FtpConfig,
) {

    private val logger = LoggerFactory.getLogger(this::class.java)

    @Autowired
    private val gateway: UploadGateway? = null

    val ona = ftpConfig.ona()
    fun processUploads() {

        val file = File("D:\\\\dev\\\\python\\\\ona-download\\\\downloads\\\\converted\\\\DG\\\\Register_HH_DG.csv")
        val h = gateway?.upload(file)
//        exitProcess(0)
    }

}