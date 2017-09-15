package com.brcd.controller;

import com.brcd.bean.TbSettle;
import com.brcd.common.util.ExportExcel;
import com.brcd.service.TbSettleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.deploy.net.URLEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by 朱梦光 on 2017/9/7.查询结算交易Controller
 */
@Controller
@RequestMapping("settle")
public class TbSettleController {

    @Autowired
    private TbSettleService tbSettleService;

    /*
* 时间格式的转换
*/
    @InitBinder
    public void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }

    @RequestMapping("/pageIndex")
    public String pageIndex() {

        return "forward:selectTbSettleList";
    }

    @RequestMapping("/selectTbSettleList")
    public String selectTbSettleList(TbSettle settle, Model model, Integer pageNo) {

        if (pageNo == null) {
            pageNo = 1;
        }

        Integer pageSize =5;
        PageHelper.startPage(pageNo,pageSize);
        List<TbSettle> pageList = tbSettleService.selectSettleList(settle);
        model.addAttribute("pageList", pageList);
        model.addAttribute("showBack", settle);

        PageInfo pageInfo = new PageInfo<>(pageList, 15);

        model.addAttribute("selectTbSettleList", pageInfo.getList());

        long listCount = pageInfo.getTotal(); //总记录数
        int pageCount = pageInfo.getPages();   //总条数

        //当前页
        model.addAttribute("total", pageNo);
        //总记录数
        model.addAttribute("pages", listCount);
        //总页码
        model.addAttribute("pageNo", pageCount);


        return "menu/jiesuanguanli/jiesuanjilu";
    }

    /*
    导出数据
    */
    @RequestMapping("settle/exportExcel")
    public void exportExcel(TbSettle settle, HttpServletRequest request, HttpServletResponse response)throws Exception{

        String[] headers = {"结算批次号","结算流水","结算时间","商户编号","商户类型","结算类型","结算模式","订单总金额","订单总笔数","手续费","结算金额","结算状态","备注"};

        String fileName="结算记录.xls";
        String userAgent = request.getHeader("User-Agent");
        //针对IE或者以IE为内核的浏览器：
        if (userAgent.contains("MSIE")||userAgent.contains("Trident")) {
            fileName = URLEncoder.encode(fileName, "GBK");
        } else {//非IE浏览器的处理：
            fileName = new String(fileName.getBytes("GBK"),"ISO-8859-1");
        }

        response.setHeader("Content-Disposition", String.format("attachment; filename=\"%s\"", fileName));
        response.setContentType("application/vnd.ms-excel;charset=GBK");
        response.setCharacterEncoding("GBK");

        ExportExcel<TbSettle> ex = new ExportExcel<>();

         List<TbSettle> pageList = tbSettleService.selectSettleList(settle);
        OutputStream out = response.getOutputStream();

        ex.exportExcel(headers,pageList,out);

        out.close();
    }
}
