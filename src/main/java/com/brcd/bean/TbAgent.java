package com.brcd.bean;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.Serializable;

import javax.validation.constraints.Pattern;


/*
使用lombok
 */
@Data
public class TbAgent implements Serializable{

    private  Long id;

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

    private String newPassWord;//修改的新密码


    private String lastIp;//登陆的IP

    private String lastLoginTime;//登陆的时间

    private String role;//用户角色

    private String userType;//用户类型

    private String headSculpture;

//    private File headSculptureFile;

    private String companyAffiliation;//归属公司

    private String attributionDepartment;//归属部门

    private String name;
    @Pattern(regexp = "/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/",message = "邮箱格式不符")
    private String email;

    private String phone;//电话

    private String mobilePhone;//手机号

    private String remark;  //备注


    private Integer wOrAlipay; //微信或支付宝

}