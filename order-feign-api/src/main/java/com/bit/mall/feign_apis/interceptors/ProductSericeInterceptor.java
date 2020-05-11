package com.bit.mall.feign_apis.interceptors;

import feign.RequestInterceptor;
import feign.RequestTemplate;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName ProductSericeInterceptor.java
 * @Description TODO
 * @createTime 2020年02月17日 15:29:00
 */
public class ProductSericeInterceptor implements RequestInterceptor {

    public void apply(RequestTemplate requestTemplate) {
        //template.header("token", UUID.randomUUID().toString());
        System.out.println("ProductSericeInterceptor::apply mehod.");
    }

}