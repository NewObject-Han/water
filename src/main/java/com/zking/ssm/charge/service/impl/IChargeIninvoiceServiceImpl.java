package com.zking.ssm.charge.service.impl;

import com.zking.ssm.charge.mapper.IninvoiceMapper;
import com.zking.ssm.charge.model.Ininvoice;
import com.zking.ssm.charge.service.IChargeIninvoiceService;
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
public class IChargeIninvoiceServiceImpl implements IChargeIninvoiceService {
    @Autowired
    private IninvoiceMapper ininvoiceMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return ininvoiceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Ininvoice record) {
        return ininvoiceMapper.insert(record);
    }

    @Override
    public int insertSelective(Ininvoice record) {
        return ininvoiceMapper.insertSelective(record);
    }

    @Override
    public Ininvoice selectByPrimaryKey(Integer id) {
        return ininvoiceMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Ininvoice record) {
        return ininvoiceMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKey(Ininvoice record) {
        return ininvoiceMapper.updateByPrimaryKey(record);
    }

    @Override
    public List selective(Ininvoice record) {
        return ininvoiceMapper.selective(record);
    }
}
