package com.brcd.service.impl;

import com.brcd.bean.TbProfit;
import com.brcd.mapper.TbProfitMapper;
import com.brcd.service.TbProfitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 付德鹏
 * @version V1.0
 * @Title: 分润业务层实现类
 * @Package com.brcd.service.impl
 * @date 2017-09-06
 */
@Component
@Service
public class TbProfitServiceImpl implements TbProfitService {

    @Autowired
    private TbProfitMapper profitMapper;

    @Override
    public List<TbProfit> findProfitListToPage(TbProfit profit) {
        // TODO Auto-generated method stub
        System.out.println("======::======");

        return profitMapper.findProfitListToPage(profit);
    }
}
