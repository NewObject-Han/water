package com.zking.ssm.charge.mapper;

import com.zking.ssm.charge.model.Pay;

import java.util.List;

public interface PayMapper {
    int deleteByPrimaryKey(String payno);

    int insert(Pay record);

    int insertSelective(Pay record);

    Pay selectByPrimaryKey(String payno);

    int updateByPrimaryKeySelective(Pay record);

    int updateByPrimaryKey(Pay record);


    List selectHistory(Pay record);

    List queryUserPay();
}