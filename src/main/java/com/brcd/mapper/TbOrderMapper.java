package com.brcd.mapper;

import com.brcd.bean.TbOrder;

import java.util.List;

/**
 * Created by ${崔帅} on 2017/9/5.
 */

public interface TbOrderMapper {
    List<TbOrder> select(TbOrder order);
}
