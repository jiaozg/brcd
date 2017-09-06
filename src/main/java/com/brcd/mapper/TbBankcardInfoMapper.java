package com.brcd.mapper;

import com.brcd.bean.TbBankcardInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2017/9/6.
 */
@Mapper
@Component
public interface TbBankcardInfoMapper {
    /**
     * 插入银行卡信息
     */
    void insertTbBankcardInfo(TbBankcardInfo bankcardInfo);

import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2017/9/6.
 */
@Mapper
@Repository
public interface TbBankcardInfoMapper {
    /**
     * 银行卡信息修改
     * @param tbBankcardInfo
     */
    void updateTbBankcardInfo(TbBankcardInfo tbBankcardInfo);

}
