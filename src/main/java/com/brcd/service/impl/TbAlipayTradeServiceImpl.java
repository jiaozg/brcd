package com.brcd.service.impl;

import com.brcd.bean.TbAlipayTrade;
import com.brcd.mapper.TbAlipayTradeMapper;
import com.brcd.service.TbAlipayTradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2017/9/8.
 */
@Service
public class TbAlipayTradeServiceImpl implements TbAlipayTradeService{

    @Autowired
    private TbAlipayTradeMapper tbAlipayTradeMapper;

    @Override
    public List<TbAlipayTrade> getAlipayTrade() {
        List<TbAlipayTrade> alipayTrades = tbAlipayTradeMapper.getAlipayTrade();
        if(alipayTrades != null && alipayTrades.size() > 0){
            return alipayTrades;
        }
        return null;
    }
}
