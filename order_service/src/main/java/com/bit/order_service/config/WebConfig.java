package com.bit.order_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName WebConfig.java
 * @Description TODO
 * @createTime 2020年02月20日 15:14:00
 */

@Configuration
public class WebConfig {
    @Bean
    public RestTemplate restTemplate() {
        //设置restTemplate的超时时间
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setReadTimeout(10);
        requestFactory.setConnectTimeout(10);
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        return restTemplate;
    }
}