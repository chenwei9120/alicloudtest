package com.bit.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName MybatisConfig.java
 * @Description TODO
 * @createTime 2020年04月27日 14:57:00
 */
@Configuration
@MapperScan({"com.bit.mall.dao"})
public class MybatisConfig {
}