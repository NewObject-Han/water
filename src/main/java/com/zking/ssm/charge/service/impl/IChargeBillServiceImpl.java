package com.zking.ssm.charge.service.impl;

import com.zking.ssm.charge.model.Bill;
import com.zking.ssm.charge.service.IChargeBillService;

/**
 * @author liang
 * @create 2020-12-17-16:18
 */
public class IChargeBillServiceImpl implements IChargeBillService {
    @Override
    public int deleteByPrimaryKey(String billno) {
        return 0;
    }

    @Override
    public int insert(Bill record) {
        return 0;
    }

    @Override
    public int insertSelective(Bill record) {
        return 0;
    }

    @Override
    public Bill selectByPrimaryKey(String billno) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Bill record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Bill record) {
        return 0;
    }
}
