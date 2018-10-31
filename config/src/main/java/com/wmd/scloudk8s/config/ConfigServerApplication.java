package com.wmd.scloudk8s.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args) {
        //http://127.0.0.1:7001/config-client/dev
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
