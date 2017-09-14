package com.brcd.vo.customer;


import com.brcd.common.util.SignatureUtil;
import com.brcd.common.util.StringUtil;
import com.brcd.vo.base.WechatRequestBase;
import org.slf4j.Logger;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * 北农商商户进件
 *
 * @author zhang.hui@pufubao.net
 * @version v1.0
 * @date 2016年10月28日 下午3:41:04
 */
public class CustomerReportRequest extends WechatRequestBase {

    private String serviceType;
    private String sign;
    private String agentNum;
    private String outMchId;
    private String appId;
    private String customerType;
    private String businessType;
    private String businessName;
    private String legalId;
    private String legalName;
    private String contact;
    private String contactPhone;
    private String contactEmail;
    private String servicePhone;
    private String customerName;
    private String address;
    private String provinceName;
    private String cityName;
    private String districtName;
    private String licenseNo;
    private String payChannel;
    private String rate;
    private String t0Status;
    private String settleRate;
    private String fixedFee;
    private String isCapped;
    private String settleMode;
    private String upperFee;
    private String accountType;
    private String accountName;
    private String bankCard;
    private String bankName;
    private String province;
    private String city;
    private String bankAddress;
    private String alliedBankNo;
    private String rightID;
    private String reservedID;
    private String IDWithHand;
    private String rightBankCard;
    private String licenseImage;
    private String doorHeadImage;
    private String accountLicence;

    public CustomerReportRequest() {

    }

    public CustomerReportRequest(String key, String serviceType, String agentNum, String outMchId, String appId, String customerType,
                                 String businessType, String businessName, String legalId, String legalName, String contact, String contactPhone,
                                 String contactEmail, String servicePhone, String customerName, String address, String provinceName, String cityName,
                                 String districtName, String licenseNo, String payChannel, String rate, String t0Status, String settleRate,
                                 String fixedFee, String isCapped, String settleMode, String upperFee, String accountType, String accountName,
                                 String bankCard, String bankName, String province, String city, String bankAddress, String alliedBankNo,
                                 String rightID, String reservedID, String IDWithHand, String rightBankCard, String licenseImage, String doorHeadImage,
                                 String accountLicence, Logger log) {
        setServiceType(serviceType);
        setAgentNum(agentNum);
        setOutMchId(outMchId);
        setAppId(appId);
        setCustomerType(customerType);
        setBusinessType(businessType);
        setBusinessName(businessName);
        setLegalId(legalId);
        setLegalName(legalName);
        setContact(contact);
        setContactPhone(contactPhone);
        setContactEmail(contactEmail);
        setServicePhone(servicePhone);
        setCustomerName(customerName);
        setAddress(address);
        setProvinceName(provinceName);
        setCityName(cityName);
        setDistrictName(districtName);
        setLicenseNo(licenseNo);
        setPayChannel(payChannel);
        setRate(rate);
        setT0Status(t0Status);
        setSettleRate(settleRate);
        setFixedFee(fixedFee);
        setIsCapped(isCapped);
        setSettleMode(settleMode);
        setUpperFee(upperFee);
        setAccountType(accountType);
        setAccountName(accountName);
        setBankCard(bankCard);
        setBankName(bankName);
        setProvince(province);
        setCity(city);
        setBankAddress(bankAddress);
        setAlliedBankNo(alliedBankNo);
        setRightID(rightID);
        setReservedID(reservedID);
        setIDWithHand(IDWithHand);
        setRightBankCard(rightBankCard);
        setLicenseImage(licenseImage);
        setDoorHeadImage(doorHeadImage);
        setAccountLicence(accountLicence);
        String sign = SignatureUtil.getSign(toMap(), key, log);
        setSign(sign);
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getAgentNum() {
        return agentNum;
    }

    public void setAgentNum(String agentNum) {
        this.agentNum = agentNum;
    }

    public String getOutMchId() {
        return outMchId;
    }

    public void setOutMchId(String outMchId) {
        this.outMchId = outMchId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getLegalId() {
        return legalId;
    }

    public void setLegalId(String legalId) {
        this.legalId = legalId;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getT0Status() {
        return t0Status;
    }

    public void setT0Status(String t0Status) {
        this.t0Status = t0Status;
    }

    public String getSettleRate() {
        return settleRate;
    }

    public void setSettleRate(String settleRate) {
        this.settleRate = settleRate;
    }

    public String getFixedFee() {
        return fixedFee;
    }

    public void setFixedFee(String fixedFee) {
        this.fixedFee = fixedFee;
    }

    public String getIsCapped() {
        return isCapped;
    }

    public void setIsCapped(String isCapped) {
        this.isCapped = isCapped;
    }

    public String getSettleMode() {
        return settleMode;
    }

    public void setSettleMode(String settleMode) {
        this.settleMode = settleMode;
    }

    public String getUpperFee() {
        return upperFee;
    }

    public void setUpperFee(String upperFee) {
        this.upperFee = upperFee;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getAlliedBankNo() {
        return alliedBankNo;
    }

    public void setAlliedBankNo(String alliedBankNo) {
        this.alliedBankNo = alliedBankNo;
    }

    public String getRightID() {
        return rightID;
    }

    public void setRightID(String rightID) {
        this.rightID = rightID;
    }

    public String getReservedID() {
        return reservedID;
    }

    public void setReservedID(String reservedID) {
        this.reservedID = reservedID;
    }

    public String getIDWithHand() {
        return IDWithHand;
    }

    public void setIDWithHand(String IDWithHand) {
        this.IDWithHand = IDWithHand;
    }

    public String getRightBankCard() {
        return rightBankCard;
    }

    public void setRightBankCard(String rightBankCard) {
        this.rightBankCard = rightBankCard;
    }

    public String getLicenseImage() {
        return licenseImage;
    }

    public void setLicenseImage(String licenseImage) {
        this.licenseImage = licenseImage;
    }

    public String getDoorHeadImage() {
        return doorHeadImage;
    }

    public void setDoorHeadImage(String doorHeadImage) {
        this.doorHeadImage = doorHeadImage;
    }

    public String getAccountLicence() {
        return accountLicence;
    }

    public void setAccountLicence(String accountLicence) {
        this.accountLicence = accountLicence;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            Object obj;
            try {
                obj = field.get(this);
                if (obj != null && StringUtil.isNotBlank(String.valueOf(obj))) {
                    map.put(field.getName(), obj);
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return map;
    }

}
