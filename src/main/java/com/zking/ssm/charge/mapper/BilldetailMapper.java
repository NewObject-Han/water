package com.zking.ssm.charge.mapper;

import com.zking.ssm.charge.model.Billdetail;

public interface BilldetailMapper {
    int deleteByPrimaryKey(Integer bid);

    int insert(Billdetail record);

    int insertSelective(Billdetail record);

    Billdetail selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(Billdetail record);

    int updateByPrimaryKey(Billdetail record);
}