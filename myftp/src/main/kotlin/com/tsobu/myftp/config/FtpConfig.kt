package com.tsobu.myftp.config

import com.jcraft.jsch.ChannelSftp
import com.tsobu.fuelrod.config.properties.OnaProperties
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.io.Resource
import org.springframework.expression.common.LiteralExpression
import org.springframework.integration.annotation.Gateway
import org.springframework.integration.annotation.MessagingGateway
import org.springframework.integration.annotation.ServiceActivator
import org.springframework.integration.file.remote.session.CachingSessionFactory
import org.springframework.integration.file.remote.session.SessionFactory
import org.springframework.integration.sftp.outbound.SftpMessageHandler
import org.springframework.integration.sftp.session.DefaultSftpSessionFactory
import org.springframework.messaging.MessageHandler
import java.io.File


@Configuration
class FtpConfig {

    @Value("\${ftp.host}")
    var host: String? = null

    @Value("\${ftp.port}")
    var port: Int = 21

    @Value("\${ftp.username}")
    var username: String? = null

    @Value("\${ftp.password}")
    var password: String? = null

    var privateKey: Resource? = null
    var privateKeyPhrase: String? = null

    @Value("\${ftp.remote-dir}")
    var remoteDirectory: String? = null


    val fileSeparator = File.separator

    @Bean
    @ConfigurationProperties(prefix = "ona")
    fun ona(): OnaProperties {
        return OnaProperties()
    }

    @Bean
    fun sftpSessionFactory(): SessionFactory<ChannelSftp.LsEntry?>? {
        val factory = DefaultSftpSessionFactory(true)
        factory.setHost(host)
        factory.setPort(port)
        factory.setUser(username)
        if (privateKey != null) {
            factory.setPrivateKey(privateKey)
            factory.setPrivateKeyPassphrase(privateKeyPhrase)
        } else {
            factory.setPassword(password)
        }
        factory.setAllowUnknownKeys(true)
        return CachingSessionFactory(factory)
    }

    @Bean
    @ServiceActivator(inputChannel = "toSftpChannel")
    fun handler(): MessageHandler? {
        val handler = SftpMessageHandler(sftpSessionFactory())
        handler.setRemoteDirectoryExpression(LiteralExpression(remoteDirectory!!))


        handler.setAutoCreateDirectory(true)
        handler.setFileNameGenerator { message ->
            if (message.payload is File) {
                val fileName = (message.payload as File).name
                fileName
            } else {
                throw IllegalArgumentException("File expected as payload.")
            }
        }

        return handler
    }

    @MessagingGateway
    interface UploadGateway {
        @Gateway(requestChannel = "toSftpChannel")
        fun upload(file: File?)
    }
}