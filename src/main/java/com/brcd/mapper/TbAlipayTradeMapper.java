package com.brcd.mapper;

import com.brcd.bean.TbAlipayTrade;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by lenovo on 2017/9/8.
 */
@Mapper
@Component
public interface TbAlipayTradeMapper {
    List<TbAlipayTrade> getAlipayTrade();
}
