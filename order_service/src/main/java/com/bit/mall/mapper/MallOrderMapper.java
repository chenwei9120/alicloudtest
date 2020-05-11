package com.bit.mall.mapper;

import com.bit.mall.model.MallOrder;

public interface MallOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MallOrder record);

    int insertSelective(MallOrder record);

    MallOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MallOrder record);

    int updateByPrimaryKey(MallOrder record);
}