package com.brcd.service.impl;

import com.brcd.bean.TbBankcardInfo;
import com.brcd.bean.TbBusiness;
import com.brcd.bean.TbBusinessUser;
import com.brcd.common.util.IDUtils;
import com.brcd.mapper.TbBankcardInfoMapper;
import com.brcd.mapper.TbBusinessMapper;
import com.brcd.mapper.TbBusinessUserMapper;
import com.brcd.service.TbBusinessUserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    /**
     * 添加商户基本信息
     *
     * @param businessUser
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
        tbBusinessUserMapper.insertBusinessUser(businessUser);
    }


    /**
     * 添加商户开通线下支付信息
     */
    private void insertBusiness(TbBusiness business) {

        if (business.getWechatPayYN().equals("Y")) {
            business.setWechatT0(0);
            business.setAliT0(0);
            business.setWechatPay(1);
            business.setAlipay(0);
            tbBusinessMapper.insertTbBusiness(business);
        }else if (business.getAlipayYN() .equals("Y")) {
            business.setWechatT0(0);
            business.setAliT0(0);
            business.setWechatPay(0);
            business.setAlipay(1);
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
    public TbBusinessUserExtend getBusinessUserAndBank(int id) {
        return tbBusinessUserMapper.getBusinessUserAndBank(id);
    }

}

