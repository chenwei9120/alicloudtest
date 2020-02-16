package com.bit.product_service.controller;

import com.bit.model.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName ProductController.java
 * @Description TODO
 * @createTime 2020年02月15日 21:41:00
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/get/{id}")
    public Product getProductById(@PathVariable Long id) {
        Product product = new Product();
        product.setCreateDate(new Date());
        product.setId(id);
        product.setName("食用葵花油");
        return product;
    }
}