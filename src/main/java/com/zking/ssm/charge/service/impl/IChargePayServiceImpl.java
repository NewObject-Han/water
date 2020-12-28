package com.zking.ssm.charge.service.impl;

import com.zking.ssm.charge.mapper.PayMapper;
import com.zking.ssm.charge.model.Pay;
import com.zking.ssm.charge.service.IChargePayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liang
 * @create 2020-12-17-16:19
 */
@Scope("prototype")
@Service
public class IChargePayServiceImpl implements IChargePayService {
    @Autowired
    private PayMapper iChargePayService;

    @Override
    public int deleteByPrimaryKey(String payno) {
        return iChargePayService.deleteByPrimaryKey(payno);
    }

    @Override
    public int insert(Pay record) {
        return iChargePayService.insert(record);
    }

    @Override
    public int insertSelective(Pay record) {
        return iChargePayService.insertSelective(record);
    }

    @Override
    public Pay selectByPrimaryKey(String payno) {
        return iChargePayService.selectByPrimaryKey(payno);
    }

    @Override
    public int updateByPrimaryKeySelective(Pay record) {
        return iChargePayService.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Pay record) {
        return iChargePayService.updateByPrimaryKey(record);
    }

    @Override
    public List selectHistory(Pay record) {
        return iChargePayService.selectHistory(record);
    }

    @Override
    public List queryUserPay() {
        return iChargePayService.queryUserPay();
    }
}
