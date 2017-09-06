package com.brcd.bean;

import lombok.Data;

/*

 */
@Data
public class TbAgent {
    private Long id;

    private Long agentNumber;

    private Integer agentGrade;

    private String agentFullName;

    private String agentContactPhone;

    private String officiallyAccounts;

    private String businessArea;

    private String accountType;

    private Long registerCardNumber;

    private String registerCardProvinces;

    private String subBranchBank;

    private String secretKey;

    private String shortName;

    private Integer auditStatus;

    private String registerBankName;

    private String registerAccountName;

    private String registerCardCity;

    private String unionBankNumber;

    private String intoPermissions;

    private String shareBenefit;

    private Integer whetherDredge;

    private Double rate;

    private Integer tAndOStatus;

    private Long superiorAgencyId;

    private Long originalAgencyId;

    private String account;

    private String password;

    private String lastIp;

    private Long lastLoginTime;

    private String role;

    private String userType;

    private String headSculpture;

    private String companyAffiliation;

    private String attributionDepartment;

    private String name;

    private String email;

    private String phone;

    private String mobilePhone;

    private String remark;

    /*public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAgentNumber() {
        return agentNumber;
    }

    public void setAgentNumber(Long agentNumber) {
        this.agentNumber = agentNumber;
    }

    public Integer getAgentGrade() {
        return agentGrade;
    }

    public void setAgentGrade(Integer agentGrade) {
        this.agentGrade = agentGrade;
    }

    public String getAgentFullName() {
        return agentFullName;
    }

    public void setAgentFullName(String agentFullName) {
        this.agentFullName = agentFullName == null ? null : agentFullName.trim();
    }

    public String getAgentContactPhone() {
        return agentContactPhone;
    }

    public void setAgentContactPhone(String agentContactPhone) {
        this.agentContactPhone = agentContactPhone == null ? null : agentContactPhone.trim();
    }

    public String getOfficiallyAccounts() {
        return officiallyAccounts;
    }

    public void setOfficiallyAccounts(String officiallyAccounts) {
        this.officiallyAccounts = officiallyAccounts == null ? null : officiallyAccounts.trim();
    }

    public String getBusinessArea() {
        return businessArea;
    }

    public void setBusinessArea(String businessArea) {
        this.businessArea = businessArea == null ? null : businessArea.trim();
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType == null ? null : accountType.trim();
    }

    public Long getRegisterCardNumber() {
        return registerCardNumber;
    }

    public void setRegisterCardNumber(Long registerCardNumber) {
        this.registerCardNumber = registerCardNumber;
    }

    public String getRegisterCardProvinces() {
        return registerCardProvinces;
    }

    public void setRegisterCardProvinces(String registerCardProvinces) {
        this.registerCardProvinces = registerCardProvinces == null ? null : registerCardProvinces.trim();
    }

    public String getSubBranchBank() {
        return subBranchBank;
    }

    public void setSubBranchBank(String subBranchBank) {
        this.subBranchBank = subBranchBank == null ? null : subBranchBank.trim();
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey == null ? null : secretKey.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getRegisterBankName() {
        return registerBankName;
    }

    public void setRegisterBankName(String registerBankName) {
        this.registerBankName = registerBankName == null ? null : registerBankName.trim();
    }

    public String getRegisterAccountName() {
        return registerAccountName;
    }

    public void setRegisterAccountName(String registerAccountName) {
        this.registerAccountName = registerAccountName == null ? null : registerAccountName.trim();
    }

    public String getRegisterCardCity() {
        return registerCardCity;
    }

    public void setRegisterCardCity(String registerCardCity) {
        this.registerCardCity = registerCardCity == null ? null : registerCardCity.trim();
    }

    public String getUnionBankNumber() {
        return unionBankNumber;
    }

    public void setUnionBankNumber(String unionBankNumber) {
        this.unionBankNumber = unionBankNumber == null ? null : unionBankNumber.trim();
    }

    public String getIntoPermissions() {
        return intoPermissions;
    }

    public void setIntoPermissions(String intoPermissions) {
        this.intoPermissions = intoPermissions == null ? null : intoPermissions.trim();
    }

    public String getShareBenefit() {
        return shareBenefit;
    }

    public void setShareBenefit(String shareBenefit) {
        this.shareBenefit = shareBenefit == null ? null : shareBenefit.trim();
    }

    public Integer getWhetherDredge() {
        return whetherDredge;
    }

    public void setWhetherDredge(Integer whetherDredge) {
        this.whetherDredge = whetherDredge;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Integer gettAndOStatus() {
        return tAndOStatus;
    }

    public void settAndOStatus(Integer tAndOStatus) {
        this.tAndOStatus = tAndOStatus;
    }

    public Long getSuperiorAgencyId() {
        return superiorAgencyId;
    }

    public void setSuperiorAgencyId(Long superiorAgencyId) {
        this.superiorAgencyId = superiorAgencyId;
    }

    public Long getOriginalAgencyId() {
        return originalAgencyId;
    }

    public void setOriginalAgencyId(Long originalAgencyId) {
        this.originalAgencyId = originalAgencyId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    public Long getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getHeadSculpture() {
        return headSculpture;
    }

    public void setHeadSculpture(String headSculpture) {
        this.headSculpture = headSculpture == null ? null : headSculpture.trim();
    }

    public String getCompanyAffiliation() {
        return companyAffiliation;
    }

    public void setCompanyAffiliation(String companyAffiliation) {
        this.companyAffiliation = companyAffiliation == null ? null : companyAffiliation.trim();
    }

    public String getAttributionDepartment() {
        return attributionDepartment;
    }

    public void setAttributionDepartment(String attributionDepartment) {
        this.attributionDepartment = attributionDepartment == null ? null : attributionDepartment.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }*/
}