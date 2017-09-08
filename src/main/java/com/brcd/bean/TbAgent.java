package com.brcd.bean;

import lombok.Data;

import javax.validation.constraints.Pattern;


/*
使用lombok
 */
@Data
public class TbAgent {

    private Long id;

    private String agentNumber;

    private Integer agentGrade;

    private String agentFullName;

    private String agentContactPhone;

    private String officiallyAccounts;

    private String businessArea;

    private String accountType;
    @Pattern(regexp = "/^([1-9]{1})(\\d{14}|\\d{18})$/",message = "卡号格式不符")
    private String registerCardNumber;

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
    @Pattern(regexp = "/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/",message = "邮箱格式不符")
    private String email;

    private String phone;

    private String mobilePhone;

    private String remark;

    private Integer wOrAlipay;
}