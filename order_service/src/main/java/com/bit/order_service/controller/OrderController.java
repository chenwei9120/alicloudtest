package com.bit.order_service.controller;

import com.bit.apis.PayServiceClient;
import com.bit.apis.ProductServiceClient;
import com.bit.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName OrderController.java
 * @Description TODO
 * @createTime 2020年02月15日 23:21:00
 */
@RestController
@RefreshScope
public class OrderController {

    @Value("${order.service.version}")
    private String version;

    @Autowired(required = false)
    private ProductServiceClient client;

    @Autowired(required = false)
    private PayServiceClient payServiceClient;

    @RequestMapping("/get/product/{id}")
    public Product getProductById(@PathVariable Long id) {
        return client.getProductById(id);
    }

    @RequestMapping(value = "/post/pay/{orderId}")
    public String pay(@PathVariable Long orderId) {
        try {
            payServiceClient.pay(orderId);
            return "OK";
        } catch(Exception e) {
            return "Error";
        }
    }

    @GetMapping("/get/version")
    public String getVersion() {
        return version;
    }

    @GetMapping("/get/throw")
    public void throwException() {
        throw new RuntimeException("拦截自定义异常测试.");
    }

}