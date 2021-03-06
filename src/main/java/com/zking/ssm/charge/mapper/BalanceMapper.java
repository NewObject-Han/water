package com.zking.ssm.charge.mapper;

import com.zking.ssm.charge.model.Balance;

public interface BalanceMapper {
    int deleteByPrimaryKey(Integer bid);

    int insert(Balance record);

    int insertSelective(Balance record);

    Balance selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(Balance record);

    int updateByPrimaryKey(Balance record);
}