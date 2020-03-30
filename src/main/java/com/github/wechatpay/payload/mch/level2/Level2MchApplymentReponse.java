package com.github.wechatpay.payload.mch.level2;

import com.github.wechatpay.apiv3.WechatResponse;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: FZ.Dong
 * @create: 2020-03-30 17:17
 */

public class Level2MchApplymentReponse extends WechatResponse {

    private String applyment_id;
    private String out_request_no;


    public String getApplyment_id() {
        return applyment_id;
    }

    public void setApplyment_id(String applyment_id) {
        this.applyment_id = applyment_id;
    }

    public String getOut_request_no() {
        return out_request_no;
    }

    public void setOut_request_no(String out_request_no) {
        this.out_request_no = out_request_no;
    }
}
