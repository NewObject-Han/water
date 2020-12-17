package com.zking.ssm.charge.service;

import com.zking.ssm.charge.model.Outinvoice;

/**
 * @author liang
 * @create 2020-12-17-16:09
 */
public interface IChargeOutinvoiceService {
    int deleteByPrimaryKey(Integer id);

    int insert(Outinvoice record);

    int insertSelective(Outinvoice record);

    Outinvoice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Outinvoice record);

    int updateByPrimaryKey(Outinvoice record);
}
