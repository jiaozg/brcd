package com.brcd.controller;



import com.brcd.common.util.JSONUtil;
import com.brcd.vo.notify.WechatNotifyRequest;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;


/**
 * 北农商-微信-回调通知
 *
 * @author zhang.hui@pufubao.net
 * @version v1.0
 * @date 2016年4月28日 下午7:08:50
 */
@Controller
public class WechatNotify {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ResponseBody
    @RequestMapping("/wechatNotify")
    public String brcbWechatCallBack(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // step 1 定义返回
        String result = "SUCCESS";

        // step 2 解析请求参数,转换参数
        String reqStr = parseRequest2JsonStr(request);
        logger.info("解析北农商通知内容请求参数为:{}", reqStr);
        if (StringUtils.isBlank(reqStr)) {
            result = "接收参数为空";
            return result;
        }
        // 将json字符串转换为对象
        WechatNotifyRequest notifyRequest = null;
        try {
            notifyRequest = JSONUtil.parseObject(reqStr, WechatNotifyRequest.class);
        } catch (Exception e1) {
            logger.error("解析请求参数失败,信息: {}", e1);
            result = "解析请求参数失败";
            return result;
        }

        logger.info("转换的对象数据为：{}", JSONUtil.toJSONString(notifyRequest));
        // step 3 参数校验
        // step 4 查询交易订单
        // 若订单已经更新为SUCCESS，则不再更新直接返回结果
        // step 5 更新交易订单
        return result;
    }

    /**
     * 解析请求参数为JSON字符串
     *
     * @param request 请求
     * @return
     * @throws Exception
     * @author zhang.hui@pufubao.net
     * @date 2016年10月17日 下午9:17:35
     */
    public String parseRequest2JsonStr(HttpServletRequest request) throws Exception {
        // 读取参数
        InputStream inputStream;
        StringBuffer sb = new StringBuffer();
        inputStream = request.getInputStream();
        String s;
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        while ((s = in.readLine()) != null) {
            sb.append(s);
        }
        in.close();
        inputStream.close();
        String reqStr = sb.toString();

        return reqStr;
    }

}
