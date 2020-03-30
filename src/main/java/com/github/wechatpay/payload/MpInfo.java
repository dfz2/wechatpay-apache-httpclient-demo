package com.github.wechatpay.payload;

import java.util.List;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:16
 */

public class MpInfo {

    private String mp_appid;
    private String mp_sub_appid;
    private List<String> mp_pics;

    public String getMp_appid() {
        return mp_appid;
    }

    public void setMp_appid(String mp_appid) {
        this.mp_appid = mp_appid;
    }

    public String getMp_sub_appid() {
        return mp_sub_appid;
    }

    public void setMp_sub_appid(String mp_sub_appid) {
        this.mp_sub_appid = mp_sub_appid;
    }

    public List<String> getMp_pics() {
        return mp_pics;
    }

    public void setMp_pics(List<String> mp_pics) {
        this.mp_pics = mp_pics;
    }
}
