package com.brcd.controller;

import com.brcd.bean.TbAgent;
import com.brcd.common.util.FtpUtil;
import com.brcd.common.util.IDUtils;
import com.brcd.service.PersonageMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by 任彩雨 on 2017/9/5.
 * 个人信息的Controller
 */
@Controller
public class PersonageMessageController {
    @Value("${FTP_ADDRESS}")
    private String FTP_ADDRESS;//IP地址
    @Value("${FTP_PORT}")
    private Integer FTP_PORT;//端口号
    @Value("${FTP_USERNAME}")
    private String FTP_USERNAME;//用户名
    @Value("${FTP_PASSWORD}")
    private String FTP_PASSWORD;//密码
    @Value("${FTP_BASE_PATH}")
    private String FTP_BASE_PATH;//ftp的图片服务器根路径
    @Value("${IMAGE_BASE_URL}")
    private String IMAGE_BASE_URL;//#ftp图片服务器的url
    @Value("${IMAGEPATH}")
    private String IMAGEPATH;//#ftp图片服务器的url

    @Autowired
    private PersonageMessageService personageMessageService;

    //查询出来登录用户的信息
    @RequestMapping("toPersonageMessage")
    public String PersonageMessage(Model model, HttpSession session) {
        TbAgent agent = (TbAgent) session.getAttribute("agentLogin");
        TbAgent queryAgentMsg = personageMessageService.queryAgentMsg(agent);
        System.out.println(queryAgentMsg);
        model.addAttribute("agentMsg", queryAgentMsg);
        return "user/gerenxinxi";
    }

    //实现修改保存
    @RequestMapping("save")
    public String save(TbAgent tbAgent, MultipartFile headSculptureFile, HttpSession session) throws IOException {
        if (headSculptureFile != null) {
            String oldName = headSculptureFile.getOriginalFilename();//取出原始文件名
            String newName = IDUtils.genItemId();//随机生成一个毫秒数
            if (oldName.indexOf(".") != -1) {
                newName = newName + oldName.substring(oldName.indexOf("."));
                boolean result = FtpUtil.uploadFile(FTP_ADDRESS, FTP_PORT, FTP_USERNAME, FTP_PASSWORD, FTP_BASE_PATH, IMAGEPATH, newName, headSculptureFile.getInputStream());
                if (result == true) {
                    tbAgent.setHeadSculpture(IMAGE_BASE_URL + IMAGEPATH + newName);//获取图片路径
                }
            }
        }
        personageMessageService.updatePersonageMsg(tbAgent);
        session.removeAttribute("agentLogin");//注销登陆的session值
        return "login";
    }

    //修改密码
    @RequestMapping("toUpdatePassword")//到修改界面
    public String toUpdatePassword(HttpSession session, Model model) {
        TbAgent agentLogin = (TbAgent) session.getAttribute("agentLogin");
        model.addAttribute("updatePwdMsg", agentLogin);
        return "user/xiugaimima";
    }

    @RequestMapping("updatePassword")//到修改界面
    public String updatePassword(TbAgent tbAgent) {
        return "login";
    }
}
