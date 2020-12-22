package com.zking.ssm.charge.mapper;

import com.zking.ssm.charge.model.Invoice;

import java.util.List;

public interface InvoiceMapper {
    int deleteByPrimaryKey(String invoiceno);

    int insert(Invoice record);

    int insertSelective(Invoice record);

    Invoice selectByPrimaryKey(String invoiceno);

    int updateByPrimaryKeySelective(Invoice record);

    int updateByPrimaryKey(Invoice record);

    List queryList(Invoice record);
}