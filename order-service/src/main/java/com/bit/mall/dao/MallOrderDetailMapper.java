package com.bit.mall.dao;

import com.bit.model.MallOrderDetail;

public interface MallOrderDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MallOrderDetail record);

    int insertSelective(MallOrderDetail record);

    MallOrderDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MallOrderDetail record);

    int updateByPrimaryKey(MallOrderDetail record);
}