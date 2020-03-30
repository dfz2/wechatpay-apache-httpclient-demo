package com.github.wechatpay.payload;

import com.github.wechatpay.apiv3.WechatResponse;

import java.util.List;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:19
 */


public class QueryApplymentResponse extends WechatResponse {

    private String business_code;
    private long applyment_id;
    private String sub_mchid;
    private String sign_url;
    private String applyment_state;
    private String applyment_state_msg;
    private List<AuditDetail> audit_detail;


    public String getBusiness_code() {
        return business_code;
    }

    public void setBusiness_code(String business_code) {
        this.business_code = business_code;
    }

    public long getApplyment_id() {
        return applyment_id;
    }

    public void setApplyment_id(long applyment_id) {
        this.applyment_id = applyment_id;
    }

    public String getSub_mchid() {
        return sub_mchid;
    }

    public void setSub_mchid(String sub_mchid) {
        this.sub_mchid = sub_mchid;
    }

    public String getSign_url() {
        return sign_url;
    }

    public void setSign_url(String sign_url) {
        this.sign_url = sign_url;
    }

    public String getApplyment_state() {
        return applyment_state;
    }

    public void setApplyment_state(String applyment_state) {
        this.applyment_state = applyment_state;
    }

    public String getApplyment_state_msg() {
        return applyment_state_msg;
    }

    public void setApplyment_state_msg(String applyment_state_msg) {
        this.applyment_state_msg = applyment_state_msg;
    }

    public List<AuditDetail> getAudit_detail() {
        return audit_detail;
    }

    public void setAudit_detail(List<AuditDetail> audit_detail) {
        this.audit_detail = audit_detail;
    }
}
