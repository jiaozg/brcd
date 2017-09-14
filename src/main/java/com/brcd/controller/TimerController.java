package com.brcd.controller;

import com.brcd.bean.Pojo;
import com.brcd.bean.SettleMent;
import com.brcd.common.util.JSONUtil;
import com.brcd.common.util.MD5Util;
import com.brcd.service.SettleMentService;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**       定时任务   对账单文件下载 ，跑批    每天10点查询前一天的交易记录
 * Created by ${崔帅} on 2017/9/11.
 */

@Component
public class TimerController {

    @Autowired
    private SettleMentService settleMentService;
    /**
     *  每天十点开跑
     */
    @Scheduled(cron = "0 01 10 * * ?")
    public void TimerBegin() throws Exception{
        //执行第一个方法，获得签名
        String sign = getSign();
        //执行第二个方法，数据跑批
        getData(sign);

    }

    /**
     *     获得签名方法
     * @return
     */
    public String getSign(){
        //获得前一天的时间
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        Date orderDate = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String od = sdf.format(orderDate);
        //od = "20170906";
        String str = "agentNum=A149628212021310656&orderDate="+od+"&serviceType=CHECK_ORDER6ec855f4ff854c069a6d457748236d80";
        String sign = MD5Util.MD5Encode(str).toUpperCase();
        return sign;
    }

    /**
     *      获得数据
     * @param sign
     */
    public void getData(String sign) throws Exception{
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建一个post对象
        HttpPost post = new HttpPost("http://www.brcb-sandbox.sunfund.com/customer/service");
        Pojo p = new Pojo();
        p.setServiceType("CHECK_ORDER");
        p.setAgentNum("A149628212021310656");
        //获得前一天的时间
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        Date orderDate = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String od = sdf.format(orderDate);
        //String od ="20170906";
        p.setOrderDate(od);
        p.setSign(sign);
        String entity = JSONUtil.toJSONString(p);
        StringEntity result = new StringEntity(entity,"utf-8");

        post.setEntity(result);
        //执行post请求
        CloseableHttpResponse response = httpClient.execute(post);
        String string = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(string);
        SettleMent sm = new SettleMent();
        SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd hh:mm:ss");
        String[] strings = string.split("\n");
        for(int i = 1;i<strings.length;i++){
            if(strings.length==0){
                break;                                    //对空数据控制
            }
            if(strings[i]!=null&&strings[i]!=""){         //对空行控制
                String[] str2 = strings[i].split(",");
                for(int j = 0;j<str2.length;j++){
                    j=0;
                    if(str2[j].equals("总交易单数")){
                        break;
                    }
                    if(str2.length>0){
                        String a;
                        String b;
                        if(str2.length>5){
                            a = str2[j].substring(1);
                            System.out.println(a);
                            sm.setSettleTime(formatter.parse(a));      //交易时间
                            j++;
                            a = str2[j].substring(1);
                            sm.setCustomerNum(a);
                            j++;
                            a = str2[j].substring(1);
                            sm.setFacilityNum(a);
                            j++;
                            a = str2[j].substring(1);
                            sm.setPayProxy(a);
                            j++;
                            a = str2[j].substring(1);
                            sm.setProxyNum(a);
                            j++;
                            a = str2[j].substring(1);
                            sm.setAgentNum(a);
                            j++;
                            a = str2[j].substring(1);
                            sm.setOrderNum(a);
                            j++;
                            a = str2[j].substring(1);
                            sm.setSettleType(a);
                            j++;
                            a = str2[j].substring(1);
                            sm.setSettleStatus(a);
                            j++;
                            a = str2[j].substring(1);
                            sm.setSettleMode(a);
                            j++;
                            a = str2[j].substring(1);
                            BigDecimal d = new BigDecimal(a);
                            sm.setOrderAmount(d);
                            j++;
                            a = str2[j].substring(1);
                            sm.setProductName(a);
                            j++;
                            a = str2[j].substring(1);
                            sm.setSettleFee(Double.parseDouble(a));
                            j++;
                            a = str2[j].substring(1);
                            sm.setTradeFee(Double.parseDouble(a));
                            j++;
                            a = str2[j].substring(1);
                            sm.setCustomerRare(Float.parseFloat(a));
                            System.out.println(sm.getCustomerRare());
                            j++;
                            a = str2[j].substring(1);
                            sm.setProxyRare(Float.parseFloat(a));
                            System.out.println(sm.getProxyRare());
                            a = "";
                            j++;
                            settleMentService.insertSettleMent(sm);
                        }else{
                            if(str2[j]!=null&&str2[j].length()>0){
                                SettleMent settleMent = new SettleMent();
                                settleMent.setSettleTime(orderDate);
                                b = str2[j].substring(1);
                                System.out.println(b);
                                settleMent.setCountOrder(Double.parseDouble(b));
                                j++;
                                b = str2[j].substring(1);
                                settleMent.setCountMoney(Double.parseDouble(b));
                                j++;
                                b = str2[j].substring(1);
                                settleMent.setCountReturnMoney(Double.parseDouble(b));
                                j++;
                                b = str2[j].substring(1);
                                settleMent.setCountFeeProfitMoney(Double.parseDouble(b));
                                j++;
                                settleMentService.insertSettleMent(settleMent);
                            }else{
                                break;
                            }
                        }

                        if(j==((str2.length)-1)){
                            continue;
                        }
                    }
                }

            }
        }
        response.getEntity();
        response.close();
        httpClient.close();



    }

}
