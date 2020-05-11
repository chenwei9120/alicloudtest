package com.bit.mall.config;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName WebConfig.java
 * @Description TODO
 * @createTime 2020年02月20日 15:14:00
 */

@Configuration
public class WebConfig {
//    @Bean
//    @LoadBalanced //ribbon的负载均衡注解
//    public RestTemplate restTemplate() {
//        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
//        requestFactory.setReadTimeout(1000);
//        requestFactory.setConnectTimeout(1000);
//        RestTemplate restTemplate = new RestTemplate(requestFactory);
//        return restTemplate;
//    }
}