package com.bit.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName OrderController2.java
 * @Description TODO
 * @createTime 2020年04月28日 15:04:00
 */
@RestController
public class OrderController2 {

    @Autowired(required = false)
    private RestTemplate restTemplate;

    @GetMapping("/product/getIpAndPort")
    public String getIpAndPort() {
        return this.restTemplate.getForObject("http://product-service/product/product2/getIpAndPort", String.class);
    }
}