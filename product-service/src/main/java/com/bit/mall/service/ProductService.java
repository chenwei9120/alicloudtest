package com.bit.mall.service;

import com.bit.mall.dao.ProductDao;
import com.bit.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenwei
 * @version 1.0.0
 * @ClassName ProductService.java
 * @Description TODO
 * @createTime 2020年04月27日 08:33:00
 */
@Service
public class ProductService {

    @Autowired(required = false)
    private ProductDao productDao;


    public Product getProductById(Long id) {
        Product product = productDao.selectByPrimaryKey(id);
        return product;
    }

    public List<Product> query(int pageNum, int pageSize) {
        List<Product> productList = productDao.query(pageNum, pageSize);
        return productList;
    }
}