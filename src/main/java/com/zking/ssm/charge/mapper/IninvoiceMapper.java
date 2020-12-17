package com.zking.ssm.charge.mapper;

import com.zking.ssm.charge.model.Ininvoice;

public interface IninvoiceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ininvoice record);

    int insertSelective(Ininvoice record);

    Ininvoice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ininvoice record);

    int updateByPrimaryKey(Ininvoice record);
}