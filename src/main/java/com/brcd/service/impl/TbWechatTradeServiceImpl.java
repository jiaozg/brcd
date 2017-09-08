package com.brcd.service.impl;

import com.brcd.bean.TbWechatTrade;
import com.brcd.mapper.TbWechatTradeMapper;
import com.brcd.service.TbWechatTradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2017/9/7.
 */
@Service
public class TbWechatTradeServiceImpl implements TbWechatTradeService{

    @Autowired
    private TbWechatTradeMapper tbWechatTradeMapper;

    /**
     * 查询所有行业类型
     * @return
     */
    @Override
    public List<TbWechatTrade> getWechatTrade() {
        List<TbWechatTrade> wechatTrades = tbWechatTradeMapper.getWechatTrade();
        if(wechatTrades != null && wechatTrades.size() > 0){
            return wechatTrades;
        }
        return null;
    }
}
