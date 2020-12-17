package com.zking.ssm.charge.mapper;

import com.zking.ssm.charge.model.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String userno);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userno);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List queryUserList(User record);
}