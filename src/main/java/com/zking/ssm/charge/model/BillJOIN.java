package com.zking.ssm.charge.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author liang
 * @create 2020-12-23-10:35
 */
@Data
public class BillJOIN {
    private String billno;

    private Integer readid;

    private String userno;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createdate;

    private Float billmoney;

    private Float realmoney;

    private Long balance;

    private Date balancedate;
    private Integer rid;

    private Integer readyear;

    private Integer readmonth;

    private String meterno;

    private Integer maxvalue;

    private Integer volumeid;

    private Integer volumeindex;

    private Integer readempid;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date readdate;

    private Integer prevalue;

    private Boolean enter;

    private Integer curvalue;

    private Boolean dial;

    private Integer amount;

    private String formula;

    private Boolean audit;

    private Integer auditempid;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date auditdate;

    private String username;

}
