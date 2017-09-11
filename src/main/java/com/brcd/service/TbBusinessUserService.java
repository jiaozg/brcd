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
     * 根据主键查询商户
     * @param businessUid
     * @return
     */
    TbBusinessUser findByBusinessUid(Integer businessUid);

}
