package com.brcd.bean;

import lombok.Data;

import java.util.Date;
@Data
public class TbOrder {
    private String orderNum;      //订单编号

    private String customerNum;   //商户编号

    private String proxyNo;          //渠道商单号

    private String proxyNum;      //渠道商编号

    private String orderType;     //订单类型

    private String orderState;    //订单状态

    private Long numMoney;        //总金额

    private String settleMode;    //结算方式

    private String checkSettleState;     //对账状态

    private String settleState;        //结算状态

    private Date createTime;         //创建时间

    //private String businessNum;   //交易编号

    private Date beginDate;

    private Date endDate;


}