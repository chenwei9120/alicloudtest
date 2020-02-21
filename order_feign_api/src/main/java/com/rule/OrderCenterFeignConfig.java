package com.rule;

import feign.Logger;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName OrderCenterFeignConfig.java
 * @Description TODO
 * @createTime 2020年02月15日 21:34:00
 */
//这里如果加上@Configration，扫描到后就会变成全局配置
public class OrderCenterFeignConfig {

    public OrderCenterFeignConfig(){
        System.out.println("OrderCenterFeignConfig()");
    }

    @Bean
    public Logger.Level level() {
        //return Logger.Level.FULL;
        //return Logger.Level.HEADERS;
        return Logger.Level.BASIC;
        //return Logger.Level.NONE;
    }

    @Bean
    public RequestInterceptor requestInterceptor() {
        return new com.rule.ProductSericeInterceptor();
    }

    /**
     * 根据SpringBoot自动装配FeignClientsConfiguration 的FeignClient的契约是SpringMvc
     *
     通过修改契约为默认的Feign的锲约，那么就可以使用默认的注解
     * @return
     */

/*    @Bean
    public Contract feiContract() {
        return new Contract.Default();
    }*/

//    @Bean
//    public RequestInterceptor requestInterceptor() {
//        return new TulingRequestInterceptor();
//    }
}