package com.brcd.controller;

import com.brcd.bean.TbAreaDictionary;
import com.brcd.service.TbAreaDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by admin on 2017/9/11.
 */
@Controller
@RequestMapping("TbAreaDictionary")
public class TbAreaDictionaryController {
    @Autowired
    private TbAreaDictionaryService tbAreaDictionaryService;

    /**
     * 根据省的地区码查询市
     * @param areaCode
     * @return
     */
    @RequestMapping("findByAreaOde")
    @ResponseBody
    public List<TbAreaDictionary> findByAreaOde(String areaCode){
        return tbAreaDictionaryService.findByAreaOde(areaCode);
    }

    /**
     * @param areaName
     * @return
     */
    @RequestMapping("findByAreaName")
    @ResponseBody
    public List<TbAreaDictionary> findByAreaName(String areaName){
        return tbAreaDictionaryService.findByUpAreaName(areaName);
    }
}
