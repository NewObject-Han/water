package com.zking.ssm.charge.service;

import com.zking.ssm.charge.model.Userhistory;

/**
 * @author liang
 * @create 2020-12-17-16:11
 */
public interface IChargeUserhistoryService {
    int deleteByPrimaryKey(Integer uid);

    int insert(Userhistory record);

    int insertSelective(Userhistory record);

    Userhistory selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Userhistory record);

    int updateByPrimaryKey(Userhistory record);
}
