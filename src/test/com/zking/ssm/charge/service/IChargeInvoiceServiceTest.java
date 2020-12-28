package com.zking.ssm.charge.service;

import com.zking.ssm.charge.mapper.InvoiceMapper;
import com.zking.ssm.charge.model.Ininvoice;
import com.zking.ssm.charge.model.Invoice;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author liang
 * @create 2020-12-25-21:48
 */
public class IChargeInvoiceServiceTest extends BaseTestCase {

    @Autowired
    InvoiceMapper invoiceMapper;


    @Test
    public void insertSelective() {
        Invoice invoice=new Invoice();
        invoice.setInvoiceno("00000002");
        try {
            int i = invoiceMapper.insertSelective(invoice);
            System.out.println(i);
        }catch (Exception e) {
            System.out.println("错了");
        }
    }
}