package com.zking.ssm.charge.service;

import com.zking.ssm.charge.model.Invoice;

/**
 * @author liang
 * @create 2020-12-17-16:08
 */
public interface IChargeInvoiceService {
    int deleteByPrimaryKey(String invoiceno);

    int insert(Invoice record);

    int insertSelective(Invoice record);

    Invoice selectByPrimaryKey(String invoiceno);

    int updateByPrimaryKeySelective(Invoice record);

    int updateByPrimaryKey(Invoice record);
}
