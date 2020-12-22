package com.zking.ssm.charge.mapper;

import com.zking.ssm.charge.model.Bill;

import java.util.List;

public interface BillMapper {
    int deleteByPrimaryKey(String billno);

    int insert(Bill record);

    int insertSelective(Bill record);

    Bill selectByPrimaryKey(String billno);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);

    List queryBalance(String userno);
}