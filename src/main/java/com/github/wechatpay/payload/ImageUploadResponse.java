package com.github.wechatpay.payload;

import com.github.wechatpay.apiv3.WechatResponse;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: FZ.Dong
 * @create: 2020-03-30 12:24
 */

public class ImageUploadResponse extends WechatResponse {

    private String media_id;

    public String getMedia_id() {
        return media_id;
    }

    public void setMedia_id(String media_id) {
        this.media_id = media_id;
    }


    @Override
    public String toString() {
        return "ImageUploadResponse{" +
                "media_id='" + media_id + '\'' +
                '}';
    }
}
