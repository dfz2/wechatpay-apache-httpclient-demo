package com.github.wechatpay.payload;

import java.util.List;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:11
 */

public class MicroMobileInfo {

    private String micro_mobile_name;
    private String micro_mobile_city;
    private String micro_mobile_address;
    private List<String> micro_mobile_pics;

    public String getMicro_mobile_name() {
        return micro_mobile_name;
    }

    public void setMicro_mobile_name(String micro_mobile_name) {
        this.micro_mobile_name = micro_mobile_name;
    }

    public String getMicro_mobile_city() {
        return micro_mobile_city;
    }

    public void setMicro_mobile_city(String micro_mobile_city) {
        this.micro_mobile_city = micro_mobile_city;
    }

    public String getMicro_mobile_address() {
        return micro_mobile_address;
    }

    public void setMicro_mobile_address(String micro_mobile_address) {
        this.micro_mobile_address = micro_mobile_address;
    }

    public List<String> getMicro_mobile_pics() {
        return micro_mobile_pics;
    }

    public void setMicro_mobile_pics(List<String> micro_mobile_pics) {
        this.micro_mobile_pics = micro_mobile_pics;
    }
}
