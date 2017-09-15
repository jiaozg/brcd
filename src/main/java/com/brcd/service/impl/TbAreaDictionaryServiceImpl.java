package com.brcd.service.impl;

import com.brcd.bean.TbAreaDictionary;
import com.brcd.mapper.TbAreaDictionaryMapper;
import com.brcd.service.TbAreaDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/9/11.
 */
@Service
public class TbAreaDictionaryServiceImpl implements TbAreaDictionaryService{
    @Autowired
    private TbAreaDictionaryMapper tbAreaDictionaryMapper;

    @Override
    public List<TbAreaDictionary> findByareaId() {
        return tbAreaDictionaryMapper.findByareaId(1);
    }

    @Override
    public List<TbAreaDictionary> findByAreaOde(String areaCode) {
        return tbAreaDictionaryMapper.findByAreaOde(areaCode);
    }

    @Override
    public List<TbAreaDictionary> findByUpAreaName(String upAreaName) {
        return tbAreaDictionaryMapper.findByUpAreaName(upAreaName);
    }
}
