package com.bit.mall.feign_apis.config;

import com.bit.mall.feign_apis.interceptors.ProductSericeInterceptor;
import feign.Logger;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName ProductServiceConfig.java
 * @Description TODO
 * @createTime 2020年04月30日 13:49:00
 */
public class ProductServiceConfig {
    public ProductServiceConfig() {
        System.out.println("ProductServiceConfig()");
    }

    @Bean
    public Logger.Level level() {
        return Logger.Level.FULL;
        //return Logger.Level.HEADERS;
        //return Logger.Level.BASIC;
        //return Logger.Level.NONE;
    }

    //@Bean
    public RequestInterceptor requestInterceptor() {
        return new ProductSericeInterceptor();
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