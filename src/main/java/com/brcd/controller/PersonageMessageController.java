package com.brcd.controller;

import com.brcd.bean.FtpMsg;
import com.brcd.bean.TbAgent;
import com.brcd.common.util.FtpUtil;
import com.brcd.common.util.IDUtils;
import com.brcd.common.util.MD5Util;
import com.brcd.service.FtpMsgService;
import com.brcd.service.PersonageMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 任彩雨 on 2017/9/5.
 * 个人信息的Controller
 */
@Controller
public class PersonageMessageController {


    @Autowired
    private PersonageMessageService personageMessageService;

    @Autowired
    private FtpMsgService ftpMsgService;

    //查询出来登录用户的信息
    @RequestMapping("toPersonageMessage")
    public String PersonageMessage(Model model, HttpSession session) {
        TbAgent agent = (TbAgent) session.getAttribute("agentLogin");//session取值
        TbAgent queryAgentMsg = personageMessageService.queryAgentMsg(agent);
        model.addAttribute("agentMsg", queryAgentMsg);
        return "user/personageMessage";
    }

    //实现修改保存
    @RequestMapping("save")
    public String save(TbAgent tbAgent, MultipartFile headSculptureFile, HttpSession session) throws IOException {
        FtpMsg ftpMsg = ftpMsgService.getFtpMsg();
        if (headSculptureFile != null) {
            String oldName = headSculptureFile.getOriginalFilename();//取出原始文件名
            String newName = IDUtils.genItemId();//随机生成一个毫秒数
            if (oldName.indexOf(".") != -1) {//截取
                newName = newName + oldName.substring(oldName.indexOf("."));
                boolean result = FtpUtil.uploadFile(ftpMsg.getFtpAddress(), ftpMsg.getFtpPort(), ftpMsg.getFtpUserName(), ftpMsg.getFtpPassword(), ftpMsg.getFtpBasePath(), ftpMsg.getFtpImagePath(), newName, headSculptureFile.getInputStream());
                if (result == true) {
                    tbAgent.setHeadSculpture(ftpMsg.getFtpImageBaseUrl() + ftpMsg.getFtpImagePath() + newName);//获取图片路径
                }
            }
        }
        personageMessageService.updatePersonageMsg(tbAgent);
        return "forward:toPersonageMessage";
    }

    //修改密码
    @RequestMapping("toUpdatePassword")//到修改界面
    public String toUpdatePassword(HttpSession session, Model model) {
        TbAgent agentLogin = (TbAgent) session.getAttribute("agentLogin");//Session 中取值
        model.addAttribute("updatePwdMsg", agentLogin);//需要的Id去修改存到Model里
        return "user/updatePwd";
    }


    @RequestMapping("updatePassword")//实现修密码
    public String updatePassword(TbAgent tbAgent, HttpSession session) {
        personageMessageService.updatePassword(tbAgent);
        session.removeAttribute("agentLogin");//修改完密码将Session注销
        return "login";
    }


    //验证旧密码是否一致
    @RequestMapping("checkPwd")
    @ResponseBody
    public void checkUserName(TbAgent tbAgent, HttpServletResponse response) throws Exception {
        PrintWriter writer = response.getWriter();
        TbAgent checkPassword = personageMessageService.checkPassword(tbAgent);
        if (checkPassword != null && checkPassword.getPassword() != null) {
            writer.print("true");//一致
        } else {
            writer.print("false");
        }
        writer.flush();
    }

    //到修改FTP密码界面
    @RequestMapping("toUpdateFtpPwd")
    public String toUpdateFtpPwd(HttpSession session, Model model) {
        TbAgent agentLogin = (TbAgent) session.getAttribute("agentLogin");
        FtpMsg ftpMsg = ftpMsgService.getFtpMsg();
        if (agentLogin.getAgentGrade() != null && agentLogin.getAgentGrade() != 0) {//如果不是超级管理员不允许修改
            model.addAttribute("ftpMsg", ftpMsg);
            return "user/updateFtpPwdError";
        }
        model.addAttribute("ftpMsg", ftpMsg);
        return "user/updateFtpPwd";
    }

    //验证checkFtpPwd密码是否一致
    @RequestMapping("checkFtpPwd")
    @ResponseBody
    public void checkFtpPwd(FtpMsg ftpMsg, HttpServletResponse response) throws Exception {
        PrintWriter writer = response.getWriter();
        FtpMsg checkFtpUserName = ftpMsgService.checkFtpUserName(ftpMsg);
        FtpMsg checkFtpPassword = ftpMsgService.checkFtpPassword(ftpMsg);
        if (checkFtpUserName != null) {
            writer.print("true");
        }
        if (checkFtpPassword != null) {
            writer.print("true");
        }
        writer.flush();
    }

    //修改FTp密码
    @RequestMapping("updateFtpPassword")//到修改界面
    public String updateFtpPassword(FtpMsg ftpMsg) {
        ftpMsgService.updateFtpUserNamePwd(ftpMsg);
        return "login";
    }
}
