package com.zking.ssm.charge.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.ssm.charge.model.Bill;
import com.zking.ssm.charge.model.BillJOIN;
import com.zking.ssm.charge.model.JOINRead;
import com.zking.ssm.charge.service.IChargeBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liang
 * @create 2020-12-18-13:16
 */
@Controller
@RequestMapping("/ChargeBill")
public class BillAction {
    @Autowired
    private IChargeBillService chargeBillService;

    @ResponseBody
    @RequestMapping("/queryBalance")
    public List queryBill(String userno) {
        List<Bill> list = chargeBillService.queryBalance(userno);
        list.forEach(lst -> {
            lst.setUserno((lst.getBillmoney() - lst.getRealmoney()) + "");
        });
        return list;
    }

    /**
     * 修改水费单
     * @param bill
     * @return
     */
    @ResponseBody
    @RequestMapping("/EditBill")
    public int EditBill(Bill bill){
        try {
            //查找
            Bill primary = chargeBillService.getByPrimaryKey(bill);
            if (primary!=null){
                System.out.println("aaaaaaaaaaaaaa");
                if (primary.getBillmoney().equals(bill.getRealmoney()+primary.getRealmoney())){
                    primary.setBalance(Long.valueOf(1));
                }
                primary.setRealmoney(bill.getRealmoney()+primary.getRealmoney());
                //修改
                chargeBillService.updateByPrimaryKeySelective(primary);
            }
        }catch (Exception e){
            return 0;
        }
        return 1;
    }

    @ResponseBody
    @RequestMapping("/getBill")
    public Bill getBill(String id) {
        Bill bill = chargeBillService.selectByPrimaryKey(id);
        return bill;
    }

    @ResponseBody
    @RequestMapping("/BillJOIOReaded")
    public List BillJOIOReaded(Bill bill) {
        List<BillJOIN> billJOINS = chargeBillService.queryReadJOIN(bill);
        List<JOINRead> list = new ArrayList<>();
        billJOINS.forEach(b -> {
            JOINRead read = new JOINRead();
            read.setCreatedate(b.getCreatedate());
            read.setPrevalue(b.getPrevalue() + " Z");
            read.setCurvalue(b.getCurvalue() + " Z");
            read.setAmount(b.getAmount() + "吨");
            read.setBillmoney(b.getBillmoney() + "元");
            read.setRealmoney(b.getRealmoney() + "元");
            read.setAuditempid((b.getBillmoney() - b.getRealmoney()));
            list.add(read);
        });
        return list;
    }

    /**
     * 欠款报表
     * @param pageNum
     * @param pageSize
     * @return
     */
    @ResponseBody
    @RequestMapping("/SelectArrears")
    public PageInfo SelectArrears(String pageNum,String pageSize){
        PageHelper.startPage(Integer.valueOf(pageNum), Integer.valueOf(pageSize));
        List<BillJOIN> joins = chargeBillService.selectByJoin();

        List<JOINRead> list = new ArrayList<>();
        joins.forEach(b -> {
            JOINRead read = new JOINRead();
            read.setCreatedate(b.getCreatedate());
            read.setPrevalue(b.getPrevalue() + " Z");
            read.setCurvalue(b.getCurvalue() + " Z");
            read.setAmount(b.getAmount() + "吨");
            read.setBillmoney(b.getBillmoney() + "元");
            read.setRealmoney(b.getRealmoney() + "元");
            read.setAuditempid((b.getBillmoney() - b.getRealmoney()));
            read.setUsername(b.getUsername());
            read.setUserno(b.getUserno());
            read.setBillno(b.getBillno());
            list.add(read);
        });
        PageInfo pageInfo=new PageInfo(list);
        return  pageInfo;
    }


}
