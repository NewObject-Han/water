package com.zking.ssm.charge.service;

import com.zking.ssm.charge.model.Bill;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author liang
 * @create 2020-12-17-16:03
 */
@Transactional
public interface IChargeBillService {
    int deleteByPrimaryKey(String billno);

    int insert(Bill record);

    int insertSelective(Bill record);

    Bill selectByPrimaryKey(String billno);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);

    List queryBalance(String userid);
}
