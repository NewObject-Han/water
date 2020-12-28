package com.zking.ssm.charge.mapper;

import com.zking.ssm.charge.model.Read;

public interface ReadMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Read record);

    int insertSelective(Read record);

    Read selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Read record);

    int updateByPrimaryKey(Read record);


}