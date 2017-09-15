package com.brcd.mapper;

import com.brcd.bean.TbBusinessUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 商户管理持久层
 * Created by admin on 2017/9/5.
 */
@Mapper
@Repository
public interface TbBusinessUserMapper {
    /**
     * 修改商户信息
     * @param tbBusinessUser
     */
    void updateTbBusinessUser(TbBusinessUser tbBusinessUser);

    /**
     * 根据主键查询商户
     * @param businessUid
     * @return
     */
    TbBusinessUser findByBusinessUid(String businessUid);

    //添加商户信息
    void insertBusinessUser(TbBusinessUser businessUser);

    List<TbBusinessUser> query(TbBusinessUser businessUser);

    /**
     * 商户登录
     */
    TbBusinessUser loginBusinessUser(TbBusinessUser tbBusinessUser);


    /**
     * 验证手机号是否存在
     */
    TbBusinessUser findBusinessUserBycontactPhone(String contactPhone);
}
