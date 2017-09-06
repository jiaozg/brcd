package com.brcd.bean;

import lombok.Data;

@Data
public class TbAreaDictionary {
    private String arceName;

    private Integer arceCode;

    private String upArceName;

    private Integer upArceOde;

  /*  public String getArceName() {
        return arceName;
    }

    public void setArceName(String arceName) {
        this.arceName = arceName == null ? null : arceName.trim();
    }

    public Integer getArceCode() {
        return arceCode;
    }

    public void setArceCode(Integer arceCode) {
        this.arceCode = arceCode;
    }

    public String getUpArceName() {
        return upArceName;
    }

    public void setUpArceName(String upArceName) {
        this.upArceName = upArceName == null ? null : upArceName.trim();
    }

    public Integer getUpArceOde() {
        return upArceOde;
    }

    public void setUpArceOde(Integer upArceOde) {
        this.upArceOde = upArceOde;
    }*/
}