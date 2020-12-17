package com.zking.ssm.charge.model;

import java.util.Date;

public class Billdetail {
    private Integer bid;

    private String billno;

    private String userno;

    private String costtypecode;

    private Integer amount;

    private Float price;

    private Float detailmoney;

    private Float realmoney;

    private Long balance;

    private Date balancedate;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    public String getCosttypecode() {
        return costtypecode;
    }

    public void setCosttypecode(String costtypecode) {
        this.costtypecode = costtypecode == null ? null : costtypecode.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getDetailmoney() {
        return detailmoney;
    }

    public void setDetailmoney(Float detailmoney) {
        this.detailmoney = detailmoney;
    }

    public Float getRealmoney() {
        return realmoney;
    }

    public void setRealmoney(Float realmoney) {
        this.realmoney = realmoney;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Date getBalancedate() {
        return balancedate;
    }

    public void setBalancedate(Date balancedate) {
        this.balancedate = balancedate;
    }
}