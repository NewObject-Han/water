package com.zking.ssm.charge.service;

import com.zking.ssm.charge.model.Bill;

/**
 * @author liang
 * @create 2020-12-17-16:03
 */
public interface IChargeBillService {
    int deleteByPrimaryKey(String billno);

    int insert(Bill record);

    int insertSelective(Bill record);

    Bill selectByPrimaryKey(String billno);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);
}
