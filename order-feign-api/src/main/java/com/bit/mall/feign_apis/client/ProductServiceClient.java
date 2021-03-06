package com.bit.mall.feign_apis.client;

import com.bit.mall.feign_apis.config.ProductServiceConfig;
import com.bit.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName ProductServiceClient.java
 * @Description TODO
 * @createTime 2020年02月15日 21:27:00
 */

@FeignClient(name = "product-service",configuration = ProductServiceConfig.class)
public interface ProductServiceClient {

    @RequestMapping(value = "/product/get/{id}")
    Product getProductById(@PathVariable("id") Long id);

    @RequestMapping(value="/product/timeout")
    void timeoutAction();
}