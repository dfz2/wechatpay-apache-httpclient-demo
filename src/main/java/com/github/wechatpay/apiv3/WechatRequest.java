package com.github.wechatpay.apiv3;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: FZ.Dong
 * @create: 2020-03-30 11:32
 */

public abstract class WechatRequest<T extends WechatResponse> extends HttpRequest {


    public WechatRequest(String urlSuffix, String method) {
        super(urlSuffix, method);
    }

    public abstract Class<T> getResponseClass();

}
