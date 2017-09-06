package com.brcd.bean;

public class TbBusinessUser {
    private String businessUid;

    private String affiliationAgent;

    private String businessUserType;

    private String manageName;//经营名称

    private String businessUsername;//商户名称

    private String legalPeopleName;//法人名称

    private String legalPeopleIdentityCard;//法人身份证

    private String contactPeople;//联系人

    private String contactPhone;//联系电话

    private String contactMail;//联系邮箱

    private String servicePhone;//客服电话

    private String manageAddress;//经营地址

    private String manageProvince;//经营省

    private String manageCity;//经营市

    private String manageDistrict;//经营区

    private String businessLicenseNo;//营业执照编号

    private String registerAddress;//注册地址

    private String identityCardFront;//身份证正面

    private String identityCardReverse;//身份证反面

    private String identityCardHand;//手持身份证

    private String bankCardFront;//银行卡正面

    private String businessLicensePicture;//营业执照照片

    private String doorPicture;//门头照

    private String registerLicensePicture;//开户许可证照片



    private TbBankcardInfo tbBankcardInfo;

    private  TbAgent tbAgent;

    public TbBankcardInfo getTbBankcardInfo() {
        return tbBankcardInfo;
    }

    public void setTbBankcardInfo(TbBankcardInfo tbBankcardInfo) {
        this.tbBankcardInfo = tbBankcardInfo;
    }

    public TbAgent getTbAgent() {
        return tbAgent;
    }

    public void setTbAgent(TbAgent tbAgent) {
        this.tbAgent = tbAgent;
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

    public String getRegisterLicensePicture() {
        return registerLicensePicture;
    }

    public void setRegisterLicensePicture(String registerLicensePicture) {
        this.registerLicensePicture = registerLicensePicture == null ? null : registerLicensePicture.trim();
    }

    @Override
    public String toString() {
        return "TbBusinessUser{" +
                "businessUid='" + businessUid + '\'' +
                ", affiliationAgent='" + affiliationAgent + '\'' +
                ", businessUserType='" + businessUserType + '\'' +
                ", manageName='" + manageName + '\'' +
                ", businessUsername='" + businessUsername + '\'' +
                ", legalPeopleName='" + legalPeopleName + '\'' +
                ", legalPeopleIdentityCard='" + legalPeopleIdentityCard + '\'' +
                ", contactPeople='" + contactPeople + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", contactMail='" + contactMail + '\'' +
                ", servicePhone='" + servicePhone + '\'' +
                ", manageAddress='" + manageAddress + '\'' +
                ", manageProvince='" + manageProvince + '\'' +
                ", manageCity='" + manageCity + '\'' +
                ", manageDistrict='" + manageDistrict + '\'' +
                ", businessLicenseNo='" + businessLicenseNo + '\'' +
                ", registerAddress='" + registerAddress + '\'' +
                ", identityCardFront='" + identityCardFront + '\'' +
                ", identityCardReverse='" + identityCardReverse + '\'' +
                ", identityCardHand='" + identityCardHand + '\'' +
                ", bankCardFront='" + bankCardFront + '\'' +
                ", businessLicensePicture='" + businessLicensePicture + '\'' +
                ", doorPicture='" + doorPicture + '\'' +
                ", registerLicensePicture='" + registerLicensePicture + '\'' +
                ", tbBankcardInfo=" + tbBankcardInfo +
                ", tbAgent=" + tbAgent +
                '}';
    }
}