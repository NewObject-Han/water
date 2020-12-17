package com.zking.ssm.charge.service;

import com.zking.ssm.charge.model.Pay;

/**
 * @author liang
 * @create 2020-12-17-16:10
 */
public interface IChargePayService {
    int deleteByPrimaryKey(String payno);

    int insert(Pay record);

    int insertSelective(Pay record);

    Pay selectByPrimaryKey(String payno);

    int updateByPrimaryKeySelective(Pay record);

    int updateByPrimaryKey(Pay record);
}
