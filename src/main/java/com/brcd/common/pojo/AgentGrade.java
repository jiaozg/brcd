package com.brcd.common.pojo;

import lombok.Data;

/**代理商级别pojo
 * Created by 韩明泽 on 2017/9/7.
 */
@Data
public class AgentGrade {
  private Integer dj;
  private String yi;

    public AgentGrade(Integer dj, String yi) {
        this.dj = dj;
        this.yi = yi;
    }
}
