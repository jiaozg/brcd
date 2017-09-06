package com.brcd.mapper;

import com.brcd.bean.TbBusinessUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 商户管理持久层
 * Created by admin on 2017/9/5.
 */
@Mapper
@Repository
public interface TbBusinessUserMapper {

    //添加商户信息
    void insertBusinessUser(TbBusinessUser businessUser);

}
