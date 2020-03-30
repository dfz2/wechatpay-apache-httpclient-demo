package com.github.wechatpay.common;

import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.List;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: FZ.Dong
 * @create: 2020-03-30 11:39
 */

public interface IClientProfile {
    String getMchID();
    String getMchSerialNo();
    String getAPIV3Key();
    PrivateKey getCertPrivKey();
    List<X509Certificate> getX509Certs();
    String getDomain();
}
