package com.github.wechatpay.payload;

import java.util.List;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:15
 */

public class BizStoreInfo {
    private String biz_store_name;
    private String biz_address_code;
    private String biz_store_address;
    private String biz_sub_appid;
    private List<String> store_entrance_pic;
    private List<String> indoor_pic;

    public String getBiz_store_name() {
        return biz_store_name;
    }

    public void setBiz_store_name(String biz_store_name) {
        this.biz_store_name = biz_store_name;
    }

    public String getBiz_address_code() {
        return biz_address_code;
    }

    public void setBiz_address_code(String biz_address_code) {
        this.biz_address_code = biz_address_code;
    }

    public String getBiz_store_address() {
        return biz_store_address;
    }

    public void setBiz_store_address(String biz_store_address) {
        this.biz_store_address = biz_store_address;
    }

    public String getBiz_sub_appid() {
        return biz_sub_appid;
    }

    public void setBiz_sub_appid(String biz_sub_appid) {
        this.biz_sub_appid = biz_sub_appid;
    }

    public List<String> getStore_entrance_pic() {
        return store_entrance_pic;
    }

    public void setStore_entrance_pic(List<String> store_entrance_pic) {
        this.store_entrance_pic = store_entrance_pic;
    }

    public List<String> getIndoor_pic() {
        return indoor_pic;
    }

    public void setIndoor_pic(List<String> indoor_pic) {
        this.indoor_pic = indoor_pic;
    }
}
