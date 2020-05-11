package com.bit.mall.dao;

import com.bit.model.Product;

import java.util.List;

public interface ProductDao {

    Product selectByPrimaryKey(Long id);

    List<Product> query(int pageNum, int pageSize);
}