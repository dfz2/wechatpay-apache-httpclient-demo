package com.github.wechatpay;

import com.github.wechatpay.apiv3.DefaultWechatPayClient;
import com.github.wechatpay.apiv3.IClientProfile;
import com.github.wechatpay.apiv3.IWechatPayClient;
import com.github.wechatpay.apiv3.RSAUtils;
import com.github.wechatpay.payload.ImageUploadRequest;
import com.github.wechatpay.payload.ImageUploadResponse;
import com.github.wechatpay.payload.mch.level2.Level2MchApplymentReponse;
import com.github.wechatpay.payload.mch.level2.Level2MchApplymentRequest;
import com.github.wechatpay.payload.mch.special.ModifySettleAccReponse;
import com.github.wechatpay.payload.mch.special.ModifySettleAccRequest;
import com.github.wechatpay.payload.mch.special.SpecialMchApplymentRequest;
import com.github.wechatpay.payload.mch.special.SpecialMchApplymentResponse;
import com.google.gson.Gson;
import com.wechat.pay.contrib.apache.httpclient.util.PemUtil;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

import static com.github.wechatpay.payload.mch.special.SpecialMchApplymentRequest.ContactInfoDTO;

public class WechatApiv3Tests {

    String path = "C:\\apiclient_key.pem";
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



    @Test
    public void testModifySettleAcc() throws Exception {
        IClientProfile profile = new DefatultClientProfile();
        IWechatPayClient client = new DefaultWechatPayClient(profile);
        ModifySettleAccRequest request = new ModifySettleAccRequest("1511101111");
        request.setAccount_type("ACCOUNT_TYPE_PRIVATE");
        request.setBank_address_code("110000");
        request.setAccount_bank("工商银行");
        request.setBank_name("施秉县农村信用合作联社城关信用社");
        request.setBank_branch_id("402713354941");

        for (X509Certificate x509Cert : profile.getX509Certs()) {
            request.setAccount_number(RSAUtils.rsaEncryptOAEP("1231431", x509Cert));
        }

        ModifySettleAccReponse response = client.getResponse(request);
        System.out.println((new Gson()).toJson(response));

        /**
         * {"code":"NO_AUTH","message":"该商户不是本服务商进件的子商户，无权限操作","status":403,"urlSuffix":"","method":"","headers":{},"requestParamers":{}}
         */
    }




    @Test
    public void testMchL2Applyment() throws Exception {
        IClientProfile profile = new DefatultClientProfile();
        IWechatPayClient client = new DefaultWechatPayClient(profile);
        Level2MchApplymentRequest request = new Level2MchApplymentRequest();
        request.setOrganization_type("2401");
        request.setNeed_account_info(true);
        Level2MchApplymentRequest.OrganizationCertInfoDTO organization_cert_info = new Level2MchApplymentRequest.OrganizationCertInfoDTO();
        organization_cert_info.setOrganization_number("13132323231");
        request.setOrganization_cert_info(organization_cert_info);

        Level2MchApplymentReponse response = client.getResponse(request);
        System.out.println((new Gson()).toJson(response));

    }



    @Test
    public void testSpecialMchApplyment() throws Exception {
        IClientProfile profile = new DefatultClientProfile();
        IWechatPayClient client = new DefaultWechatPayClient(profile);
        SpecialMchApplymentRequest request = new SpecialMchApplymentRequest();
        request.setBusiness_code("APPLYMENT_00000000001");
        ContactInfoDTO  contactInfoDTO= new ContactInfoDTO();
        contactInfoDTO.setContact_email("test@YEA.NET");
        request.setContact_info(contactInfoDTO);

        SpecialMchApplymentResponse response = client.getResponse(request);
        System.out.println((new Gson()).toJson(response));

    }
}
