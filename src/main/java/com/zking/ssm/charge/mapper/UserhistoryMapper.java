package com.zking.ssm.charge.mapper;

import com.zking.ssm.charge.model.Userhistory;

public interface UserhistoryMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Userhistory record);

    int insertSelective(Userhistory record);

    Userhistory selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Userhistory record);

    int updateByPrimaryKey(Userhistory record);
}