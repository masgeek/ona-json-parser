package com.tsobu.myftp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.sftp.gateway.SftpOutboundGateway;
import org.springframework.integration.sftp.session.DefaultSftpSessionFactory;
import org.springframework.messaging.MessageChannel;

import java.io.File;

/**
 * @link https://medium.com/nerd-for-tech/retrieving-files-from-ftp-server-using-spring-integration-5ccc4a972eaf
 */
@Configuration
public class FtpConfiguration {
    String hostname;
    String username;
    String password;
    int port;

    @Bean
    public DefaultSftpSessionFactory sf() {
        DefaultSftpSessionFactory sf = new DefaultSftpSessionFactory();

        sf.setHost(hostname);
        sf.setPort(port);
        sf.setUser(username);
        sf.setPassword(password);

        return sf;
    }

    public SftpOutboundGateway getFiles(){
        SftpOutboundGateway gateway = new SftpOutboundGateway(sf(),"mget","payload");
        gateway.setAutoCreateDirectory(true);
        gateway.setLocalDirectory(new File("./downloads/"));

        return gateway;
    }
}
