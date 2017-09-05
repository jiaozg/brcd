
![brcd](http://agent.bjrcb.pufubao.net/assets/image-resources/login-logo.png "项目logo")

模块划分及相关开发人员
---
```
*代理商基本信息,页面模板:任彩雨,王洪川  
*添加代理商,查询代理商(可以修改):邓高天,韩明泽  
*添加商户:赵翰,高永培  
*商户查询,商户信息管理(可以修改):白雪杰,李志轩  
*交易记录:崔帅  
*分润记录(导出excel):付德鹏  
*结算记录:朱梦光  
```

数据库表
---
| 表名  | 描述 |
| ---------- | -----------|
| agent   | 代理商信息表   |
| area_dictionary   | 地区字典   |
| bankcard_info   | 银行卡信息表   |
| business   | 业务信息表   |
| order   | 交易订单表   |
| tb_business_user   | 商户信息表   |
| tb_profit   | 分润信息表   |
| tb_settle   | 结算信息表   |

开发环境:
---
```
*开发工具:idea  
*jdk1.8+Springboot整合ssm+mysql+bootstrap+thymeleaf3.0+ftp图片服务器  
*注:mybatis使用xml配置
```

相关接口文档
---
[北农商接口文档](https://note.youdao.com/share/?token=82DAC0D2A0664ECFBE53CD5B09F342F6&gid=47293425#/ "悬停显示")
