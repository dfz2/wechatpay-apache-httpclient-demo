package com.github.wechatpay.payload;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:06
 */

public class CertificateInfo {

    private String cert_copy;
    private String cert_type;
    private String cert_number;
    private String merchant_name;
    private String company_address;
    private String legal_person;
    private String period_begin;
    private String period_end;


    public String getCert_copy() {
        return cert_copy;
    }

    public void setCert_copy(String cert_copy) {
        this.cert_copy = cert_copy;
    }

    public String getCert_type() {
        return cert_type;
    }

    public void setCert_type(String cert_type) {
        this.cert_type = cert_type;
    }

    public String getCert_number() {
        return cert_number;
    }

    public void setCert_number(String cert_number) {
        this.cert_number = cert_number;
    }

    public String getMerchant_name() {
        return merchant_name;
    }

    public void setMerchant_name(String merchant_name) {
        this.merchant_name = merchant_name;
    }

    public String getCompany_address() {
        return company_address;
    }

    public void setCompany_address(String company_address) {
        this.company_address = company_address;
    }

    public String getLegal_person() {
        return legal_person;
    }

    public void setLegal_person(String legal_person) {
        this.legal_person = legal_person;
    }

    public String getPeriod_begin() {
        return period_begin;
    }

    public void setPeriod_begin(String period_begin) {
        this.period_begin = period_begin;
    }

    public String getPeriod_end() {
        return period_end;
    }

    public void setPeriod_end(String period_end) {
        this.period_end = period_end;
    }
}
