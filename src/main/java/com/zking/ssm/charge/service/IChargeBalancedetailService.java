package com.zking.ssm.charge.service;

import com.zking.ssm.charge.model.Balancedetail;

/**
 * @author liang
 * @create 2020-12-17-15:59
 */
public interface IChargeBalancedetailService {
    int deleteByPrimaryKey(Integer bid);

    int insert(Balancedetail record);

    int insertSelective(Balancedetail record);

    Balancedetail selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(Balancedetail record);

    int updateByPrimaryKey(Balancedetail record);
}
