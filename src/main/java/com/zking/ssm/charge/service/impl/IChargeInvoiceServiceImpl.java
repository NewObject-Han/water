package com.zking.ssm.charge.service.impl;

import com.zking.ssm.charge.mapper.InvoiceMapper;
import com.zking.ssm.charge.model.Invoice;
import com.zking.ssm.charge.service.IChargeInvoiceService;
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
public class IChargeInvoiceServiceImpl implements IChargeInvoiceService {
    @Autowired
    public InvoiceMapper invoiceMapper;
    @Override
    public int deleteByPrimaryKey(String invoiceno) {
        return invoiceMapper.deleteByPrimaryKey(invoiceno);
    }

    @Override
    public int insert(Invoice record) {
        return invoiceMapper.insert(record);
    }

    @Override
    public int insertSelective(Invoice record) {
        return invoiceMapper.insertSelective(record);
    }

    @Override
    public Invoice selectByPrimaryKey(String invoiceno) {
        return invoiceMapper.selectByPrimaryKey(invoiceno);
    }

    @Override
    public int updateByPrimaryKeySelective(Invoice record) {
        return invoiceMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Invoice record) {
        return invoiceMapper.updateByPrimaryKey(record);
    }

    @Override
    public List queryList(Invoice record) {
        return invoiceMapper.queryList(record);
    }
}
