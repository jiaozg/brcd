package com.brcd.mapper;

import com.brcd.bean.TbBankcardInfo;
import org.apache.ibatis.annotations.Mapper;
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
