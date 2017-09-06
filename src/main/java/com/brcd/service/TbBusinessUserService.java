package com.brcd.service;

import com.brcd.bean.TbBusinessUser;

import java.util.List;

/**
 * 商户管理业务层
 * Created by admin on 2017/9/5.
 */
public interface TbBusinessUserService {

    List<TbBusinessUser> query(TbBusinessUser businessUser);
}
