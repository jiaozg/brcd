package com.brcd.service.impl;

import com.brcd.bean.TbBankcardInfo;
import com.brcd.bean.TbBusiness;
import com.brcd.bean.TbBusinessUser;
import com.brcd.common.util.IDUtils;
import com.brcd.common.util.Upload;
import com.brcd.mapper.TbBankcardInfoMapper;
import com.brcd.mapper.TbBusinessMapper;
import com.brcd.mapper.TbBusinessUserMapper;
import com.brcd.service.TbBusinessUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 持久化业务层实现
 * Created by admin on 2017/9/5.
 */
@Service
public class TbBusinessUserServiceImpl implements TbBusinessUserService {
    @Autowired
    private TbBusinessUserMapper tbBusinessUserMapper;

    @Autowired
    private TbBusinessMapper tbBusinessMapper;

    @Autowired
    private TbBankcardInfoMapper tbBankcardInfoMapper;

    @Autowired
    private Upload upload;

    /**
     * 添加商户基本信息
     *
     * @param tbBusinessUser
     * @param business
     * @param bankcardInfo
     */
    @Override
    public void insertBusinessUser(TbBusinessUser tbBusinessUser, TbBusiness business, TbBankcardInfo bankcardInfo) {
        //设置主键ID'
        String sid = IDUtils.genItemId();
        tbBusinessUser.setBusinessUid(sid);

        //设置外键的值
        business.setBusinessUid(sid);
        insertBusiness(business);
        //设置外键的值
        bankcardInfo.setBusinessUid(sid);
        insertBankcardInfo(bankcardInfo);
        tbBusinessUser.setStartTime(new Date());
        tbBusinessUser.setEndTime(new Date());
        try {
            String bankCardFront = this.upload.getUpload(tbBusinessUser.getBankCardFrontImg());
            tbBusinessUser.setBankCardFront(bankCardFront);
            String identityCardFront = this.upload.getUpload(tbBusinessUser.getIdentityCardFrontImg());
            tbBusinessUser.setIdentityCardFront(identityCardFront);
            String identityCardReverse = this.upload.getUpload(tbBusinessUser.getIdentityCardReverseImg());
            tbBusinessUser.setIdentityCardReverse(identityCardReverse);
            String identityCardHand = this.upload.getUpload(tbBusinessUser.getIdentityCardHandImg());
            tbBusinessUser.setIdentityCardHand(identityCardHand);
            if(tbBusinessUser.getBusinessUserType().equals("ENTERPRISE")) {
                String businessLicensePicture = this.upload.getUpload(tbBusinessUser.getBusinessLicensePictureImg());
                tbBusinessUser.setBusinessLicensePicture(businessLicensePicture);
                String doorPicture = this.upload.getUpload(tbBusinessUser.getDoorPictureImg());
                tbBusinessUser.setDoorPicture(doorPicture);
                String registerLicensePicture = this.upload.getUpload(tbBusinessUser.getRegisterLicensePictureImg());
                tbBusinessUser.setRegisterLicensePicture(registerLicensePicture);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        tbBusinessUserMapper.insertBusinessUser(tbBusinessUser);
    }


    /**
     * 添加商户开通线下支付信息
     */
    private void insertBusiness(TbBusiness business) {

        if (business.getWechatPay().equals("Y")) {
            business.setWechatRate(business.getWechatRate()/100);
            tbBusinessMapper.insertTbBusiness(business);
        }else if (business.getAlipay() .equals("Y")) {
            business.setAliRate(business.getAliRate()/100);
            tbBusinessMapper.insertTbBusiness(business);
        }
    }

    /**
     * 添加商户银行信息
     */
    private void insertBankcardInfo(TbBankcardInfo bankcardInfo) {
        tbBankcardInfoMapper.insertTbBankcardInfo(bankcardInfo);
    }

    @Override

    public List<TbBusinessUser> query(TbBusinessUser businessUser) {
        return tbBusinessUserMapper.query(businessUser);
    }

    public void updateTbBusinessUser(TbBusinessUser tbBusinessUser) {
        tbBusinessUserMapper.updateTbBusinessUser(tbBusinessUser);


    }

    @Override
    public boolean loginBusinessUser(TbBusinessUser tbBusinessUser) {

        TbBusinessUser BusinessUser = tbBusinessUserMapper.loginBusinessUser(tbBusinessUser);
        if(BusinessUser != null){
            return true;
        }
        return false;
    }


}

