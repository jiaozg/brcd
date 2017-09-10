package com.brcd.service.impl;

import com.brcd.bean.TbOrder;
import com.brcd.mapper.TbOrderMapper;
import com.brcd.service.TbOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ${崔帅} on 2017/9/6.
 */
@Service
public class TbOrderServiceImpl implements TbOrderService{
    @Autowired
    private TbOrderMapper tbOrderMapper;

    @Override
    public List<TbOrder> findAll(TbOrder order){
        return tbOrderMapper.select(order);
    }


}
