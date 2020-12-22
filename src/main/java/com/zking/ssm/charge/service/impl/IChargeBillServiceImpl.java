package com.zking.ssm.charge.service.impl;

import com.zking.ssm.charge.mapper.BillMapper;
import com.zking.ssm.charge.model.Bill;
import com.zking.ssm.charge.service.IChargeBillService;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liang
 * @create 2020-12-17-16:18
 */
@Scope("prototype")
@Service
public class IChargeBillServiceImpl implements IChargeBillService {
    @Autowired
    private BillMapper billMapper;

    @Override
    public int deleteByPrimaryKey(String billno) {
        return billMapper.deleteByPrimaryKey(billno);
    }

    @Override
    public int insert(Bill record) {
        return billMapper.insert(record);
    }

    @Override
    public int insertSelective(Bill record) {
        return billMapper.insertSelective(record);
    }

    @Override
    public Bill selectByPrimaryKey(String billno) {
        return billMapper.selectByPrimaryKey(billno);
    }

    @Override
    public int updateByPrimaryKeySelective(Bill record) {
        return billMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Bill record) {
        return billMapper.updateByPrimaryKey(record);
    }

    @Override
    public List queryBalance(String userid) {
        return billMapper.queryBalance(userid);
    }
}
