package com.bit.order_api;

import com.bit.model.Product;
import com.bit.order_api.config.ProductCenterFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName ProductAPI.java
 * @Description TODO
 * @createTime 2020年02月15日 21:27:00
 */

@FeignClient(name = "product_service",configuration = ProductCenterFeignConfig.class)
public interface ProductAPI {

    @RequestMapping("/get/product/{id}")
    Product selectProductInfoById(@PathVariable Long id);
}