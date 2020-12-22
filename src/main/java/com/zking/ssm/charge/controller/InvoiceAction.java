package com.zking.ssm.charge.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.ssm.charge.model.Invoice;
import com.zking.ssm.charge.service.IChargeInvoiceService;
import com.zking.ssm.charge.service.impl.IChargeInvoiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author liang
 * @create 2020-12-18-18:23
 */
@Controller
@RequestMapping("ChargeInvoice")
public class InvoiceAction {
    @Autowired
    private IChargeInvoiceService iChargeInvoiceService;


    @RequestMapping("queryInvoice")
    @ResponseBody
    public PageInfo queryInvoice(String pageNum, String pageSize, Invoice invoice){
        PageHelper.startPage(Integer.valueOf(pageNum),Integer.valueOf(pageSize));
        List list = iChargeInvoiceService.queryList(invoice);
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }


    @RequestMapping("delInvoice")
    @ResponseBody
    public int delInvoice(Invoice invoice){
        return iChargeInvoiceService.deleteByPrimaryKey(invoice.getInvoiceno());
    }
}
