package com.github.wechatpay.apiv3;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: FZ.Dong
 * @create: 2020-03-30 11:31
 */

class HttpMessage {

    private String urlSuffix;
    private String method;
    protected Map<String, String> headers = new HashMap<>();
    private Map<String, Object> requestParamers = new HashMap<>();

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

    protected void putRequestParamers(String key, Object value){
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

    public Map<String, Object> getRequestParamers() {
        return requestParamers;
    }

    public void setRequestParamers(Map<String, Object> requestParamers) {
        this.requestParamers = requestParamers;
    }
}
