package com.brcd.bean;


import lombok.Data;

import java.util.Date;

@Data
public class TbBusinessUser {
    private String businessUid;

    private String affiliationAgent;

    private String businessUserType;

    private String manageName;

    private String businessUsername;

    private String legalPeopleName;

    private String legalPeopleIdentityCard;

    private String contactPeople;

    private String contactPhone;

    private String contactMail;

    private String servicePhone;

    private String manageAddress;

    private String manageProvince;

    private String manageCity;

    private String manageDistrict;

    private String businessLicenseNo;

    private String registerAddress;

    private String identityCardFront;

    private String identityCardReverse;

    private String identityCardHand;

    private String bankCardFront;

    private String businessLicensePicture;

    private String doorPicture;

    private String registerLicensePicture;

    private Integer businessId;




    private  TbAgent tbAgent;


    private Integer bankId;
    private Integer businessUserStatus;
    private Date startTime;
    private Date endTime;
    private String businessUserKey;

  



    private TbBankcardInfo tbBankcardInfo;

    private  TbBusiness tbBusiness;

    

    




}