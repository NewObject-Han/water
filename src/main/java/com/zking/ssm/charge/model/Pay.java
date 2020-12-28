package com.zking.ssm.charge.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
@Data
public class Pay {
    private String payno;

    private String userno;

    private String paytype;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date paydate;

    private String invoice;

    private Float paymoney;

    private Float usemoney;

    private Integer empid;

    //用户字段
    private  String username;
}