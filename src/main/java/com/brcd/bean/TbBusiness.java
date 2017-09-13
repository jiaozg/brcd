package com.brcd.bean;

import lombok.Data;

@Data
public class TbBusiness {
    private Integer businessId;

    private String wechatPay="N";

    private Double wechatRate;

    private Integer wechatT0=0;

    private String wechatIndustry;

    private String wechatType;

    private String wechatNum;

    private String alipay="N";

    private Double aliRate;

    private Integer aliT0=0;

    private String aliIndustry;

    private String aliType;

    private String alipayNum;

    private String businessUid;


}