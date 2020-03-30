package com.github.wechatpay.payload;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:13
 */

public class BusinessInfo {

    private String merchant_shortname;
    private String service_phone;
    private SalesInfo sales_info;


    public String getMerchant_shortname() {
        return merchant_shortname;
    }

    public void setMerchant_shortname(String merchant_shortname) {
        this.merchant_shortname = merchant_shortname;
    }

    public String getService_phone() {
        return service_phone;
    }

    public void setService_phone(String service_phone) {
        this.service_phone = service_phone;
    }

    public SalesInfo getSales_info() {
        return sales_info;
    }

    public void setSales_info(SalesInfo sales_info) {
        this.sales_info = sales_info;
    }
}
