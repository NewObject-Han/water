package com.zking.ssm.charge.service;

import com.zking.ssm.charge.model.Balance;

/**
 * @author liang
 * @create 2020-12-17-16:00
 */
public interface IChargeBalanceService {
    int deleteByPrimaryKey(Integer bid);

    int insert(Balance record);

    int insertSelective(Balance record);

    Balance selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(Balance record);

    int updateByPrimaryKey(Balance record);
}
