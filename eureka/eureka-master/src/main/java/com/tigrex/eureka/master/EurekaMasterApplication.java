package com.tigrex.eureka.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaMasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMasterApplication.class, args);
    }

}
