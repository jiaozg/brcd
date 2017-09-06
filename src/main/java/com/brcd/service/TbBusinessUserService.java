package com.brcd.service;

import com.brcd.bean.TbBankcardInfo;
import com.brcd.bean.TbBusiness;
import com.brcd.bean.TbBusinessUser;

/**
 * 商户管理业务层
 * Created by admin on 2017/9/5.
 * 赵翰
 */
public interface TbBusinessUserService {
    /**
     * 添加商户
     */
    public void insertBusinessUser(TbBusinessUser businessUser, TbBusiness business, TbBankcardInfo bankcardInfo);
}
