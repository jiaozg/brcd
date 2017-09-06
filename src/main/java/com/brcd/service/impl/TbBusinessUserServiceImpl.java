package com.brcd.service.impl;

import com.brcd.bean.TbBusinessUser;
import com.brcd.mapper.TbBusinessUserMapper;
import com.brcd.service.TbBusinessUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 持久化业务层实现
 * Created by admin on 2017/9/5.
 */
@Service
public class TbBusinessUserServiceImpl implements TbBusinessUserService{
    @Autowired
    private TbBusinessUserMapper tbBusinessUserMapper;

    @Override

    public List<TbBusinessUser> query(TbBusinessUser businessUser) {
        return tbBusinessUserMapper.query(businessUser);

    public void updateTbBusinessUser(TbBusinessUser tbBusinessUser) {
        tbBusinessUserMapper.updateTbBusinessUser(tbBusinessUser);

    }
}
