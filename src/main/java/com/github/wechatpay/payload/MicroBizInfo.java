package com.github.wechatpay.payload;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:07
 */

public class MicroBizInfo {

    private String micro_biz_type;
    private MicroStoreInfo micro_store_info;
    private MicroMobileInfo micro_mobile_info;
    private MicroOnlineInfo micro_online_info;

    public String getMicro_biz_type() {
        return micro_biz_type;
    }

    public void setMicro_biz_type(String micro_biz_type) {
        this.micro_biz_type = micro_biz_type;
    }

    public MicroStoreInfo getMicro_store_info() {
        return micro_store_info;
    }

    public void setMicro_store_info(MicroStoreInfo micro_store_info) {
        this.micro_store_info = micro_store_info;
    }

    public MicroMobileInfo getMicro_mobile_info() {
        return micro_mobile_info;
    }

    public void setMicro_mobile_info(MicroMobileInfo micro_mobile_info) {
        this.micro_mobile_info = micro_mobile_info;
    }

    public MicroOnlineInfo getMicro_online_info() {
        return micro_online_info;
    }

    public void setMicro_online_info(MicroOnlineInfo micro_online_info) {
        this.micro_online_info = micro_online_info;
    }
}
