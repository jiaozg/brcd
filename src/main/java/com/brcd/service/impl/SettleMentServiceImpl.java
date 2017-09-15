package com.brcd.service.impl;

import com.brcd.bean.SettleMent;
import com.brcd.mapper.SettleMentMapper;
import com.brcd.service.SettleMentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ${崔帅} on 2017/9/12.
 */
@Service
public class SettleMentServiceImpl implements SettleMentService{
    @Autowired
    private SettleMentMapper settleMentMapper;

    @Override
    public void insertSettleMent(SettleMent settleMent){
        settleMentMapper.insertSettleMent(settleMent);
    }

}
