package com.brcd.mapper;

import com.brcd.bean.TbWechatTrade;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 查询所有行业类型
 * Created by lenovo on 2017/9/7.
 */
@Mapper
@Component
public interface TbWechatTradeMapper {
    List<TbWechatTrade> getWechatTrade();
}
