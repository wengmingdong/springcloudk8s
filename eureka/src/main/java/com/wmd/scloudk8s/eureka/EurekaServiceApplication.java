package com.wmd.scloudk8s.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceApplication {
    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication.class, args);
    }
}
