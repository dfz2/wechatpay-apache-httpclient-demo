package com.github.wechatpay.payload;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:05
 */

public class BusinessLicenseInfo {

    private String license_copy;
    private String license_number;
    private String merchant_name;
    private String legal_person;

    public String getLicense_copy() {
        return license_copy;
    }

    public void setLicense_copy(String license_copy) {
        this.license_copy = license_copy;
    }

    public String getLicense_number() {
        return license_number;
    }

    public void setLicense_number(String license_number) {
        this.license_number = license_number;
    }

    public String getMerchant_name() {
        return merchant_name;
    }

    public void setMerchant_name(String merchant_name) {
        this.merchant_name = merchant_name;
    }

    public String getLegal_person() {
        return legal_person;
    }

    public void setLegal_person(String legal_person) {
        this.legal_person = legal_person;
    }
}
