package com.brcd.service;

import com.brcd.bean.TbBusinessUser;

/**
 * 商户管理业务层
 * Created by admin on 2017/9/5.
 */
public interface TbBusinessUserService {
    /**
     * 修改商户信息
     * @param tbBusinessUser
     */
    void updateTbBusinessUser(TbBusinessUser tbBusinessUser);
}
