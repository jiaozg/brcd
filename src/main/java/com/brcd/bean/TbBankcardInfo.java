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

    private String businessUid;



    public void setBandContact(String bandContact) {
        this.bandContact = bandContact == null ? null : bandContact.trim();
    }


}