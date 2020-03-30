package com.github.wechatpay.payload.mch.special;

import com.github.wechatpay.apiv3.WechatRequest;
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: FZ.Dong
 * @create: 2020-03-30 13:14
 */

public class ModifySettleAccRequest extends WechatRequest<ModifySettleAccReponse> {

    private String account_type;
    private String account_bank;
    private String bank_address_code;
    private String bank_name;
    private String bank_branch_id;
    private String account_number;

    public ModifySettleAccRequest(String subMchid) {
        super("/v3/apply4sub/sub_merchants/" + subMchid + "/modify-settlement", "POST");
    }

    @Override
    public Class<ModifySettleAccReponse> getResponseClass() {
        return ModifySettleAccReponse.class;
    }

    @Override
    public HttpEntity getHttpEntity() throws Exception {
        return new StringEntity((new Gson()).toJson(getRequestParamers()), "utf-8");
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
        this.putRequestParamers("account_type", account_type);
    }

    public String getAccount_bank() {
        return account_bank;
    }

    public void setAccount_bank(String account_bank) {
        this.account_bank = account_bank;
        this.putRequestParamers("account_bank", account_bank);
    }

    public String getBank_address_code() {
        return bank_address_code;
    }

    public void setBank_address_code(String bank_address_code) {
        this.bank_address_code = bank_address_code;
        this.putRequestParamers("bank_address_code", bank_address_code);
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
        this.putRequestParamers("bank_name", bank_name);
    }

    public String getBank_branch_id() {
        return bank_branch_id;
    }

    public void setBank_branch_id(String bank_branch_id) {
        this.bank_branch_id = bank_branch_id;
        this.putRequestParamers("bank_branch_id", bank_branch_id);
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
        this.putRequestParamers("account_number", account_number);
    }

}
