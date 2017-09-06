package com.brcd.controller;

import com.brcd.service.TbBankcardInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by admin on 2017/9/6.
 */
@Controller
public class TbBankcardInfoController {
    @Autowired
    private TbBankcardInfoService tbBankcardInfoService;
}
