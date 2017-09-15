package com.brcd.bean;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by ${崔帅} on 2017/9/11.
 */

@Data
public class SettleMent {

    private Date SettleTime;      //交易时间

    private String CustomerNum;   //商户号

    private String FacilityNum;    //设备编号

    private String PayProxy;       //支付渠道

    private String ProxyNum;       //渠道订单号

    private String AgentNum;       //服务商订单号

    private String OrderNum;       //商户订单号

    private String SettleType;     //交易种类

    private String SettleStatus;   //交易状态

    private String SettleMode;     //货币种类

    private BigDecimal OrderAmount;   //金额

    private String ProductName;    //商品名称

    private double SettleFee;      //手续费分润

    private double TradeFee;       //商户手续费

    private double CustomerRare;   //商户费率（%）

    private double ProxyRare;      //代理商费率（%）

    private String SettleNum;      //

    private double CountOrder;      //总交易单数

    private double CountMoney;      //总交易额

    private double CountReturnMoney;      //总退款金额

    private double CountFeeProfitMoney;      //手续费分润总金额

    private String AlipayT1TotalCharge;      //阿里支付总数





}
