package com.bit.apis;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName PayServiceClient.java
 * @Description TODO
 * @createTime 2020年02月17日 17:59:00
 */
@FeignClient(name = "pay-service")
public interface PayServiceClient {

    @RequestMapping(value = "/pay/post/{orderId}")
    void pay(@PathVariable("orderId") Long orderId);
}
