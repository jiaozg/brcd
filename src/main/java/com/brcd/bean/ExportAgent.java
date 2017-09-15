package com.brcd.bean;

import java.io.Serializable;

/** 导出数据的po
 * Created by 韩明泽 on 2017/9/14.
 */
public class ExportAgent implements Serializable{
    private String agentNumber;
    private String shotName;
    private String phone;
    private Integer agentGrade;
    private Integer auditStatus;
    private String businessArea;
    private String intoPermissions;
    private String  shareBenefit;
    private Double  rate;

    public ExportAgent(String agentNumber, String shotName, String phone, Integer agentGrade, Integer auditStatus, String businessArea, String intoPermissions, String shareBenefit, Double rate) {
        this.agentNumber = agentNumber;
        this.shotName = shotName;
        this.phone = phone;
        this.agentGrade = agentGrade;
        this.auditStatus = auditStatus;
        this.businessArea = businessArea;
        this.intoPermissions = intoPermissions;
        this.shareBenefit = shareBenefit;
        this.rate = rate;
    }

    public String getAgentNumber() {
        return agentNumber;
    }

    public void setAgentNumber(String agentNumber) {
        this.agentNumber = agentNumber;
    }

    public String getShotName() {
        return shotName;
    }

    public void setShotName(String shotName) {
        this.shotName = shotName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAgentGrade() {
        return agentGrade;
    }

    public void setAgentGrade(Integer agentGrade) {
        this.agentGrade = agentGrade;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getBusinessArea() {
        return businessArea;
    }

    public void setBusinessArea(String businessArea) {
        this.businessArea = businessArea;
    }

    public String getIntoPermissions() {
        return intoPermissions;
    }

    public void setIntoPermissions(String intoPermissions) {
        this.intoPermissions = intoPermissions;
    }

    public String getShareBenefit() {
        return shareBenefit;
    }

    public void setShareBenefit(String shareBenefit) {
        this.shareBenefit = shareBenefit;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}
