package com.zking.ssm.charge.service.impl;

import com.zking.ssm.charge.model.Pay;
import com.zking.ssm.charge.service.IChargePayService;

/**
 * @author liang
 * @create 2020-12-17-16:19
 */
public class IChargePayServiceImpl implements IChargePayService {
    @Override
    public int deleteByPrimaryKey(String payno) {
        return 0;
    }

    @Override
    public int insert(Pay record) {
        return 0;
    }

    @Override
    public int insertSelective(Pay record) {
        return 0;
    }

    @Override
    public Pay selectByPrimaryKey(String payno) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Pay record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Pay record) {
        return 0;
    }
}
