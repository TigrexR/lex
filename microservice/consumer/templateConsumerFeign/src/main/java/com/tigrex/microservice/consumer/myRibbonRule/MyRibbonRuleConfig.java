package com.tigrex.microservice.consumer.myRibbonRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 */
@Configuration
public class MyRibbonRuleConfig {

    /**
     * 返回自己的负载均衡策略
     * @return
     */
    @Bean
    public IRule MyRibbonRule (){
        return new RandomRuleFiveTimes();
    }

}
