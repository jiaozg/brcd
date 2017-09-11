package com.brcd.controller;

import com.brcd.bean.TbProfit;
import com.brcd.common.util.ExportExcel;
import com.brcd.service.TbProfitService;
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
 * @author 付德鹏
 * @version V1.0
 * @Title: 分润controller
 * @Package com.brcd.controller
 * @date 2017-09-06
 */
@Controller
public class TbProfitController {

    @Autowired
    private TbProfitService profitService;

    /*
* 时间格式的转换
*/
    @InitBinder
    public void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }

    @RequestMapping("profit/findProfitListToPage")
    public String findProfitListToPage(TbProfit profit, Model model, Integer pageNo,HttpServletRequest request) {
        System.out.println("======::======");
        //分页查询
        if (pageNo == null) {
            pageNo = 1;
        }
        int pageSize = 5;
        PageHelper.startPage(pageNo, pageSize);
        List<TbProfit> page = profitService.findProfitListToPage(profit);
        model.addAttribute("profitList", page);
        request.setAttribute("exportPage",page);
        model.addAttribute("showBack", profit);
        //分页信息
        PageInfo<TbProfit> pageInfo = new PageInfo<>(page);
        //添加分页的参数
        long total = pageInfo.getTotal(); //总记录数
        int pages = pageInfo.getPages();   //总条数
        model.addAttribute("total", total);
        model.addAttribute("pages", pages);
        model.addAttribute("pageNo", pageNo);


        return "menu/jiaoyiguanli/fenrunjilu";
    }
    /*
     导出数据
     */
    @RequestMapping("profit/exportExcel")
    public void exportExcel(TbProfit profit, HttpServletRequest request, HttpServletResponse response)throws Exception{

        String[] headers = {"结算批次号","结算流水","结算时间","商户编号","拥有者类型","结算类型","结算模式","订单总金额","订单总笔数","交易手续费","结算手续费","结算金额","结算状态","备注"};

        String fileName="分润记录.xls";
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

        ExportExcel<TbProfit> ex = new ExportExcel<>();

        List<TbProfit> pageList = profitService.findProfitListToPage(profit);

        OutputStream out = response.getOutputStream();

        ex.exportExcel(headers,pageList,out);

        out.close();
    }

}
