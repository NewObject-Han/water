package com.zking.ssm.charge.service;

import com.zking.ssm.charge.model.Bill;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author liang
 * @create 2020-12-23-9:37
 */
public class IChargeBillServiceTest extends BaseTestCase {

    @Autowired
    IChargeBillService iChargeBillService;
    Bill bill=new Bill();
    @Before
    public void setUp() throws Exception {
        bill.setUserno("1200000002");
    }

    @Test
    public void queryReadJOIN() {
        Bill byPrimaryKey = iChargeBillService.getByPrimaryKey(bill);
        System.out.println(byPrimaryKey);
    }
}