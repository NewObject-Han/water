package com.zking.ssm.charge.service;

import com.zking.ssm.charge.model.Invoice;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author liang
 * @create 2020-12-17-16:08
 */
@Transactional
public interface IChargeInvoiceService {
    int deleteByPrimaryKey(String invoiceno);

    int insert(Invoice record);

    int insertSelective(Invoice record);

    Invoice selectByPrimaryKey(String invoiceno);

    int updateByPrimaryKeySelective(Invoice record);

    int updateByPrimaryKey(Invoice record);

    List queryList(Invoice record);
}
