package com.github.wechatpay;

import com.github.wechatpay.common.*;
import com.github.wechatpay.payload.ImageUploadRequest;
import com.github.wechatpay.payload.ImageUploadResponse;
import com.google.gson.Gson;
import com.wechat.pay.contrib.apache.httpclient.Credentials;
import com.wechat.pay.contrib.apache.httpclient.WechatPayHttpClientBuilder;
import com.wechat.pay.contrib.apache.httpclient.util.PemUtil;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WechatpayApacheHttpclientDemoApplicationTests {

    String path = "apiclient_key.pem";
    private String merchantId ="";
    private String merchantSerialNumber="";
    private PrivateKey merchantPrivateKey;


    class DefatultClientProfile implements IClientProfile {

        @Override
        public String getMchID() {
            return merchantId;
        }

        @Override
        public String getMchSerialNo() {
            return merchantSerialNumber;
        }

        @Override
        public String getAPIV3Key() {
            return null;
        }

        @Override
        public PrivateKey getCertPrivKey() {
            try {
                return PemUtil.loadPrivateKey(new FileInputStream(new File(path)));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        public List<X509Certificate> getX509Certs() {
            List<X509Certificate> wechatpayCertificates = new ArrayList<>();
            File dir = new File(System.getProperty("java.io.tmpdir") + File.separator + "wechatpay");
            File[] files = dir.listFiles();
            if (files != null) {
                X509Certificate x509Certificate;
                for (File file : files) {
                    try {
                        x509Certificate = PemUtil.loadCertificate(new FileInputStream(file));
                        x509Certificate.checkValidity();
                    } catch (Exception ex) {
                        continue;
                    }
                    wechatpayCertificates.add(x509Certificate);
                }
            }
            return wechatpayCertificates;
        }

        @Override
        public String getDomain() {
            return null;
        }
    }


    @Test
    public void testUpload() throws Exception {
        File file = new File("C:\\123.jpg");
        IClientProfile profile = new DefatultClientProfile();
        IWechatPayClient client = new DefaultWechatPayClient(profile);
        ImageUploadRequest request = new ImageUploadRequest();
        request.setFile(file);
        ImageUploadResponse response = client.getResponse(request);
        System.out.println((new Gson()).toJson(response));
        /**
         * {"media_id":"fcufzRLdcT_gR7ARa7PWx_NWk85XwzgkU2v9WLdl44YOj4wnywoPRUTL7Qg9img86dyeLiJkG1g12Dgoksm_DVoha9r900NggCp_PXyhywc","status":200,"urlSuffix":"","method":"","headers":{}}
         */
    }

}
