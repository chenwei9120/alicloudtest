package com.bit.mall.controller;

import com.bit.mall.service.ProductService;
import com.bit.model.Product;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName ProductController.java
 * @Description TODO
 * @createTime 2020年02月15日 21:41:00
 */
@RestController
@RequestMapping("/product2")
public class ProductController2 {

    @Autowired
    private Registration registration;

    @GetMapping("/getIpAndPort")
    public String findById() {
        return registration.getHost() + ":" + registration.getPort();
    }
}