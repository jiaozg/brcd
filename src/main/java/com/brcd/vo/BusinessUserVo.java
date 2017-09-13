package com.brcd.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by lenovo on 2017/9/11.
 */
@Data
public class BusinessUserVo {

    private String serviceType;//业务类型
    private String agentNum;//代理商编号
    private String outMchld;//下游商户号
    private String customerType;//商业类型
    private Integer businessType;//经营行业
    private String customerName;//商户名称
    private String businessName;//经营名称
    private String legalId;//法人身份证
    private String legalName;//法人名称
    private String contact;//联系人
    private String contactPhone;//联系人手机号
    private String contactEmail;//联系人邮箱
    private String contactId;//联系人账号
    private String contactType;//联系人账号类型
    private String servicePhone;//客服电话
    private String businessAddress;//经营地址
    private String provinceName;//经营省
    private String cityName;//经营市
    private String districtName;//经营区
    private String address;//注册地址
    private String licenseNo;//营业执照
    private String payChannel;//支付通道类型
    private BigDecimal rate;//交易费率
    private String t0Status;//是否开通T+0
    private BigDecimal settleRate;//T+0费率
    private BigDecimal fixedFee;//T+0单笔加收费用
    private String isCapped;//是否封顶
    private String settleMode;//结算模式
    private BigDecimal upperFee;//封顶值
    private String accountType;//银行卡账户类型
    private String 	accountName;//	银行开户名称
    private String bankCard;//银行卡号
    private String bankName;//开户行名称
    private String province;//开户行省份
    private String city;//开户行城市
    private String 	bankAddress;//	开户行支行
    private Integer alliedBankNo;//联行号
    private String rightID;//身份证正面
    private String reservedID;//身份证反面
    private String IDWithHand;//手持身份证
    private String 	rightBankCard;//银行卡正面
    private String licenseImage;//营业执照
    private String doorHeadImage;//门面照
    private String accountLicence;//开户许可证
    private String sign;//签名



}
