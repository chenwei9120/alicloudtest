package com.bit.mall.controller;

import com.bit.mall.dao.ProductDao;
import com.bit.mall.service.ProductService;
import com.bit.model.Product;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName ProductController.java
 * @Description TODO
 * @createTime 2020年02月15日 21:41:00
 */
@RestController
public class ProductController {

    @Autowired(required = false)
    private ProductService productService;

    @RequestMapping("/get/{id}")
    public Product getProductById(@PathVariable Long id) {
//        Product product = new Product();
//        product.setId(id);
//        product.setName("食用葵花油");
        try {
            return productService.getProductById(id);
        } catch (RuntimeException e) {
            System.out.println(e);
            return null;
        }
    }

    @RequestMapping(value="/timeout")
    public void timeoutAction() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("product timeout finished.");
        }
    }

    @RequestMapping("/gateWay4Header")
    public Object gateWay4Header(@RequestHeader("X-Request-Company") String company) {
        return "gateWay拿到请求头"+company;
    }

    @GetMapping("/query")
    public PageInfo<Product> getAllBooks(@RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                                  @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Product> bookList = productService.query(pageNum, pageSize);
        PageInfo<Product> pageInfo = new PageInfo<>(bookList);
        System.out.println("总条数=" + pageInfo.getTotal());
        return pageInfo;
    }
}