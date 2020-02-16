package com.bit.order_service.controller;

import com.bit.apis.ProductClient;
import com.bit.model.Product;
import com.bit.order_service.api.ProductAPI;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/order")
public class OrderController {

    @Autowired(required = false)
    private ProductClient client;

    @RequestMapping("/get/product/{id}")
    public Product getProductById(@PathVariable Long id) {
        return client.getProductById(id);
    }


}