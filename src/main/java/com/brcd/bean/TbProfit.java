package com.brcd.bean;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class TbProfit {
    private String payoffNum;

    private String settleNum;

    private Date settleTime;

    private String customerNum;

    private String ownerType;

    private String settleType;

    private String settleMode;

    private String orderAmount;

    private Integer orderCount;

    private BigDecimal tradeFee;

    private BigDecimal settleFee;

    private BigDecimal settleAmount;

    private String settleStatus;

    private String remark;

    private Date startTime;

    private Date endTime;

}