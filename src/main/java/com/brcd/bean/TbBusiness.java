package com.brcd.bean;

import lombok.Data;

@Data
public class TbBusiness {
    private Integer businessId;

    private Integer wechatPay;

    private Double wechatRate;

    private Integer wechatT0;

    private String wechatIndustry;

    private String wechatType;

    private String wechatNum;

    private Integer alipay;

    private Double aliRate;

    private Integer aliT0;

    private String aliIndustry;

    private String aliType;

    private String alipayNum;


    private String businessUid;

    private volatile String wechatPayYN;

    private volatile String alipayYN;

}