package com.brcd.mapper;

import com.brcd.bean.TbBusiness;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2017/9/6.
 */
@Mapper
@Repository
public interface TbBusinessMapper {

    /*
     * 添加开通业务数据信息
     */
    void insertTbBusiness(TbBusiness business);
}
