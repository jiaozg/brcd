package com.brcd.controller;

import com.brcd.bean.TbOrder;
import com.brcd.common.util.ExportExcel;
import com.brcd.service.TbOrderService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**      交易订单控制类
 * Created by ${崔帅} on 2017/9/6.
 */
@Controller
@RequestMapping("a/operate/order")
public class TbOrderController {
    @Autowired
    private TbOrderService tbOrderService;

    /*
  * 时间格式的转换
  */
    @InitBinder
    public void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }

    /**
     *                  分页按条件查询   分页
     * @param order
     * @param pageno
     * @param pagesize
     * @param request
     * @return
     */
    @RequestMapping("/list")
    public ModelAndView find(TbOrder order, @RequestParam(value="pageno",defaultValue="1")Integer pageno,
                             @RequestParam(value="pagesize",defaultValue="3")Integer pagesize, HttpServletRequest request,Model model){
       if (order==null){
           order = new TbOrder();
       }
        Integer listCount = tbOrderService.findAll(order).size();
        Integer pageCount = listCount /pagesize+(listCount % pagesize != 0 ? 1 : 0);
        PageHelper.startPage(pageno,pagesize);
        List<TbOrder> ords = tbOrderService.findAll(order);
        ModelAndView mv = new ModelAndView("menu/jiaoyiguanli/jiaoyijilu.html");
        mv.addObject("orders",ords);
        model.addAttribute("history",order);
        request.setAttribute("currentPage",pageno);   //第几页
        request.setAttribute("pageCount",pageCount); //每页几条
        request.setAttribute("listCount",listCount);  //总页数
        return mv;

    }

    @RequestMapping("/exportExcel")
    public void exportExcel(TbOrder order, HttpServletRequest request, HttpServletResponse response)throws Exception{

        String[] headers = {"订单编号","商户编号","渠道商单号","渠道商编号","订单类型","订单状态","总金额","结算方式","对账状态","结算状态","创建时间"};

        String fileName="交易记录.xls";
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

        ExportExcel<TbOrder> ex = new ExportExcel<>();

        List<TbOrder> list = tbOrderService.findAll(order);

        OutputStream out = response.getOutputStream();
        ex.exportExcel(headers, list, out);
        out.close();
    }
}
