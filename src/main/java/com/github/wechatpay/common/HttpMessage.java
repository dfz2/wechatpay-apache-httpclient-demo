package com.github.wechatpay.common;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: FZ.Dong
 * @create: 2020-03-30 11:31
 */

public class HttpMessage {

    private String urlSuffix;
    private String method;
    protected Map<String, String> headers = new HashMap<>();
    private Map<String, String> requestParamers = new HashMap<>();

    public HttpMessage(String urlSuffix, String method) {
        this.urlSuffix = urlSuffix;
        this.method = method;
    }

    public String getUrlSuffix() {
        return urlSuffix;
    }

    public void setUrlSuffix(String urlSuffix) {
        this.urlSuffix = urlSuffix;
    }

    protected void putRequestParamers(String key, String value){
        if (value != null) {
            this.requestParamers.put(key, value);
        }
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public Map<String, String> getRequestParamers() {
        return requestParamers;
    }

    public void setRequestParamers(Map<String, String> requestParamers) {
        this.requestParamers = requestParamers;
    }
}
