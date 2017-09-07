package com.brcd.bean;

import lombok.Data;

/*
使用lombok
 */
@Data
public class TbAgent {

    private  Long id;

    private String agentNumber;

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

    private String lastIp;//登陆的IP

    private Long lastLoginTime;//登陆的时间

    private String role;//用户角色

    private String userType;//用户类型

    private String headSculpture;

    private String companyAffiliation;//归属公司

    private String attributionDepartment;//归属部门

    private String name;

    private String email;

    private String phone;//电话

    private String mobilePhone;//手机号

    private String remark;


}