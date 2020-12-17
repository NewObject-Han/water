package com.zking.ssm.charge.mapper;

import com.zking.ssm.charge.model.Outinvoice;

public interface OutinvoiceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Outinvoice record);

    int insertSelective(Outinvoice record);

    Outinvoice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Outinvoice record);

    int updateByPrimaryKey(Outinvoice record);
}