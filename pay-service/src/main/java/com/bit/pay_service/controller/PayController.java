package com.bit.pay_service.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName PayController.java
 * @Description TODO
 * @createTime 2020年02月17日 18:03:00
 */
@RestController
@RequestMapping("/pay")
public class PayController {

    @RequestMapping(value = "/post/{orderId}")
    public void pay(@PathVariable("orderId") Long orderId) {
        System.out.println("pay for:" + orderId.toString());
    }


}