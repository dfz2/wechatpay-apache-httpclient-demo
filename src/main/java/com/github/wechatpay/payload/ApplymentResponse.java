package com.github.wechatpay.payload;

import com.github.wechatpay.apiv3.WechatResponse;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:24
 */

public class ApplymentResponse extends WechatResponse {

    private String applyment_id;

    public String getApplyment_id() {
        return applyment_id;
    }

    public void setApplyment_id(String applyment_id) {
        this.applyment_id = applyment_id;
    }
}
