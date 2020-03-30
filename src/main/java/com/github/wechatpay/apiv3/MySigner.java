package com.github.wechatpay.apiv3;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: FZ.Dong
 * @create: 2020-03-29 21:32
 */
public interface MySigner {

    SignatureResult sign(byte[] message);

    class SignatureResult {
        String sign;
        String certificateSerialNumber;

        public SignatureResult(String sign, String serialNumber) {
            this.sign = sign;
            this.certificateSerialNumber = serialNumber;
        }
    }
}
