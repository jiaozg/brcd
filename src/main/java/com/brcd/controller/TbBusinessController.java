package com.brcd.controller;

import com.brcd.service.TbBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/9/6.
 */
@Controller
public class TbBusinessController {
    @Autowired
    private TbBusinessService tbBusinessService;
}
