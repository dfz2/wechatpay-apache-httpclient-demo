package com.github.wechatpay.common;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: FZ.Dong
 * @create: 2020-03-30 11:33
 */

public class WechatResponse extends HttpResponse {

    private String code;
    private String message;

    public WechatResponse() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return "WechatResponse{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
