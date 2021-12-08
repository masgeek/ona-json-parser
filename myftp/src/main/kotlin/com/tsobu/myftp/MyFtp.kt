package com.tsobu.myftp

import com.tsobu.myftp.service.FtpClientService
import org.springframework.boot.Banner
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.integration.annotation.IntegrationComponentScan
import org.springframework.integration.config.EnableIntegration
import org.springframework.integration.ftp.session.DefaultFtpSessionFactory

@SpringBootApplication
//@IntegrationComponentScan
//@EnableIntegration
class MyFtp(
    private val ftpClientService: FtpClientService
) : CommandLineRunner {


    /**
     * Callback used to run the bean.
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    override fun run(vararg args: String?) {
        ftpClientService.processUploads()
    }
}

fun main(args: Array<String>) {
    val app = SpringApplication(MyFtp::class.java)
    app.setBannerMode(Banner.Mode.CONSOLE)
    runApplication<MyFtp>(*args)
}
