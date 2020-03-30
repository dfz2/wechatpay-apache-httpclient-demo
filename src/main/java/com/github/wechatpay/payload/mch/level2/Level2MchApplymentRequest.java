package com.github.wechatpay.payload.mch.level2;

import com.github.wechatpay.apiv3.WechatRequest;
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: FZ.Dong
 * @create: 2020-03-30 17:13
 */

public class Level2MchApplymentRequest extends WechatRequest<Level2MchApplymentReponse> {

    private String organization_type;
    private BusinessLicenseInfoDTO business_license_info;
    private OrganizationCertInfoDTO organization_cert_info;
    private IdCardInfoDTO id_card_info;
    private boolean need_account_info;
    private AccountInfoDTO account_info;
    private ContactInfoDTO contact_info;
    private SalesSceneInfoDTO sales_scene_info;
    private String merchant_shortname;
    private String out_request_no;
    private String qualifications;
    private String business_addition_pics;
    private String business_addition_desc;

    public Level2MchApplymentRequest() {
        super("/v3/ecommerce/applyments/", "POST");
    }

    public String getOrganization_type() {
        return organization_type;
    }

    public void setOrganization_type(String organization_type) {
        this.organization_type = organization_type;
        this.putRequestParamers("organization_type", organization_type);
    }

    public BusinessLicenseInfoDTO getBusiness_license_info() {
        return business_license_info;
    }

    public void setBusiness_license_info(BusinessLicenseInfoDTO business_license_info) {
        this.business_license_info = business_license_info;
        this.putRequestParamers("business_license_info", business_license_info);
    }

    public OrganizationCertInfoDTO getOrganization_cert_info() {
        return organization_cert_info;
    }

    public void setOrganization_cert_info(OrganizationCertInfoDTO organization_cert_info) {
        this.organization_cert_info = organization_cert_info;
        this.putRequestParamers("organization_cert_info", organization_cert_info);
    }

    public IdCardInfoDTO getId_card_info() {
        return id_card_info;
    }

    public void setId_card_info(IdCardInfoDTO id_card_info) {
        this.id_card_info = id_card_info;
        this.putRequestParamers("id_card_info", id_card_info);
    }

    public AccountInfoDTO getAccount_info() {
        return account_info;
    }

    public void setAccount_info(AccountInfoDTO account_info) {
        this.account_info = account_info;
        this.putRequestParamers("account_info", account_info);
    }

    public ContactInfoDTO getContact_info() {
        return contact_info;
    }

    public void setContact_info(ContactInfoDTO contact_info) {
        this.contact_info = contact_info;
        this.putRequestParamers("contact_info", contact_info);
    }

    public SalesSceneInfoDTO getSales_scene_info() {
        return sales_scene_info;
    }

    public void setSales_scene_info(SalesSceneInfoDTO sales_scene_info) {
        this.sales_scene_info = sales_scene_info;
        this.putRequestParamers("sales_scene_info", sales_scene_info);
    }

    public boolean isNeed_account_info() {
        return need_account_info;
    }

    public void setNeed_account_info(boolean need_account_info) {
        this.need_account_info = need_account_info;
        this.putRequestParamers("need_account_info", need_account_info);
    }


    public String getMerchant_shortname() {
        return merchant_shortname;
    }

    public void setMerchant_shortname(String merchant_shortname) {
        this.merchant_shortname = merchant_shortname;
        this.putRequestParamers("merchant_shortname", merchant_shortname);
    }

    public String getOut_request_no() {
        return out_request_no;
    }

    public void setOut_request_no(String out_request_no) {
        this.out_request_no = out_request_no;
        this.putRequestParamers("out_request_no", out_request_no);
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
        this.putRequestParamers("qualifications", qualifications);
    }

    public String getBusiness_addition_pics() {
        return business_addition_pics;
    }

    public void setBusiness_addition_pics(String business_addition_pics) {
        this.business_addition_pics = business_addition_pics;
        this.putRequestParamers("business_addition_pics", business_addition_pics);
    }

    public String getBusiness_addition_desc() {
        return business_addition_desc;
    }

    public void setBusiness_addition_desc(String business_addition_desc) {
        this.business_addition_desc = business_addition_desc;
        this.putRequestParamers("business_addition_desc", business_addition_desc);
    }

    @Override
    public Class<Level2MchApplymentReponse> getResponseClass() {
        return Level2MchApplymentReponse.class;
    }

    @Override
    public HttpEntity getHttpEntity() throws Exception {
        return new StringEntity((new Gson()).toJson(getRequestParamers()), "utf-8");
    }

    public static class BusinessLicenseInfoDTO {

        private String business_license_type;
        private String business_license_copy;
        private String business_license_number;
        private String merchant_name;
        private String legal_person;

        public String getBusiness_license_type() {
            return business_license_type;
        }

        public void setBusiness_license_type(String business_license_type) {
            this.business_license_type = business_license_type;
        }

        public String getBusiness_license_copy() {
            return business_license_copy;
        }

        public void setBusiness_license_copy(String business_license_copy) {
            this.business_license_copy = business_license_copy;
        }

        public String getBusiness_license_number() {
            return business_license_number;
        }

        public void setBusiness_license_number(String business_license_number) {
            this.business_license_number = business_license_number;
        }

        public String getMerchant_name() {
            return merchant_name;
        }

        public void setMerchant_name(String merchant_name) {
            this.merchant_name = merchant_name;
        }

        public String getLegal_person() {
            return legal_person;
        }

        public void setLegal_person(String legal_person) {
            this.legal_person = legal_person;
        }
    }

    public static class OrganizationCertInfoDTO {

        private String organization_copy;
        private String organization_time;
        private String organization_number;

        public String getOrganization_copy() {
            return organization_copy;
        }

        public void setOrganization_copy(String organization_copy) {
            this.organization_copy = organization_copy;
        }

        public String getOrganization_time() {
            return organization_time;
        }

        public void setOrganization_time(String organization_time) {
            this.organization_time = organization_time;
        }

        public String getOrganization_number() {
            return organization_number;
        }

        public void setOrganization_number(String organization_number) {
            this.organization_number = organization_number;
        }
    }

    public static class IdCardInfoDTO {


        private String id_card_copy;
        private String id_card_national;
        private String id_card_name;
        private String id_card_number;
        private String id_card_valid_time;

        public String getId_card_copy() {
            return id_card_copy;
        }

        public void setId_card_copy(String id_card_copy) {
            this.id_card_copy = id_card_copy;
        }

        public String getId_card_national() {
            return id_card_national;
        }

        public void setId_card_national(String id_card_national) {
            this.id_card_national = id_card_national;
        }

        public String getId_card_name() {
            return id_card_name;
        }

        public void setId_card_name(String id_card_name) {
            this.id_card_name = id_card_name;
        }

        public String getId_card_number() {
            return id_card_number;
        }

        public void setId_card_number(String id_card_number) {
            this.id_card_number = id_card_number;
        }

        public String getId_card_valid_time() {
            return id_card_valid_time;
        }

        public void setId_card_valid_time(String id_card_valid_time) {
            this.id_card_valid_time = id_card_valid_time;
        }
    }

    public static class AccountInfoDTO {


        private String bank_account_type;
        private String account_name;
        private String account_bank;
        private String bank_address_code;
        private String bank_branch_id;
        private String bank_name;
        private String account_number;

        public String getBank_account_type() {
            return bank_account_type;
        }

        public void setBank_account_type(String bank_account_type) {
            this.bank_account_type = bank_account_type;
        }

        public String getAccount_name() {
            return account_name;
        }

        public void setAccount_name(String account_name) {
            this.account_name = account_name;
        }

        public String getAccount_bank() {
            return account_bank;
        }

        public void setAccount_bank(String account_bank) {
            this.account_bank = account_bank;
        }

        public String getBank_address_code() {
            return bank_address_code;
        }

        public void setBank_address_code(String bank_address_code) {
            this.bank_address_code = bank_address_code;
        }

        public String getBank_branch_id() {
            return bank_branch_id;
        }

        public void setBank_branch_id(String bank_branch_id) {
            this.bank_branch_id = bank_branch_id;
        }

        public String getBank_name() {
            return bank_name;
        }

        public void setBank_name(String bank_name) {
            this.bank_name = bank_name;
        }

        public String getAccount_number() {
            return account_number;
        }

        public void setAccount_number(String account_number) {
            this.account_number = account_number;
        }
    }

    public static class ContactInfoDTO {


        private String contact_type;
        private String contact_name;
        private String contact_id_card_number;
        private String mobile_phone;
        private String contact_email;

        public String getContact_type() {
            return contact_type;
        }

        public void setContact_type(String contact_type) {
            this.contact_type = contact_type;
        }

        public String getContact_name() {
            return contact_name;
        }

        public void setContact_name(String contact_name) {
            this.contact_name = contact_name;
        }

        public String getContact_id_card_number() {
            return contact_id_card_number;
        }

        public void setContact_id_card_number(String contact_id_card_number) {
            this.contact_id_card_number = contact_id_card_number;
        }

        public String getMobile_phone() {
            return mobile_phone;
        }

        public void setMobile_phone(String mobile_phone) {
            this.mobile_phone = mobile_phone;
        }

        public String getContact_email() {
            return contact_email;
        }

        public void setContact_email(String contact_email) {
            this.contact_email = contact_email;
        }
    }

    public static class SalesSceneInfoDTO {

        private String store_name;
        private String store_url;
        private String store_qr_code;

        public String getStore_name() {
            return store_name;
        }

        public void setStore_name(String store_name) {
            this.store_name = store_name;
        }

        public String getStore_url() {
            return store_url;
        }

        public void setStore_url(String store_url) {
            this.store_url = store_url;
        }

        public String getStore_qr_code() {
            return store_qr_code;
        }

        public void setStore_qr_code(String store_qr_code) {
            this.store_qr_code = store_qr_code;
        }
    }
}
