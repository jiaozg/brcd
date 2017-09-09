package com.brcd.mapper;

import com.brcd.bean.TbBusinessUser;
import com.brcd.bean.TbBusinessUserExtend;
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

    //添加商户信息
    void insertBusinessUser(TbBusinessUser businessUser);


    List<TbBusinessUser> query(TbBusinessUser businessUser);

    TbBusinessUserExtend getBusinessUserAndBank(int id);
}
