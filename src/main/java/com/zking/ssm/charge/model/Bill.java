package com.zking.ssm.charge.model;

import lombok.Data;

import java.util.Date;
@Data
public class Bill {
    private String billno;

    private Integer readid;

    private String userno;

    private Date createdate;

    private Float billmoney;

    private Float realmoney;

    private Long balance;

    private Date balancedate;

    private Read read;
}