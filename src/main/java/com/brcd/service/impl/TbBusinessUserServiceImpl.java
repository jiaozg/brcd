package com.brcd.service.impl;

import com.brcd.bean.TbBankcardInfo;
import com.brcd.bean.TbBusiness;
import com.brcd.bean.TbBusinessUser;
import com.brcd.common.util.IDUtils;
import com.brcd.common.util.MD5Util;
import com.brcd.common.util.Upload;
import com.brcd.mapper.TbBankcardInfoMapper;
import com.brcd.mapper.TbBusinessMapper;
import com.brcd.mapper.TbBusinessUserMapper;
import com.brcd.service.TbBusinessUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * 持久化业务层实现
 * Created by admin on 2017/9/5.
 */
@Service
@Transactional
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
     * @param
     * @param business
     * @param bankcardInfo
     */
    @Override
    public void insertBusinessUser(TbBusinessUser businessUser, TbBusiness business, TbBankcardInfo bankcardInfo) {
        //设置主键ID'
        String sid = IDUtils.genItemId();
        businessUser.setBusinessUid(sid);

        //设置外键的值
        business.setBusinessUid(sid);
        insertBusiness(business);
        //设置外键的值
        bankcardInfo.setBusinessUid(sid);
        insertBankcardInfo(bankcardInfo);
        businessUser.setStartTime(new Date());
        businessUser.setEndTime(new Date());
        businessUser=upload(businessUser);
        //将MD5加密商户密码
        if (businessUser.getPassword() != null && businessUser.getPassword() != "") {
            String md5Encode = MD5Util.MD5Encode(businessUser.getPassword());
            businessUser.setPassword(md5Encode);
        }
        tbBusinessUserMapper.insertBusinessUser(businessUser);
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

    /**
     * 修改商户信息
     * @param tbBusinessUser
     */
    @Override
    public void updateTbBusinessUser(TbBusinessUser tbBusinessUser) {
        /**
         * 上传身份证等图片信息
         */
        tbBusinessUser= upload(tbBusinessUser);
        tbBusinessUserMapper.updateTbBusinessUser(tbBusinessUser);
        tbBusinessMapper.updateTbBusiness(tbBusinessUser.getTbBusiness());
        tbBankcardInfoMapper.updateTbBankcardInfo(tbBusinessUser.getTbBankcardInfo());


    }

    @Override
    public TbBusinessUser loginBusinessUser(TbBusinessUser tbBusinessUser) {
        //将MD5加密
        /*if (tbBusinessUser.getPassword() != null && tbBusinessUser.getPassword() != "") {
            String md5Encode = MD5Util.MD5Encode(tbBusinessUser.getPassword());
            tbBusinessUser.setPassword(md5Encode);
        }*/
        TbBusinessUser BusinessUser = tbBusinessUserMapper.loginBusinessUser(tbBusinessUser);
        if(BusinessUser != null){
            return BusinessUser;
        }
        return null;
    }



    public TbBusinessUser findByBusinessUid(String businessUid) {
        return tbBusinessUserMapper.findByBusinessUid(businessUid);
    }

    /**
     * 验证手机号是否存在
     * @param contactPhone
     * @return
     */
    @Override
    public TbBusinessUser findBusinessUserBycontactPhone(String contactPhone) {
        TbBusinessUser phone = tbBusinessUserMapper.findBusinessUserBycontactPhone(contactPhone);
        if(phone != null){
            return phone;
        }
        return null;
    }

    public TbBusinessUser upload(TbBusinessUser tbBusinessUser){
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
        return tbBusinessUser;
    }

}

