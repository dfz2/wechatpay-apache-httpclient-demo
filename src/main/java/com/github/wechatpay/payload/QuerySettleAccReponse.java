package com.github.wechatpay.payload;

import com.github.wechatpay.apiv3.WechatResponse;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: FZ.Dong
 * @create: 2020-03-30 16:27
 */

public class QuerySettleAccReponse extends WechatResponse {

    private String account_type;
    private String account_bank;
    private String bank_address_code;
    private String bank_name;
    private String bank_branch_id;
    private String account_number;
    private String verify_result;

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public String getAccount_bank() {
        return account_bank;
    }

    public void setAccount_bank(String account_bank) {
        this.account_bank = account_bank;
    }

    public String getBank_address_code() {
        return bank_address_code;
    }

    public void setBank_address_code(String bank_address_code) {
        this.bank_address_code = bank_address_code;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getBank_branch_id() {
        return bank_branch_id;
    }

    public void setBank_branch_id(String bank_branch_id) {
        this.bank_branch_id = bank_branch_id;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getVerify_result() {
        return verify_result;
    }

    public void setVerify_result(String verify_result) {
        this.verify_result = verify_result;
    }
}
