package com.bit.mall.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName ProductStoreController.java
 * @Description TODO
 * @createTime 2020年03月15日 16:46:00
 */
@RestController
@RequestMapping("/store")
public class ProductStoreController {

    @RequestMapping("/test")
    public String test() {
        return "I get it";
    }
}