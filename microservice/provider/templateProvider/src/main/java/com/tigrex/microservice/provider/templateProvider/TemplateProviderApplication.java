package com.tigrex.microservice.provider.templateProvider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableTransactionManagement /**需要事务处理的注解开启事务管理*/
public class TemplateProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateProviderApplication.class, args);
    }

}
