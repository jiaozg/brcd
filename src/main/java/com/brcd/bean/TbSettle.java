package com.brcd.bean;

import java.math.BigDecimal;
import java.util.Date;

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

    public String getPayoffNum() {
        return payoffNum;
    }

    public void setPayoffNum(String payoffNum) {
        this.payoffNum = payoffNum == null ? null : payoffNum.trim();
    }

    public String getSettleNum() {
        return settleNum;
    }

    public void setSettleNum(String settleNum) {
        this.settleNum = settleNum == null ? null : settleNum.trim();
    }

    public Date getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(Date settleTime) {
        this.settleTime = settleTime;
    }

    public String getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(String customerNum) {
        this.customerNum = customerNum == null ? null : customerNum.trim();
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType == null ? null : customerType.trim();
    }

    public String getSettleType() {
        return settleType;
    }

    public void setSettleType(String settleType) {
        this.settleType = settleType == null ? null : settleType.trim();
    }

    public String getSettleMode() {
        return settleMode;
    }

    public void setSettleMode(String settleMode) {
        this.settleMode = settleMode == null ? null : settleMode.trim();
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public BigDecimal getSettleFee() {
        return settleFee;
    }

    public void setSettleFee(BigDecimal settleFee) {
        this.settleFee = settleFee;
    }

    public BigDecimal getSettleAmount() {
        return settleAmount;
    }

    public void setSettleAmount(BigDecimal settleAmount) {
        this.settleAmount = settleAmount;
    }

    public String getSettleStatus() {
        return settleStatus;
    }

    public void setSettleStatus(String settleStatus) {
        this.settleStatus = settleStatus == null ? null : settleStatus.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}