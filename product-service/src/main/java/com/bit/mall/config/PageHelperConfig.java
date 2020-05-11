package com.bit.mall.config;

import com.github.pagehelper.PageInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName PageHelperConfig.java
 * @Description TODO
 * @createTime 2020年04月27日 22:20:00
 */
@Configuration
public class PageHelperConfig {
    @Value("${pagehelper.helperDialect}")
    private String helperDialect;


    @Bean
    public PageInterceptor pageInterceptor(){
        PageInterceptor pageInterceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty("helperDialect", helperDialect);
        pageInterceptor.setProperties(properties);
        return pageInterceptor;
    }
}