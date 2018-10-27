package com.example.demo.request;

import java.io.Serializable;

/**
 *  手机号请求参数解析
 * @author  Ding.Jie
 */
public class MobileResult implements Serializable {
    private String mobile;
    private String templateid;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTemplateid() {
        return templateid;
    }

    public void setTemplateid(String templateid) {
        this.templateid = templateid;
    }

    @Override
    public String toString() {
        return "ResponeResult{" +
                "mobile='" + mobile + '\'' +
                ", templateid='" + templateid + '\'' +
                '}';
    }
}
