package com.zking.ssm.charge.model;

import java.math.BigDecimal;
import java.util.Date;

public class Bill {
    private String billno;

    private Integer readid;

    private String userno;

    private Date createdate;

    private BigDecimal billmoney;

    private BigDecimal realmoney;

    private Long balance;

    private Date balancedate;

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno == null ? null : billno.trim();
    }

    public Integer getReadid() {
        return readid;
    }

    public void setReadid(Integer readid) {
        this.readid = readid;
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public BigDecimal getBillmoney() {
        return billmoney;
    }

    public void setBillmoney(BigDecimal billmoney) {
        this.billmoney = billmoney;
    }

    public BigDecimal getRealmoney() {
        return realmoney;
    }

    public void setRealmoney(BigDecimal realmoney) {
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