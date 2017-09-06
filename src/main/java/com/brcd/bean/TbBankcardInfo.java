package com.brcd.bean;

import lombok.Data;

@Data
public class TbBankcardInfo {
    private Integer bankId;

    private String bankcardType;

    private String bankcardName;

    private String bankcardNum;

    private String bankName;

    private String bankProvince;

    private String bankCity;

    private String bankDetailed;

    private String bandContact;

   /* public Integer getBankId() {
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
    }*/
}