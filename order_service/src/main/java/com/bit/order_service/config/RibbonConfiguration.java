package com.bit.order_service.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName RibbonConfiguration.java
 * @Description TODO
 * @createTime 2020年02月12日 20:09:00
 */
//@Configuration
public class RibbonConfiguration {
    @Bean
    public IRule ribbonRule() {
        // 负载均衡规则，改为随机
        return new RandomRule();
    }
}