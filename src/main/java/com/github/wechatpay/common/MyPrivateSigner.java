package com.github.wechatpay.common;

import java.security.*;
import java.util.Base64;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: FZ.Dong
 * @create: 2020-03-29 21:35
 */

public class MyPrivateSigner implements MySigner {
    private String certificateSerialNumber;
    private PrivateKey privateKey;

    public MyPrivateSigner(String serialNumber, PrivateKey privateKey) {
        this.certificateSerialNumber = serialNumber;
        this.privateKey = privateKey;
    }

    @Override
    public SignatureResult sign(byte[] message) {
        try {
            Signature sign = Signature.getInstance("SHA256withRSA");
            sign.initSign(privateKey);
            sign.update(message);

            return new SignatureResult(
                    Base64.getEncoder().encodeToString(sign.sign()), certificateSerialNumber);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("当前Java环境不支持SHA256withRSA", e);
        } catch (SignatureException e) {
            throw new RuntimeException("签名计算失败", e);
        } catch (InvalidKeyException e) {
            throw new RuntimeException("无效的私钥", e);
        }
    }
}
