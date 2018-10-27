package com.example.demo.request;

import java.io.Serializable;

;

/**
 * 请求数据解析
 * Ding.Jie
 */
public class ResultData implements Serializable {
    private MobileResult data;
    private String app_id;

    public MobileResult getData() {
        return data;
    }

    public void setData(MobileResult data) {
        this.data = data;
    }

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    @Override
    public String toString() {
        return "ResultData{" +
                "data='" + data + '\'' +
                ", app_id='" + app_id + '\'' +
                '}';
    }
}
