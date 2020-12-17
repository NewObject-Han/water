package com.zking.ssm.charge.mapper;

import com.zking.ssm.charge.model.Balancedetail;

public interface BalancedetailMapper {
    int deleteByPrimaryKey(Integer bid);

    int insert(Balancedetail record);

    int insertSelective(Balancedetail record);

    Balancedetail selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(Balancedetail record);

    int updateByPrimaryKey(Balancedetail record);
}