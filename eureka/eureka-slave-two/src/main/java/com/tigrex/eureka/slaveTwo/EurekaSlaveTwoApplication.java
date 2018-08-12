package com.tigrex.eureka.slaveTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaSlaveTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSlaveTwoApplication.class, args);
    }

}
