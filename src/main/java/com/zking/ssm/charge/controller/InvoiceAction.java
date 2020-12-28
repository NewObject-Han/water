package com.zking.ssm.charge.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.ssm.charge.model.Ininvoice;
import com.zking.ssm.charge.model.Invoice;
import com.zking.ssm.charge.service.IChargeIninvoiceService;
import com.zking.ssm.charge.service.IChargeInvoiceService;
import com.zking.ssm.charge.service.impl.IChargeInvoiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

/**
 * @author liang
 * @create 2020-12-18-18:23
 */
@Controller
@RequestMapping("/ChargeInvoice")
public class InvoiceAction {
    @Autowired
    private IChargeInvoiceService iChargeInvoiceService;


    /**
     * 发票查询
     * @param pageNum
     * @param pageSize
     * @param invoice
     * @return
     */
    @RequestMapping("/queryInvoice")
    @ResponseBody
    public PageInfo queryInvoice(String pageNum, String pageSize, Invoice invoice) {
        PageHelper.startPage(Integer.valueOf(pageNum), Integer.valueOf(pageSize));
        List list = iChargeInvoiceService.queryList(invoice);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }




    @RequestMapping("/delInvoice")
    @ResponseBody
    public int delInvoice(Invoice invoice) {
        return iChargeInvoiceService.deleteByPrimaryKey(invoice.getInvoiceno());
    }

    /**
     * 新增发票
     * @param end
     * @param start
     * @param type
     * @param ini
     * @return
     */
    @RequestMapping("/insertInvoice")
    @ResponseBody
    public int addInvoice(Integer end,Integer start,Integer type,int ini) {
        Invoice invoice=new Invoice();
        for (int i=start;i<end; i++ ){
            invoice.setInvoiceno(i+"");
            invoice.setInvoicetype(type);
            invoice.setInid(ini);
            invoice.setUsed((long) 0);
            iChargeInvoiceService.insertSelective(invoice);
        }
        return 0;
    }

    /**
     * 发票状态更改
     * @return
     */
    @RequestMapping("EditInvoice")
    @ResponseBody
    public int editInvoice(Invoice invoice){
        invoice.setUsedate(Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant()));

        return iChargeInvoiceService.updateByPrimaryKeySelective(invoice);
    }

}
