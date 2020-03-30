package com.github.wechatpay.payload;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:11
 */

public class MicroOnlineInfo {

    private String micro_online_store;
    private String micro_ec_name;
    private String micro_qrcode;
    private String micro_link;

    public String getMicro_online_store() {
        return micro_online_store;
    }

    public void setMicro_online_store(String micro_online_store) {
        this.micro_online_store = micro_online_store;
    }

    public String getMicro_ec_name() {
        return micro_ec_name;
    }

    public void setMicro_ec_name(String micro_ec_name) {
        this.micro_ec_name = micro_ec_name;
    }

    public String getMicro_qrcode() {
        return micro_qrcode;
    }

    public void setMicro_qrcode(String micro_qrcode) {
        this.micro_qrcode = micro_qrcode;
    }

    public String getMicro_link() {
        return micro_link;
    }

    public void setMicro_link(String micro_link) {
        this.micro_link = micro_link;
    }
}
