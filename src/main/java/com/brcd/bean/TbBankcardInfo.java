package com.brcd.bean;

public class TbBankcardInfo {
    private Integer bankId;//银行卡信息主键

    private String bankcardType;//银行卡账户类型

    private String bankcardName;//账户户名

    private String bankcardNum;//银行卡卡号

    private String bankName;//开户银行名称

    private String bankProvince;//开户行所在省

    private String bankCity;//开户行所在市

    private String bankDetailed;//支行

    private String bandContact;//银联点

    private String businessUid;//商户Id

    public String  getBusinessUid() {
        return businessUid;
    }

    public void setBusinessUid(String businessUid) {
        this.businessUid = businessUid;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankcardType() {
        return bankcardType;
    }

    public void setBankcardType(String bankcardType) {
        this.bankcardType = bankcardType == null ? null : bankcardType.trim();
    }

    public String getBankcardName() {
        return bankcardName;
    }

    public void setBankcardName(String bankcardName) {
        this.bankcardName = bankcardName == null ? null : bankcardName.trim();
    }

    public String getBankcardNum() {
        return bankcardNum;
    }

    public void setBankcardNum(String bankcardNum) {
        this.bankcardNum = bankcardNum == null ? null : bankcardNum.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankProvince() {
        return bankProvince;
    }

    public void setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince == null ? null : bankProvince.trim();
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity == null ? null : bankCity.trim();
    }

    public String getBankDetailed() {
        return bankDetailed;
    }

    public void setBankDetailed(String bankDetailed) {
        this.bankDetailed = bankDetailed == null ? null : bankDetailed.trim();
    }

    public String getBandContact() {
        return bandContact;
    }

    public void setBandContact(String bandContact) {
        this.bandContact = bandContact == null ? null : bandContact.trim();
    }

    @Override
    public String toString() {
        return "TbBankcardInfo{" +
                "bankId=" + bankId +
                ", bankcardType='" + bankcardType + '\'' +
                ", bankcardName='" + bankcardName + '\'' +
                ", bankcardNum='" + bankcardNum + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankProvince='" + bankProvince + '\'' +
                ", bankCity='" + bankCity + '\'' +
                ", bankDetailed='" + bankDetailed + '\'' +
                ", bandContact='" + bandContact + '\'' +
                ", businessUid='" + businessUid + '\'' +
                '}';
    }
}