package com.github.wechatpay.payload;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:07
 */

public class OrganizationInfo {

    private String organization_copy;
    private String organization_code;
    private String org_period_begin;
    private String org_period_end;

    public String getOrganization_copy() {
        return organization_copy;
    }

    public void setOrganization_copy(String organization_copy) {
        this.organization_copy = organization_copy;
    }

    public String getOrganization_code() {
        return organization_code;
    }

    public void setOrganization_code(String organization_code) {
        this.organization_code = organization_code;
    }

    public String getOrg_period_begin() {
        return org_period_begin;
    }

    public void setOrg_period_begin(String org_period_begin) {
        this.org_period_begin = org_period_begin;
    }

    public String getOrg_period_end() {
        return org_period_end;
    }

    public void setOrg_period_end(String org_period_end) {
        this.org_period_end = org_period_end;
    }
}
