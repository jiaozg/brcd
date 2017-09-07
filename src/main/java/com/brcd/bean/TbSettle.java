package com.brcd.bean;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class TbSettle {
    private String payoffNum;

    private String settleNum;

    private Date settleTime;

    private String customerNum;

    private String customerType;

    private String settleType;

    private String settleMode;

    private BigDecimal orderAmount;

    private Integer orderCount;

    private BigDecimal settleFee;

    private BigDecimal settleAmount;

    private String settleStatus;

    private String remark;


}