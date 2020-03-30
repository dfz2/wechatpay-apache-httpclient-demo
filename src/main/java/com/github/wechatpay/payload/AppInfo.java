package com.github.wechatpay.payload;

import java.util.List;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:16
 */


public class AppInfo {

    private String app_appid;
    private String app_sub_appid;
    private List<String> app_pics;

    public String getApp_appid() {
        return app_appid;
    }

    public void setApp_appid(String app_appid) {
        this.app_appid = app_appid;
    }

    public String getApp_sub_appid() {
        return app_sub_appid;
    }

    public void setApp_sub_appid(String app_sub_appid) {
        this.app_sub_appid = app_sub_appid;
    }

    public List<String> getApp_pics() {
        return app_pics;
    }

    public void setApp_pics(List<String> app_pics) {
        this.app_pics = app_pics;
    }
}
