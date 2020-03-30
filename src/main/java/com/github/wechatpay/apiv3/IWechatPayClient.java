package com.github.wechatpay.apiv3;

import java.io.Closeable;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: FZ.Dong
 * @create: 2020-03-30 11:16
 */

public interface IWechatPayClient extends Closeable {

    <T extends WechatResponse> T getResponse(WechatRequest<T> request) throws Exception;

}
