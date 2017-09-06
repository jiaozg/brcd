package com.brcd.bean;

import lombok.Data;

import java.util.Date;
@Data
public class TbOrder {
    private String orderNum;

    private String businessNum;

    private String proxyNum;

    private String orderType;

    private String orderState;

    private Long numMoney;

    private String settleMode;

    private String checkSettleState;

    private String settleState;

    private Date createTime;


}