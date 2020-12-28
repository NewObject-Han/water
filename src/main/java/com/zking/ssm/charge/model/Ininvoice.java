package com.zking.ssm.charge.model;

import lombok.Data;

import java.util.Date;
@Data
public class Ininvoice {
    private Integer id;

    private Integer invoicetype;

    private String startno;

    private String endno;

    private Integer counts;

    private Date indate;

    private Integer inempid;

   private  Integer Start;

   private  Integer End;
}