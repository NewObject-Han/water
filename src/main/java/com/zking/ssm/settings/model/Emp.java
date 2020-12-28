package com.zking.ssm.settings.model;

import lombok.Data;

@Data
public class Emp {
    private Integer eid;

    private String empname;

    private String empno;

    private String pwd;

    private String salt;

    private Integer deptid;

    private String remark;

    private Integer disabled;


}