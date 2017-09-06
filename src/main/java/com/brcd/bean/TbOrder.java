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

   /* public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public String getBusinessNum() {
        return businessNum;
    }

    public void setBusinessNum(String businessNum) {
        this.businessNum = businessNum == null ? null : businessNum.trim();
    }

    public String getProxyNum() {
        return proxyNum;
    }

    public void setProxyNum(String proxyNum) {
        this.proxyNum = proxyNum == null ? null : proxyNum.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState == null ? null : orderState.trim();
    }

    public Long getNumMoney() {
        return numMoney;
    }

    public void setNumMoney(Long numMoney) {
        this.numMoney = numMoney;
    }

    public String getSettleMode() {
        return settleMode;
    }

    public void setSettleMode(String settleMode) {
        this.settleMode = settleMode == null ? null : settleMode.trim();
    }

    public String getCheckSettleState() {
        return checkSettleState;
    }

    public void setCheckSettleState(String checkSettleState) {
        this.checkSettleState = checkSettleState == null ? null : checkSettleState.trim();
    }

    public String getSettleState() {
        return settleState;
    }

    public void setSettleState(String settleState) {
        this.settleState = settleState == null ? null : settleState.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }*/
}