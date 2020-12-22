package com.zking.ssm.charge.controller;

import com.zking.ssm.charge.model.Bill;
import com.zking.ssm.charge.service.IChargeBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author liang
 * @create 2020-12-18-13:16
 */
@Controller
@RequestMapping("ChargeBill")
public class BillAction {
    @Autowired
    private IChargeBillService chargeBillService;

    @ResponseBody
    @RequestMapping("queryBalance")
    public List queryBill(String userno){
        List<Bill> list = chargeBillService.queryBalance(userno);
        list.forEach(lst->{
            lst.setUserno((lst.getBillmoney()-lst.getRealmoney())+"");
        });
        return list;
    }


    @ResponseBody
    @RequestMapping("getBill")
    public Bill getBill(String id){
        Bill bill = chargeBillService.selectByPrimaryKey(id);
        return bill;
    }
}
