package com.zking.ssm.charge.service.impl;

import com.zking.ssm.charge.mapper.UserMapper;
import com.zking.ssm.charge.model.User;
import com.zking.ssm.charge.service.IChargeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liang
 * @create 2020-12-16-15:42
 */
@Service
@Scope("prototype")
public class IChargeUserServiceImpl implements IChargeUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(String userno) {
        return userMapper.deleteByPrimaryKey(userno);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(String userno) {
        return userMapper.selectByPrimaryKey(userno);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public List queryUserList(User record) {
        return userMapper.queryUserList(record);
    }
}
