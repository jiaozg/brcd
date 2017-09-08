package com.brcd.bean;

import lombok.Data;

import java.util.Date;

/**
 * 支行类
 * Created by admin on 2017/9/8.
 */
@Data
public class Bank {
    private Integer bId;
    private Date createTime;
    private Date modifyTime;
    private String bankNo;
    private String bankName;
    private String bankSubName;
    private String phone;
    private String address;
    private String province;
    private String city;
    private String keyWord;

}
