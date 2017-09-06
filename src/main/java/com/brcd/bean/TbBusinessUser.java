package com.brcd.bean;

import lombok.Data;

@Data
public class TbBusinessUser {
    private Long businessUid;

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


    private TbBankcardInfo tbBankcardInfo;

    private  TbBusiness tbBusiness;

    public TbBankcardInfo getTbBankcardInfo() {
        return tbBankcardInfo;
    }

    public void setTbBankcardInfo(TbBankcardInfo tbBankcardInfo) {
        this.tbBankcardInfo = tbBankcardInfo;
    }

    public TbBusiness getTbBusiness() {
        return tbBusiness;
    }

    public void setTbBusiness(TbBusiness tbBusiness) {
        this.tbBusiness = tbBusiness;
    }

    public String getBusinessUid() {
        return businessUid;
    }

    public void setBusinessUid(String businessUid) {
        this.businessUid = businessUid;
    }

    public String getAffiliationAgent() {
        return affiliationAgent;
    }

    public void setAffiliationAgent(String affiliationAgent) {
        this.affiliationAgent = affiliationAgent == null ? null : affiliationAgent.trim();
    }

    public String getBusinessUserType() {
        return businessUserType;
    }

    public void setBusinessUserType(String businessUserType) {
        this.businessUserType = businessUserType == null ? null : businessUserType.trim();
    }

    public String getManageName() {
        return manageName;
    }

    public void setManageName(String manageName) {
        this.manageName = manageName == null ? null : manageName.trim();
    }

    public String getBusinessUsername() {
        return businessUsername;
    }

    public void setBusinessUsername(String businessUsername) {
        this.businessUsername = businessUsername == null ? null : businessUsername.trim();
    }

    public String getLegalPeopleName() {
        return legalPeopleName;
    }

    public void setLegalPeopleName(String legalPeopleName) {
        this.legalPeopleName = legalPeopleName == null ? null : legalPeopleName.trim();
    }

    public String getLegalPeopleIdentityCard() {
        return legalPeopleIdentityCard;
    }

    public void setLegalPeopleIdentityCard(String legalPeopleIdentityCard) {
        this.legalPeopleIdentityCard = legalPeopleIdentityCard == null ? null : legalPeopleIdentityCard.trim();
    }

    public String getContactPeople() {
        return contactPeople;
    }

    public void setContactPeople(String contactPeople) {
        this.contactPeople = contactPeople == null ? null : contactPeople.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public String getContactMail() {
        return contactMail;
    }

    public void setContactMail(String contactMail) {
        this.contactMail = contactMail == null ? null : contactMail.trim();
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone == null ? null : servicePhone.trim();
    }

    public String getManageAddress() {
        return manageAddress;
    }

    public void setManageAddress(String manageAddress) {
        this.manageAddress = manageAddress == null ? null : manageAddress.trim();
    }

    public String getManageProvince() {
        return manageProvince;
    }

    public void setManageProvince(String manageProvince) {
        this.manageProvince = manageProvince == null ? null : manageProvince.trim();
    }

    public String getManageCity() {
        return manageCity;
    }

    public void setManageCity(String manageCity) {
        this.manageCity = manageCity == null ? null : manageCity.trim();
    }

    public String getManageDistrict() {
        return manageDistrict;
    }

    public void setManageDistrict(String manageDistrict) {
        this.manageDistrict = manageDistrict == null ? null : manageDistrict.trim();
    }

    public String getBusinessLicenseNo() {
        return businessLicenseNo;
    }

    public void setBusinessLicenseNo(String businessLicenseNo) {
        this.businessLicenseNo = businessLicenseNo == null ? null : businessLicenseNo.trim();
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress == null ? null : registerAddress.trim();
    }

    public String getIdentityCardFront() {
        return identityCardFront;
    }

    public void setIdentityCardFront(String identityCardFront) {
        this.identityCardFront = identityCardFront == null ? null : identityCardFront.trim();
    }

    public String getIdentityCardReverse() {
        return identityCardReverse;
    }

    public void setIdentityCardReverse(String identityCardReverse) {
        this.identityCardReverse = identityCardReverse == null ? null : identityCardReverse.trim();
    }

    public String getIdentityCardHand() {
        return identityCardHand;
    }

    public void setIdentityCardHand(String identityCardHand) {
        this.identityCardHand = identityCardHand == null ? null : identityCardHand.trim();
    }

    public String getBankCardFront() {
        return bankCardFront;
    }

    public void setBankCardFront(String bankCardFront) {
        this.bankCardFront = bankCardFront == null ? null : bankCardFront.trim();
    }

    public String getBusinessLicensePicture() {
        return businessLicensePicture;
    }

    public void setBusinessLicensePicture(String businessLicensePicture) {
        this.businessLicensePicture = businessLicensePicture == null ? null : businessLicensePicture.trim();
    }

    public String getDoorPicture() {
        return doorPicture;
    }

    public void setDoorPicture(String doorPicture) {
        this.doorPicture = doorPicture == null ? null : doorPicture.trim();
    }






}