package com.zking.ssm.charge.controller;

import com.zking.ssm.charge.model.Ininvoice;
import com.zking.ssm.charge.model.Invoice;
import com.zking.ssm.charge.service.IChargeIninvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

/**
 * @author liang
 * @create 2020-12-28-9:19
 */
@Controller
@RequestMapping("ChargeIninvoice")
public class IninvoiceAction {

    @Autowired
    private IChargeIninvoiceService iChargeIninvoiceService;


    @RequestMapping("/insertIninvoice")
    @ResponseBody
    public int insertInvoice(Ininvoice ininvoice) {
        ininvoice.setStartno(ininvoice.getStart()+"");
        ininvoice.setEndno(ininvoice.getEnd()+"");
        try {
            List selective = iChargeIninvoiceService.selective(ininvoice);
            if (selective.size()>=1) {
                return 3;
            } else {
                ininvoice.setIndate(Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant()));
                iChargeIninvoiceService.insertSelective(ininvoice);
            }
        } catch (Exception e) {
            return 0;
        }
        return ininvoice.getStart();
    }
}
