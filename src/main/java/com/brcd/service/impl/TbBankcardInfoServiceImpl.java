package com.brcd.service.impl;

import com.brcd.bean.TbBankcardInfo;
import com.brcd.mapper.TbBankcardInfoMapper;
import com.brcd.service.TbBankcardInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2017/9/6.
 */
@Service
public class TbBankcardInfoServiceImpl implements TbBankcardInfoService {
    @Autowired
    private TbBankcardInfoMapper tbBankcardInfoMapper;

    @Override
    public void updateTbBankcardInfo(TbBankcardInfo tbBankcardInfo) {
        tbBankcardInfoMapper.updateTbBankcardInfo(tbBankcardInfo);
    }
}
