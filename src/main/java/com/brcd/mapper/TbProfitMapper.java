package com.brcd.mapper;

import com.brcd.bean.TbProfit;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 付德鹏
 * @version V1.0
 * @Title: 分润mapper
 * @Package com.brcd.mapper
 * @date 2017-09-06 13:38
 */
@Component
@Mapper
public interface TbProfitMapper {

    List<TbProfit> findProfitListToPage(TbProfit profit);

}
