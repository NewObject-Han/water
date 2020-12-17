package com.zking.ssm.charge.mapper;

import com.zking.ssm.charge.model.Sumreport;

public interface SumreportMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Sumreport record);

    int insertSelective(Sumreport record);

    Sumreport selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Sumreport record);

    int updateByPrimaryKey(Sumreport record);
}