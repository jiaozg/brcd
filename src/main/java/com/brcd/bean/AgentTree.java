package com.brcd.bean;

import lombok.Data;

/**
 * Created by 韩明泽 on 2017/9/9.
 */

public class AgentTree {
    private Long id;
    private Long pid;
    private String name;
    private Boolean isParent=true;
    private String url;
    private String agentNumber;
    private String target ="iframeContent";

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
        setLinkUrl();
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
        setLinkUrl();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setLinkUrl();
    }

    public Boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
        setLinkUrl();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
        setLinkUrl();
    }

    public String getAgentNumber() {
        return agentNumber;
    }

    public void setAgentNumber(String agentNumber) {
        this.agentNumber = agentNumber;
        setLinkUrl();
    }

    private void setLinkUrl(){
        if (this.id!=0L){
            url="./getAgent?agentNumber="+this.agentNumber;
        }
    }
}
