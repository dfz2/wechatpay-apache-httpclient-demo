package com.github.wechatpay.payload;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:10
 */


public class MicroStoreInfo {

    private String micro_name;
    private String micro_address_code;
    private String micro_address;
    private String store_entrance_pic;
    private String micro_indoor_copy;
    private String store_longitude;
    private String store_latitude;
    private String address_certification;


    public String getMicro_name() {
        return micro_name;
    }

    public void setMicro_name(String micro_name) {
        this.micro_name = micro_name;
    }

    public String getMicro_address_code() {
        return micro_address_code;
    }

    public void setMicro_address_code(String micro_address_code) {
        this.micro_address_code = micro_address_code;
    }

    public String getMicro_address() {
        return micro_address;
    }

    public void setMicro_address(String micro_address) {
        this.micro_address = micro_address;
    }

    public String getStore_entrance_pic() {
        return store_entrance_pic;
    }

    public void setStore_entrance_pic(String store_entrance_pic) {
        this.store_entrance_pic = store_entrance_pic;
    }

    public String getMicro_indoor_copy() {
        return micro_indoor_copy;
    }

    public void setMicro_indoor_copy(String micro_indoor_copy) {
        this.micro_indoor_copy = micro_indoor_copy;
    }

    public String getStore_longitude() {
        return store_longitude;
    }

    public void setStore_longitude(String store_longitude) {
        this.store_longitude = store_longitude;
    }

    public String getStore_latitude() {
        return store_latitude;
    }

    public void setStore_latitude(String store_latitude) {
        this.store_latitude = store_latitude;
    }

    public String getAddress_certification() {
        return address_certification;
    }

    public void setAddress_certification(String address_certification) {
        this.address_certification = address_certification;
    }
}
