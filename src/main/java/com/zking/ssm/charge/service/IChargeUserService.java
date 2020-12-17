package com.zking.ssm.charge.service;

import com.zking.ssm.charge.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author liang
 * @create 2020-12-16-15:39
 */
@Transactional
public interface IChargeUserService {

    int deleteByPrimaryKey(String userno);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userno);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List queryUserList(User record);

}
