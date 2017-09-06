package com.brcd.mapper;

import com.brcd.bean.TbBusiness;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 业务类持久层
 * Created by admin on 2017/9/6.
 */
@Mapper
@Repository
public interface TbBusinessMapper {
    /**
     * 商户业务修改
     * @param tbBusiness
     */
    void updateTbBusiness(TbBusiness tbBusiness);

}
