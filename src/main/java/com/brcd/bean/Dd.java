package com.brcd.bean;

import lombok.Data;

/**
 * 数据字典pojo
 * Created by 韩明泽 on 2017/9/9.
 */
@Data
public class Dd {
    //字段名
    private String dictDataKey;
    //对应的码
    private Integer dictDataCode;
    //值
    private String dictDataValue;
}
