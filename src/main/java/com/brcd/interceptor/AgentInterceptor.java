/*
package com.brcd.interceptor;


import com.brcd.bean.TbAgent;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AgentInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        System.err.println("---拦截器---");
        String url = request.getRequestURI();
        HttpSession session = request.getSession();
        TbAgent agentLogin = (TbAgent) session.getAttribute("agentLogin");
        if (url.indexOf("toAgentLogin") >= -1) {
            return true;
       }
       if (url.indexOf("AgentLogin") >= -1) {
            return true;
       }if (url.indexOf("goToIndex") > -1) {
            return true;
       }if (url.indexOf("scan_param") > -1) {
           return true;
       }if (url.indexOf("scan") > -1) {
          return true;
       }if (url.indexOf("scan_qrcode") > -1) {
            return true;
       }if (url.indexOf("loginBusiness") >= -1) {
            return true;
      }
        if (agentLogin == null) {
            request.getRequestDispatcher("toAgentLogin").forward(request, response);
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {


    }
}
*/
