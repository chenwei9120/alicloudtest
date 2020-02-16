package com.bit.order_service.api;

import com.bit.model.Product;
import com.bit.order_api.config.ProductCenterFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName ProductAPI.java
 * @Description TODO
 * @createTime 2020年02月15日 21:27:00
 */

@FeignClient(name = "product-service",configuration = ProductCenterFeignConfig.class)
public interface ProductAPI {

    @RequestMapping(value = "/product/get/{id}")
    Product getProductById(@PathVariable("id") Long id);
}
