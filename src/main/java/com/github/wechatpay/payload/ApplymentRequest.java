package com.github.wechatpay.payload;

import com.github.wechatpay.apiv3.WechatRequest;
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description: 提交申请单
 * @author: dong
 * @create: 2020-03-17 16:57
 */

public class ApplymentRequest  extends WechatRequest<ApplymentResponse> {

    private String business_code;
    private ContactInfo contact_info;
    private SubjectInfo subject_info;
    private BusinessInfo business_info;
    private SettlementInfo settlement_info;
    private BankAccountInfo bank_account_info;
    private AdditionInfo addition_info;

    public ApplymentRequest() {
        super("/v3/applyment4sub/applyment/", "POST");
    }


    public String getBusiness_code() {
        return business_code;
    }

    public void setBusiness_code(String business_code) {
        this.business_code = business_code;
        this.putRequestParamers("business_code", business_code);
    }

    public ContactInfo getContact_info() {
        return contact_info;
    }

    public void setContact_info(ContactInfo contact_info) {
        this.contact_info = contact_info;
        this.putRequestParamers("contact_info", contact_info);
    }

    public SubjectInfo getSubject_info() {
        return subject_info;
    }

    public void setSubject_info(SubjectInfo subject_info) {
        this.subject_info = subject_info;
        this.putRequestParamers("subject_info", subject_info);
    }

    public BusinessInfo getBusiness_info() {
        return business_info;
    }

    public void setBusiness_info(BusinessInfo business_info) {
        this.business_info = business_info;
        this.putRequestParamers("business_info", business_info);
    }

    public SettlementInfo getSettlement_info() {
        return settlement_info;
    }

    public void setSettlement_info(SettlementInfo settlement_info) {
        this.settlement_info = settlement_info;
        this.putRequestParamers("settlement_info", settlement_info);
    }

    public BankAccountInfo getBank_account_info() {
        return bank_account_info;
    }

    public void setBank_account_info(BankAccountInfo bank_account_info) {
        this.bank_account_info = bank_account_info;
        this.putRequestParamers("bank_account_info", bank_account_info);
    }

    public AdditionInfo getAddition_info() {
        return addition_info;
    }

    public void setAddition_info(AdditionInfo addition_info) {
        this.addition_info = addition_info;
        this.putRequestParamers("addition_info", addition_info);
    }

    @Override
    public Class<ApplymentResponse> getResponseClass() {
        return ApplymentResponse.class;
    }

    @Override
    public HttpEntity getHttpEntity() throws Exception {
        return new StringEntity((new Gson()).toJson(getRequestParamers()), "utf-8");
    }
}
