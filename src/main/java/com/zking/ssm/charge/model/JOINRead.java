package com.zking.ssm.charge.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author liang
 * @create 2020-12-23-16:25
 */
@Data
public class JOINRead {
    private String billno;

    private String readid;

    private String userno;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createdate;

    private String billmoney;

    private String realmoney;

    private Long balance;

    private Date balancedate;
    private String rid;

    private String readyear;

    private String readmonth;

    private String meterno;

    private String maxvalue;

    private String volumeid;

    private String volumeindex;

    private String readempid;

    private Date readdate;

    private String prevalue;

    private Boolean enter;

    private String curvalue;

    private Boolean dial;

    private String amount;

    private String formula;

    private Boolean audit;

    private Float auditempid;

    private Date auditdate;

    private String username;
}
