package com.zking.ssm.charge.mapper;

import com.zking.ssm.charge.model.Pay;

public interface PayMapper {
    int deleteByPrimaryKey(String payno);

    int insert(Pay record);

    int insertSelective(Pay record);

    Pay selectByPrimaryKey(String payno);

    int updateByPrimaryKeySelective(Pay record);

    int updateByPrimaryKey(Pay record);
}