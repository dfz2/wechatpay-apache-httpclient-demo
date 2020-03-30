package com.github.wechatpay.payload;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:17
 */

public class WebInfo {
    private String domain;
    private String web_authorisation;
    private String web_appid;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getWeb_authorisation() {
        return web_authorisation;
    }

    public void setWeb_authorisation(String web_authorisation) {
        this.web_authorisation = web_authorisation;
    }

    public String getWeb_appid() {
        return web_appid;
    }

    public void setWeb_appid(String web_appid) {
        this.web_appid = web_appid;
    }
}
