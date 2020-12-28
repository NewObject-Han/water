package com.zking.ssm.charge.service;

import com.zking.ssm.charge.model.Ininvoice;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author liang
 * @create 2020-12-17-16:07
 */
@Transactional
public interface IChargeIninvoiceService {
    int deleteByPrimaryKey(Integer id);

    int insert(Ininvoice record);

    int insertSelective(Ininvoice record);

    Ininvoice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ininvoice record);

    int updateByPrimaryKey(Ininvoice record);

    List selective(Ininvoice record);

}
