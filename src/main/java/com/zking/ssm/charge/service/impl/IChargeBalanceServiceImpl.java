package com.zking.ssm.charge.service.impl;

import com.zking.ssm.charge.model.Balance;
import com.zking.ssm.charge.service.IChargeBalanceService;

/**
 * @author liang
 * @create 2020-12-17-16:18
 */
public class IChargeBalanceServiceImpl implements IChargeBalanceService {
    @Override
    public int deleteByPrimaryKey(Integer bid) {
        return 0;
    }

    @Override
    public int insert(Balance record) {
        return 0;
    }

    @Override
    public int insertSelective(Balance record) {
        return 0;
    }

    @Override
    public Balance selectByPrimaryKey(Integer bid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Balance record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Balance record) {
        return 0;
    }
}
