package com.zking.ssm.charge.service.impl;

import com.zking.ssm.charge.model.Invoice;
import com.zking.ssm.charge.service.IChargeInvoiceService;

/**
 * @author liang
 * @create 2020-12-17-16:18
 */
public class IChargeInvoiceServiceImpl implements IChargeInvoiceService {
    @Override
    public int deleteByPrimaryKey(String invoiceno) {
        return 0;
    }

    @Override
    public int insert(Invoice record) {
        return 0;
    }

    @Override
    public int insertSelective(Invoice record) {
        return 0;
    }

    @Override
    public Invoice selectByPrimaryKey(String invoiceno) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Invoice record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Invoice record) {
        return 0;
    }
}
