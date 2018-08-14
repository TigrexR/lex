package com.tigrex.microservice.consumer.templateConsumerFeign.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * restTemplate连接配置
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced//ribbon的负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
