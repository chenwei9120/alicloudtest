package com.bit.apis;

import com.bit.model.Product;
import com.config.ProductCenterFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName ProductClient.java
 * @Description TODO
 * @createTime 2020年02月15日 21:27:00
 */

@FeignClient(name = "product-service",configuration = ProductCenterFeignConfig.class)
public interface ProductClient {

    @RequestMapping(value = "/product/get/{id}")
    Product getProductById(@PathVariable("id") Long id);
}