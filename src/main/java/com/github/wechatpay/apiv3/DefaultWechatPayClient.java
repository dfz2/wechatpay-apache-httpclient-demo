package com.github.wechatpay.apiv3;

import com.google.gson.Gson;
import com.wechat.pay.contrib.apache.httpclient.Credentials;
import com.wechat.pay.contrib.apache.httpclient.WechatPayHttpClientBuilder;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.Map;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: FZ.Dong
 * @create: 2020-03-30 11:17
 */

public class DefaultWechatPayClient implements IWechatPayClient {

    static final String DOMAIN = "api.mch.weixin.qq.com";

    final IClientProfile profile;
    CloseableHttpClient httpClient;

    public DefaultWechatPayClient(IClientProfile profile) {
        this.profile = profile;
        initialize();
    }

    void initialize() {
        MySigner mySigner = new MyPrivateSigner(profile.getMchSerialNo(), profile.getCertPrivKey());
        Credentials credentials = new MyCredentials(profile.getMchID(), mySigner);
        WechatPayHttpClientBuilder builder =
                WechatPayHttpClientBuilder.create()
                        .withCredentials(credentials)
                        .withWechatpay(profile.getX509Certs());

        httpClient = builder.build();
    }


    @Override
    public <T extends WechatResponse> T getResponse(WechatRequest<T> request) throws Exception {
        HttpUriRequest httpRequest = parseToHttpRequest(request);
        CloseableHttpResponse httpResponse = null;
        T result;
        try {
            httpResponse = httpClient.execute(httpRequest);
            if (httpResponse.getEntity() != null) {
                String jsonContent = EntityUtils.toString(httpResponse.getEntity(), "utf-8");
                result = unmarshal(request.getResponseClass(), jsonContent);
            } else {
                result = request.getResponseClass().newInstance();
            }
            result.setStatus(httpResponse.getStatusLine().getStatusCode());
        } finally {
            IOUtils.closeQuietly(httpResponse);
        }

        return result;
    }

    <T> T unmarshal(Class<T> tClass, String jsonContent) {
        return (new Gson()).fromJson(jsonContent, tClass);
    }



    HttpUriRequest parseToHttpRequest(HttpRequest request) throws Exception {

        RequestBuilder builder = RequestBuilder.create(request.getMethod());
        String url = "https://" + DOMAIN + request.getUrlSuffix();
        builder.setUri(url);
        if (request.getHttpEntity() != null) {
            builder.setEntity(request.getHttpEntity());
        }

        Map<String, String> headers = request.getHeaders();
        builder.addHeader("Accept", "application/json");
        for (String key : headers.keySet()) {
            builder.addHeader(key, headers.get(key));
        }

        if (headers.containsKey("Wechatpay-Media")){
            builder.addHeader("Content-Type", "multipart/form-data");
        } else {
            builder.addHeader("Content-Type", "application/json");
        }

        for (X509Certificate x509Cert : profile.getX509Certs()) {
            builder.addHeader("Wechatpay-Serial", x509Cert.getSerialNumber().toString(16).toUpperCase());
        }
        return builder.build();
    }

    @Override
    public void close() throws IOException {
       IOUtils.closeQuietly(httpClient);
    }

}
