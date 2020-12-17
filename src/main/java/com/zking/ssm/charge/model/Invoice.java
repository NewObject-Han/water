package com.zking.ssm.charge.model;

import java.util.Date;

public class Invoice {
    private String invoiceno;

    private Integer invoicetype;

    private Integer empid;

    private Integer inid;

    private Integer outid;

    private Integer archiveid;

    private Long used;

    private Date usedate;

    private Long invalid;

    private Date invaliddate;

    private Long archived;

    private Date archivedate;

    public String getInvoiceno() {
        return invoiceno;
    }

    public void setInvoiceno(String invoiceno) {
        this.invoiceno = invoiceno == null ? null : invoiceno.trim();
    }

    public Integer getInvoicetype() {
        return invoicetype;
    }

    public void setInvoicetype(Integer invoicetype) {
        this.invoicetype = invoicetype;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getInid() {
        return inid;
    }

    public void setInid(Integer inid) {
        this.inid = inid;
    }

    public Integer getOutid() {
        return outid;
    }

    public void setOutid(Integer outid) {
        this.outid = outid;
    }

    public Integer getArchiveid() {
        return archiveid;
    }

    public void setArchiveid(Integer archiveid) {
        this.archiveid = archiveid;
    }

    public Long getUsed() {
        return used;
    }

    public void setUsed(Long used) {
        this.used = used;
    }

    public Date getUsedate() {
        return usedate;
    }

    public void setUsedate(Date usedate) {
        this.usedate = usedate;
    }

    public Long getInvalid() {
        return invalid;
    }

    public void setInvalid(Long invalid) {
        this.invalid = invalid;
    }

    public Date getInvaliddate() {
        return invaliddate;
    }

    public void setInvaliddate(Date invaliddate) {
        this.invaliddate = invaliddate;
    }

    public Long getArchived() {
        return archived;
    }

    public void setArchived(Long archived) {
        this.archived = archived;
    }

    public Date getArchivedate() {
        return archivedate;
    }

    public void setArchivedate(Date archivedate) {
        this.archivedate = archivedate;
    }
}