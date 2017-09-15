package com.brcd.service;


import com.brcd.bean.TbBankcardInfo;
import com.brcd.bean.TbBusiness;
import com.brcd.bean.TbBusinessUser;
import java.util.List;
/**
 * 商户管理业务层
 * Created by admin on 2017/9/5.
 * 赵翰
 */
public interface TbBusinessUserService {

    /**
     * 添加商户
     */
    void insertBusinessUser(TbBusinessUser businessUser, TbBusiness business, TbBankcardInfo bankcardInfo);



    List<TbBusinessUser> query(TbBusinessUser businessUser);

    /**
     * 修改商户信息
     * @param tbBusinessUser
     */
    void updateTbBusinessUser(TbBusinessUser tbBusinessUser);

    /**
     * 商户登录
     */
    TbBusinessUser loginBusinessUser(TbBusinessUser tbBusinessUser);

     /* 根据主键查询商户
     * @param businessUid
     * @return
     */
    TbBusinessUser findByBusinessUid(String businessUid);

    /**
     * 手机号是否存在
     * @param contactPhone
     * @return
     */
    TbBusinessUser findBusinessUserBycontactPhone(String contactPhone);
}
