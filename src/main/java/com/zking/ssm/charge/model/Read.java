package com.zking.ssm.charge.model;

import lombok.Data;

import java.util.Date;
@Data
public class Read {
    private Integer rid;

    private Integer readyear;

    private Integer readmonth;

    private String userno;

    private String meterno;

    private Integer maxvalue;

    private Integer volumeid;

    private Integer volumeindex;

    private Integer readempid;

    private Date readdate;

    private Integer prevalue;

    private Boolean enter;

    private Integer curvalue;

    private Boolean dial;

    private Integer amount;

    private String formula;

    private Boolean audit;

    private Integer auditempid;

    private Date auditdate;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getReadyear() {
        return readyear;
    }

    public void setReadyear(Integer readyear) {
        this.readyear = readyear;
    }

    public Integer getReadmonth() {
        return readmonth;
    }

    public void setReadmonth(Integer readmonth) {
        this.readmonth = readmonth;
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    public String getMeterno() {
        return meterno;
    }

    public void setMeterno(String meterno) {
        this.meterno = meterno == null ? null : meterno.trim();
    }

    public Integer getMaxvalue() {
        return maxvalue;
    }

    public void setMaxvalue(Integer maxvalue) {
        this.maxvalue = maxvalue;
    }

    public Integer getVolumeid() {
        return volumeid;
    }

    public void setVolumeid(Integer volumeid) {
        this.volumeid = volumeid;
    }

    public Integer getVolumeindex() {
        return volumeindex;
    }

    public void setVolumeindex(Integer volumeindex) {
        this.volumeindex = volumeindex;
    }

    public Integer getReadempid() {
        return readempid;
    }

    public void setReadempid(Integer readempid) {
        this.readempid = readempid;
    }

    public Date getReaddate() {
        return readdate;
    }

    public void setReaddate(Date readdate) {
        this.readdate = readdate;
    }

    public Integer getPrevalue() {
        return prevalue;
    }

    public void setPrevalue(Integer prevalue) {
        this.prevalue = prevalue;
    }

    public Boolean getEnter() {
        return enter;
    }

    public void setEnter(Boolean enter) {
        this.enter = enter;
    }

    public Integer getCurvalue() {
        return curvalue;
    }

    public void setCurvalue(Integer curvalue) {
        this.curvalue = curvalue;
    }

    public Boolean getDial() {
        return dial;
    }

    public void setDial(Boolean dial) {
        this.dial = dial;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula == null ? null : formula.trim();
    }

    public Boolean getAudit() {
        return audit;
    }

    public void setAudit(Boolean audit) {
        this.audit = audit;
    }

    public Integer getAuditempid() {
        return auditempid;
    }

    public void setAuditempid(Integer auditempid) {
        this.auditempid = auditempid;
    }

    public Date getAuditdate() {
        return auditdate;
    }

    public void setAuditdate(Date auditdate) {
        this.auditdate = auditdate;
    }
}