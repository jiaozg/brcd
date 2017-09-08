package com.brcd.mapper;

import com.brcd.bean.TbSettle;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by 朱梦光 on 2017/9/7.
 */
@Component
@Mapper
public interface TbSettleMapper {
    /*
      查询结算记录
     */
    List<TbSettle> selectTbSettleList(TbSettle settle);

}
