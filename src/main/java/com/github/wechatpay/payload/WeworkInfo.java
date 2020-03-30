package com.github.wechatpay.payload;

import java.util.List;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:17
 */

public class WeworkInfo {

    private String corp_id;
    private String sub_corp_id;
    private List<String> wework_pics;

    public String getCorp_id() {
        return corp_id;
    }

    public void setCorp_id(String corp_id) {
        this.corp_id = corp_id;
    }

    public String getSub_corp_id() {
        return sub_corp_id;
    }

    public void setSub_corp_id(String sub_corp_id) {
        this.sub_corp_id = sub_corp_id;
    }

    public List<String> getWework_pics() {
        return wework_pics;
    }

    public void setWework_pics(List<String> wework_pics) {
        this.wework_pics = wework_pics;
    }
}
