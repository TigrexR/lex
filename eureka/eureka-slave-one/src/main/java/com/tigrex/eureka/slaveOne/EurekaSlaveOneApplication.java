package com.tigrex.eureka.slaveOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaSlaveOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSlaveOneApplication.class, args);
    }

}
