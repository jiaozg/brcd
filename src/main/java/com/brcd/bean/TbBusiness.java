package com.brcd.bean;

public class TbBusiness {
    private Integer businessId;

    private Integer wechatPay;

    private Integer wechatRate;

    private Integer wechatT0;

    private String wechatIndustry;

    private String wechatType;

    private String wechatNum;

    private Integer alipay;

    private Integer aliRate;

    private Integer aliT0;

    private String aliIndustry;

    private String aliType;

    private String alipayNum;

    private String businessUid;

    public String getBusinessUid() {
        return businessUid;
    }

    public void setBusinessUid(String businessUid) {
        this.businessUid = businessUid;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getWechatPay() {
        return wechatPay;
    }

    public void setWechatPay(Integer wechatPay) {
        this.wechatPay = wechatPay;
    }

    public Integer getWechatRate() {
        return wechatRate;
    }

    public void setWechatRate(Integer wechatRate) {
        this.wechatRate = wechatRate;
    }

    public Integer getWechatT0() {
        return wechatT0;
    }

    public void setWechatT0(Integer wechatT0) {
        this.wechatT0 = wechatT0;
    }

    public String getWechatIndustry() {
        return wechatIndustry;
    }

    public void setWechatIndustry(String wechatIndustry) {
        this.wechatIndustry = wechatIndustry == null ? null : wechatIndustry.trim();
    }

    public String getWechatType() {
        return wechatType;
    }

    public void setWechatType(String wechatType) {
        this.wechatType = wechatType == null ? null : wechatType.trim();
    }

    public String getWechatNum() {
        return wechatNum;
    }

    public void setWechatNum(String wechatNum) {
        this.wechatNum = wechatNum == null ? null : wechatNum.trim();
    }

    public Integer getAlipay() {
        return alipay;
    }

    public void setAlipay(Integer alipay) {
        this.alipay = alipay;
    }

    public Integer getAliRate() {
        return aliRate;
    }

    public void setAliRate(Integer aliRate) {
        this.aliRate = aliRate;
    }

    public Integer getAliT0() {
        return aliT0;
    }

    public void setAliT0(Integer aliT0) {
        this.aliT0 = aliT0;
    }

    public String getAliIndustry() {
        return aliIndustry;
    }

    public void setAliIndustry(String aliIndustry) {
        this.aliIndustry = aliIndustry == null ? null : aliIndustry.trim();
    }

    public String getAliType() {
        return aliType;
    }

    public void setAliType(String aliType) {
        this.aliType = aliType == null ? null : aliType.trim();
    }

    public String getAlipayNum() {
        return alipayNum;
    }

    public void setAlipayNum(String alipayNum) {
        this.alipayNum = alipayNum == null ? null : alipayNum.trim();
    }


}