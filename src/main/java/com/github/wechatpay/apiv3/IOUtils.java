package com.github.wechatpay.apiv3;

import java.io.Closeable;
import java.io.IOException;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: FZ.Dong
 * @create: 2020-03-30 12:09
 */

public class IOUtils {
    private IOUtils(){
        throw new RuntimeException("工具类");
    }

    public static void closeQuietly(Closeable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (IOException ioe) {
            // ignore
        }
    }
}
