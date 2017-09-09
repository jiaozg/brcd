package com.brcd.mapper;

import com.brcd.bean.TbOrder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**   查询交易记录
 * Created by ${崔帅} on 2017/9/5.
 */
@Mapper
@Repository
public interface TbOrderMapper {
    List<TbOrder> select(TbOrder order);
}
