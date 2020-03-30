package com.github.wechatpay.apiv3;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: FZ.Dong
 * @create: 2020-03-30 17:48
 */

public class StringUtils {
    private StringUtils(){
        throw new RuntimeException("工具类");
    }

    public static boolean isEmpty(String source){
        if (source == null || source.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}

