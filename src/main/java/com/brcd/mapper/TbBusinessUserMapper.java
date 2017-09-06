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

    List<TbBusinessUser> query(TbBusinessUser businessUser);
}
