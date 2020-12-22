package com.zking.ssm.charge.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.ssm.charge.model.Pay;
import com.zking.ssm.charge.service.IChargePayService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;

/**
 * @author liang
 * @create 2020-12-21-14:42
 */
@Controller
@RequestMapping("/ChargePay")
public class PayAction {
    @Autowired
    private IChargePayService chargePayService;

    @ResponseBody
    @RequestMapping("/InsertPay")
    public String insertPar(Pay pay) {

        String payno = pay.getUserno();
        LocalDateTime time = LocalDateTime.now();
        //拼接ID
        String str = "JF" + payno + time.toString();
        pay.setPayno(str);
        //时间转换
        pay.setPaydate(Date.from(time.atZone(ZoneId.systemDefault()).toInstant()));
        chargePayService.insertSelective(pay);
        return str;
    }

    @RequestMapping("/GetPay")
    @ResponseBody
    public Pay getPay(String payno) {
        Pay pay = chargePayService.selectByPrimaryKey(payno);
        return pay;
    }


    @ResponseBody
    @RequestMapping("SelectHistory")
    public PageInfo SelectHistory(Pay pay) {
        PageHelper.startPage(1,8);
        List list = chargePayService.selectHistory(pay);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }
}
