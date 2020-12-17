package com.zking.ssm.charge.service;

import com.zking.ssm.charge.model.Ininvoice;

/**
 * @author liang
 * @create 2020-12-17-16:07
 */
public interface IChargeIninvoiceService {
    int deleteByPrimaryKey(Integer id);

    int insert(Ininvoice record);

    int insertSelective(Ininvoice record);

    Ininvoice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ininvoice record);

    int updateByPrimaryKey(Ininvoice record);
}
