package com.brcd.bean;

public class TbBusiness {
    private Integer businessId;//业务Id(每个商户对应一个)

    private Integer wechatPay;//是否开通线下支付(0/1)--1代表开通

    private Integer wechatRate;//费率(代表万分之几)例如78 代表:百分之0.78

    private Integer wechatT0;//是否开通t+0(0/1)--1代表开通

    private String wechatIndustry;//所属行业

    private String wechatType;//微信账号类型

    private String wechatNum;//微信账号

    private Integer alipay;//支付宝是否开通(0/1)--1代表开通

    private Integer aliRate;//支付宝费率

    private Integer aliT0;//支付宝t+0状态(0/1)--1代表开通

    private String aliIndustry;//支付宝账号所属行业

    private String aliType;//支付宝账号类型

    private String alipayNum;//支付宝账号

    private String businessUid;//商户外键

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

    @Override
    public String toString() {
        return "TbBusiness{" +
                "businessId=" + businessId +
                ", wechatPay=" + wechatPay +
                ", wechatRate=" + wechatRate +
                ", wechatT0=" + wechatT0 +
                ", wechatIndustry='" + wechatIndustry + '\'' +
                ", wechatType='" + wechatType + '\'' +
                ", wechatNum='" + wechatNum + '\'' +
                ", alipay=" + alipay +
                ", aliRate=" + aliRate +
                ", aliT0=" + aliT0 +
                ", aliIndustry='" + aliIndustry + '\'' +
                ", aliType='" + aliType + '\'' +
                ", alipayNum='" + alipayNum + '\'' +
                ", businessUid='" + businessUid + '\'' +
                '}';
    }
}