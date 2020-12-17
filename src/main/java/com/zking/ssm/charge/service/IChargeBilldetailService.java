package com.zking.ssm.charge.service;

import com.zking.ssm.charge.model.Billdetail;

/**
 * @author liang
 * @create 2020-12-17-16:01
 */
public interface IChargeBilldetailService {
    int deleteByPrimaryKey(Integer bid);

    int insert(Billdetail record);

    int insertSelective(Billdetail record);

    Billdetail selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(Billdetail record);

    int updateByPrimaryKey(Billdetail record);
}
