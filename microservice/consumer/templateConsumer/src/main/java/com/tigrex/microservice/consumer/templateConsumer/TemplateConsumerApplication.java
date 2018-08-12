package com.tigrex.microservice.consumer.templateConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TemplateConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateConsumerApplication.class, args);
    }

}
