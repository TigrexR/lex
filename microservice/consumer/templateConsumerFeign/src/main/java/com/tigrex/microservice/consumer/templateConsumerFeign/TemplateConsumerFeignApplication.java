package com.tigrex.microservice.consumer.templateConsumerFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.tigrex.microservice.consumer.templateConsumerFeign"}) /**配置feign的开启，并且扫描到对应的包，对包下的所有clint进行自动注入*/
@ComponentScan("com.tigrex.microservice.consumer.templateConsumerFeign")/**扫描的路径*/
public class TemplateConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateConsumerFeignApplication.class, args);
    }

}
