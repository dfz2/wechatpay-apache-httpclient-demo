package com.github.wechatpay.payload.mch.special;

import com.github.wechatpay.apiv3.WechatRequest;
import com.google.gson.Gson;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;

import java.util.List;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: FZ.Dong
 * @create: 2020-03-30 17:32
 */

public class SpecialMchApplymentRequest extends WechatRequest<SpecialMchApplymentResponse> {

    /**
     * business_code : 1900013511_10000
     * contact_info : {"contact_name":"pVd1HJ6zyvPedzGaV+X3qtmrq9bb9tPROvwia4ibL+F6mfjbzQIzfb3HHLEjZ4YiR/cJiCrZxnAqi+pjeKIEdkwzXRAI7FUhrfPK3SNjaBTEu9Gmsu \tgMIA9r3x887Q+ODuC8HH2nzAn7NGpE/e3yiHgWhk0ps5k5DP/2qIdGdONoDzZelrxCl/NWWNUyB93K9F+jC1JX2IMttdY+aQ6zBlw0xnOiNW6Hzy7UtC+xriudjD5APomty \t7/mYNxLMpRSvWKIjOv/69bDnuC4EL5Kz4jBHLiCyOb+tI0m2qhZ9evAM+Jv1z0NVa8MRtelw/wDa4SzfeespQO/0kjiwfqdfg==","contact_id_number":"pVd1HJ6zyvPedzGaV+X3qtmrq9bb9tPROvwia4ibL+F6mfjbzQIzfb3HHLEjZ4YiR/cJiCrZxnAqi+pjeKIEdkwzXRAI7FUhrfPK3SNjaBTEu \t9GmsugMIA9r3x887Q+ODuC8HH2nzAn7NGpE/e3yiHgWhk0ps5k5DP/2qIdGdONoDzZelrxCl/NWWNUyB93K9F+jC1JX2IMttdY+aQ6zBlw0xnOiNW6Hzy7UtC+xriudjD5A \tPomty7/mYNxLMpRSvWKIjOv/69bDnuC4EL5Kz4jBHLiCyOb+tI0m2qhZ9evAM+Jv1z0NVa8MRtelw/wDa4SzfeespQO/0kjiwfqdfg==","openid":"pVd1HJ6zyvPedzGaV+X3qtmrq9bb9tPROvwia4ibL+F6mfjbzQIzfb3HHLEjZ4YiR/cJiCrZxnAqi+pjeKIEdkwzXRAI7FUhrfPK3SNjaBTEu9GmsugMIA9r \t3x887Q+ODuC8HH2nzAn7NGpE/e3yiHgWhk0ps5k5DP/2qIdGdONoDzZelrxCl/NWWNUyB93K9F+jC1JX2IMttdY+aQ6zBlw0xnOiNW6Hzy7UtC+xriudjD5APomty7/mYN \txLMpRSvWKIjOv/69bDnuC4EL5Kz4jBHLiCyOb+tI0m2qhZ9evAM+Jv1z0NVa8MRtelw/wDa4SzfeespQO/0kjiwfqdfg== 字段加密: 使用APIv3定义的方式加密","mobile_phone":"pVd1HJ6zyvPedzGaV+X3qtmrq9bb9tPROvwia4ibL+F6mfjbzQIzfb3HHLEjZ4YiR/cJiCrZxnAqi+pjeKIEdkwzXRAI7FUhrfPK3SNjaBTEu9Gms \tugMIA9r3x887Q+ODuC8HH2nzAn7NGpE/e3yiHgWhk0ps5k5DP/2qIdGdONoDzZelrxCl/NWWNUyB93K9F+jC1JX2IMttdY+aQ6zBlw0xnOiNW6Hzy7UtC+xriudjD5APo \tmty7/mYNxLMpRSvWKIjOv/69bDnuC4EL5Kz4jBHLiCyOb+tI0m2qhZ9evAM+Jv1z0NVa8MRtelw/wDa4SzfeespQO/0kjiwfqdfg==","contact_email":"pVd1HJ6zyvPedzGaV+X3qtmrq9bb9tPROvwia4ibL+F6mfjbzQIzfb3HHLEjZ4YiR/cJiCrZxnAqi+pjeKIEdkwzXRAI7FUhrfPK3SNjaBTEu9G \tmsugMIA9r3x887Q+ODuC8HH2nzAn7NGpE/e3yiHgWhk0ps5k5DP/2qIdGdONoDzZelrxCl/NWWNUyB93K9F+jC1JX2IMttdY+aQ6zBlw0xnOiNW6Hzy7UtC+xriudjD5 \tAPomty7/mYNxLMpRSvWKIjOv/69bDnuC4EL5Kz4jBHLiCyOb+tI0m2qhZ9evAM+Jv1z0NVa8MRtelw/wDa4SzfeespQO/0kjiwfqdfg=="}
     * subject_info : {"subject_type":"SUBJECT_TYPE_ENTERPRISE","business_license_info":{"license_copy":"47ZC6GC-vnrbEny__Ie_An5-tCpqxucuxi-vByf3Gjm7KE53JXvGy9tqZm2XAUf-4KGprrKhpVBDIUv0OF4wFNIO4kqg05InE4d2I6_H7I4","license_number":"123456789012345678","merchant_name":"腾讯科技有限公司","legal_person":"张三"},"certificate_info":{"cert_copy":"0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo","cert_type":"CERTIFICATE_TYPE_2388","cert_number":"111111111111","merchant_name":"xx公益团体","company_address":"广东省深圳市南山区xx路xx号","legal_person":"李四","period_begin":"2019-08-01","period_end":"2019-08-01"},"organization_info":{"organization_copy":"47ZC6GC-vnrbEny__Ie_An5-tCpqxucuxi-vByf3Gjm7KE53JXvGy9tqZm2XAUf-4KGprrKhpVBDIUv0OF4wFNIO4kqg05InE4d2I6_H7I4","organization_code":"123456789-A","org_period_begin":"2019-08-01","org_period_end":"2019-08-01长期"},"certificate_letter_copy":"47ZC6GC-vnrbEny__Ie_An5-tCpqxucuxi-vByf3Gjm7KE53JXvGy9tqZm2XAUf-4KGprrKhpVBDIUv0OF4wFNIO4kqg05InE4d2I6_H7I4","micro_biz_info":{"micro_biz_type":"MICRO_TYPE_STORE","micro_store_info":{"micro_name":"大郎烧饼","micro_address_code":"440305","micro_address":"南山区xx大厦x层xxxx室","store_entrance_pic":"0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo","micro_indoor_copy":"0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo","store_longitude":"113.941355","store_latitude":"22.546245","address_certification":"0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo"},"micro_mobile_info":{"micro_mobile_name":"早餐车","micro_mobile_city":"440305","micro_mobile_address":"无","micro_mobile_pics":["0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo"]},"micro_online_info":{"micro_online_store":"李三服装店","micro_ec_name":"XX购物平台","micro_qrcode":"https://www.qq.com","micro_link":"https://www.qq.com"}},"identity_info":{"id_doc_type":"IDENTIFICATION_TYPE_IDCARD","id_card_info":{"id_card_copy":"jTpGmxUX3FBWVQ5NJTZvlKX_gdU4cRz7z5NxpnFuAxhBTEO_PvWkfSCJ3zVIn001D8daLC-ehEuo0BJqRTvDujqhThn4ReFxikqJ5YW6zFQ","id_card_national":"47ZC6GC-vnrbEny__Ie_An5-tCpqxucuxi-vByf3Gjm7KE53JXvGy9tqZm2XAUf-4KGprrKhpVBDIUv0OF4wFNIO4kqg05InE4d2I6_H7I4","id_card_name":"pVd1HJ6zyvPedzGaV+X3qtmrq9bb9tPROvwia4ibL+F6mfjbzQIzfb3HHLEjZ4YiR/cJiCrZxnAqi+pjeKIEdkwzXRAI7FUhrfPK3SNjaBTEu9G \t\tmsugMIA9r3x887Q+ODuC8HH2nzAn7NGpE/e3yiHgWhk0ps5k5DP/2qIdGdONoDzZelrxCl/NWWNUyB93K9F+jC1JX2IMttdY+aQ6zBlw0xnOiNW6Hzy7UtC+xriudjD5 \t\tAPomty7/mYNxLMpRSvWKIjOv/69bDnuC4EL5Kz4jBHLiCyOb+tI0m2qhZ9evAM+Jv1z0NVa8MRtelw/wDa4SzfeespQO/0kjiwfqdfg==","id_card_number":"AOZdYGISxo4y44/UgZ69bdu9X+tfMUJ9dl+LetjM45/zMbrYu+wWZ8gn4CTdo+D/m9MrPg+V4sm73oxqdQu/hj7aWyDl4GQtPXVdaztB9jVb \t\tVZh3QFzV+BEmytMNQp9dt1uWJktlfdDdLR3AMWyMB377xd+m9bSr/ioDTzagEcGe+vLYiKrzcroQv3OR0p3ppFYoQ3IfYeU/04S4t9rNFL+kyblK2FCCqQ11NdbbHoC \t\trJc7NV4oASq6ZFonjTtgjjgKsadIKHXtb3JZKGZjduGdtkRJJp0/0eow96uY1Pk7Rq79Jtt7+I8juwEc4P4TG5xzchG/5IL9DBd+Z0zZXkw==","card_period_begin":"2026-06-06","card_period_end":"2026-06-06"},"id_doc_info":{"id_doc_copy":"jTpGmxUX3FBWVQ5NJTZvlKX_gdU4cRz7z5NxpnFuAxhBTEO_PvWkfSCJ3zVIn001D8daLC-ehEuo0BJqRTvDujqhThn4ReFxikqJ5YW6zFQ","id_doc_name":"pVd1HJ6zyvPedzGaV+X3qtmrq9bb9tPROvwia4ibL+F6mfjbzQIzfb3HHLEjZ4YiR/cJiCrZxnAqi+pjeKIEdkwzXRAI7FUhrfPK3SNjaBTE \t\tu9GmsugMIA9r3x887Q+ODuC8HH2nzAn7NGpE/e3yiHgWhk0ps5k5DP/2qIdGdONoDzZelrxCl/NWWNUyB93K9F+jC1JX2IMttdY+aQ6zBlw0xnOiNW6Hzy7UtC+ \t\txriudjD5APomty7/mYNxLMpRSvWKIjOv/69bDnuC4EL5Kz4jBHLiCyOb+tI0m2qhZ9evAM+Jv1z0NVa8MRtelw/wDa4SzfeespQO/0kjiwfqdfg==","id_doc_number":"AOZdYGISxo4y44/UgZ69bdu9X+tfMUJ9dl+LetjM45/zMbrYu+wWZ8gn4CTdo+D/m9MrPg+V4sm73oxqdQu/hj7aWyDl4GQtPXVdaztB9j \t\tVbVZh3QFzV+BEmytMNQp9dt1uWJktlfdDdLR3AMWyMB377xd+m9bSr/ioDTzagEcGe+vLYiKrzcroQv3OR0p3ppFYoQ3IfYeU/04S4t9rNFL+kyblK2FCCqQ11Nd \t\tbbHoCrJc7NV4oASq6ZFonjTtgjjgKsadIKHXtb3JZKGZjduGdtkRJJp0/0eow96uY1Pk7Rq79Jtt7+I8juwEc4P4TG5xzchG/5IL9DBd+Z0zZXkw==","doc_period_begin":"2019-06-06","doc_period_end":"2026-06-06"},"owner":"true"},"ubo_info":{"id_type":"IDENTIFICATION_TYPE_IDCARD","id_card_copy":"jTpGmxUX3FBWVQ5NJTZvlKX_gdU4cRz7z5NxpnFuAxhBTEO_PvWkfSCJ3zVIn001D8daLC-ehEuo0BJqRTvDujqhThn4ReFxikqJ5YW6zFQ","id_card_national":"jTpGmxUX3FBWVQ5NJTZvlKX_gdU4cRz7z5NxpnFuAxhBTEO_PvWkfSCJ3zVIn001D8daLC-ehEuo0BJqRTvDujqhThn4ReFxikqJ5YW6zFQ","id_doc_copy":"jTpGmxUX3FBWVQ5NJTZvlKX_gdU4cRz7z5NxpnFuAxhBTEO_PvWkfSCJ3zVIn001D8daLC-ehEuo0BJqRTvDujqhThn4ReFxikqJ5YW6zFQ","name":"李四","id_number":"AOZdYGISxo4y44/UgZ69bdu9X+tfMUJ9dl+LetjM45/zMbrYu+wWZ8gn4CTdo+D/m9MrPg+V4sm73oxqdQu/hj7aWyDl4GQtPXVdaztB9jVbVZh3 \t  QFzV+BEmytMNQp9dt1uWJktlfdDdLR3AMWyMB377xd+m9bSr/ioDTzagEcGe+vLYiKrzcroQv3OR0p3ppFYoQ3IfYeU/04S4t9rNFL+kyblK2FCCqQ11NdbbHoCrJc \t  7NV4oASq6ZFonjTtgjjgKsadIKHXtb3JZKGZjduGdtkRJJp0/0eow96uY1Pk7Rq79Jtt7+I8juwEc4P4TG5xzchG/5IL9DBd+Z0zZXkw==","id_period_begin":"2019-06-06","id_period_end":"2026-06-06"}}
     * business_info : {"merchant_shortname":"张三餐饮店","service_phone":"0758XXXXX","sales_info":{"sales_scenes_type":["string "],"biz_store_info":{"biz_store_name":"大郎烧饼","biz_address_code":"440305","biz_store_address":"南山区xx大厦x层xxxx室","store_entrance_pic":["0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo"],"indoor_pic":["0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo"],"biz_sub_appid":"wx1234567890123456"},"mp_info":{"mp_appid":"wx1234567890123456","mp_sub_appid":"wx1234567890123456","mp_pics":["string "]},"mini_program_info":{"mini_program_appid":"wx1234567890123456","mini_program_sub_appid":"wx1234567890123456","mini_program_pics":["string "]},"app_info":{"app_appid":"wx1234567890123456","app_sub_appid":"wx1234567890123456","app_pics":["string "]},"web_info":{"domain":"http://www.qq.com","web_authorisation":"47ZC6GC-vnrbEny__Ie_An5-tCpqxucuxi-vByf3Gjm7KE53JXvGy9tqZm2XAUf-4KGprrKhpVBDIUv0OF4wFNIO4kqg05InE4d2I6_H7I4","web_appid":"wx1234567890123456"},"wework_info":{"corp_id":"wx1234567890123456","sub_corp_id":"wx1234567890123456","wework_pics":["string "]}}}
     * settlement_info : {"settlement_id":"719","qualification_type":"餐饮","qualifications":["string "],"activities_id":"716","activities_rate":"0.6","activities_additions":["string "]}
     * bank_account_info : {"bank_account_type":"BANK_ACCOUNT_TYPE_CORPORATE","account_name":"AOZdYGISxo4y44/UgZ69bdu9X+tfMUJ9dl+LetjM45/zMbrYu+wWZ8gn4CTdo+D/m9MrPg+V4sm73oxqdQu/hj7aWyDl4GQtPXVdaztB9jV \tbVZh3QFzV+BEmytMNQp9dt1uWJktlfdDdLR3AMWyMB377xd+m9bSr/ioDTzagEcGe+vLYiKrzcroQv3OR0p3ppFYoQ3IfYeU/04S4t9rNFL+kyblK2FCCqQ11Ndb \tbHoCrJc7NV4oASq6ZFonjTtgjjgKsadIKHXtb3JZKGZjduGdtkRJJp0/0eow96uY1Pk7Rq79Jtt7+I8juwEc4P4TG5xzchG/5IL9DBd+Z0zZXkw==","account_bank":"工商银行","bank_address_code":"110000","bank_branch_id":"402713354941","bank_name":"施秉县农村信用合作联社城关信用社","account_number":"d+xT+MQCvrLHUVDWv/8MR/dB7TkXM2YYZlokmXzFsWs35NXUot7C0NcxIrUF5FnxqCJHkNgKtxa6RxEYyba1+VBRLnqKG2fSy/Y5qDN08 \tEj9zHCwJjq52Wg1VG8MRugli9YMI1fI83KGBxhuXyemgS/hqFKsfYGiOkJqjTUpgY5VqjtL2N4l4z11T0ECB/aSyVXUysOFGLVfSrUxMPZy6jWWYGvT1+4P633f+ \tR+ki1gT4WF/2KxZOYmli385ZgVhcR30mr4/G3HBcxi13zp7FnEeOsLlvBmI1PHN4C7Rsu3WL8sPndjXTd75kPkyjqnoMRrEEaYQE8ZRGYoeorwC+w=="}
     * addition_info : {"legal_person_commitment":"47ZC6GC-vnrbEny__Ie_An5-tCpqxucuxi-vByf3Gjm7KE53JXvGy9tqZm2XAUf-4KGprrKhpVBDIUv0OF4wFNIO4kqg05InE4d2I6_H7I4","legal_person_video":"47ZC6GC-vnrbEny__Ie_An5-tCpqxucuxi-vByf3Gjm7KE53JXvGy9tqZm2XAUf-4KGprrKhpVBDIUv0OF4wFNIO4kqg05InE4d2I6_H7I4","business_addition_pics":["string "],"business_addition_msg":"特殊情况，说明原因"}
     */

    private String business_code;
    private ContactInfoDTO contact_info;
    private SubjectInfoDTO subject_info;
    private BusinessInfoDTO business_info;
    private SettlementInfoDTO settlement_info;
    private BankAccountInfoDTO bank_account_info;
    private AdditionInfoDTO addition_info;

    public SpecialMchApplymentRequest() {
        super("/v3/applyment4sub/applyment/", "POST");
    }

    public String getBusiness_code() {
        return business_code;
    }

    public void setBusiness_code(String business_code) {
        this.business_code = business_code;
        this.putRequestParamers("business_code", business_code);
    }

    public ContactInfoDTO getContact_info() {
        return contact_info;
    }

    public void setContact_info(ContactInfoDTO contact_info) {
        this.contact_info = contact_info;
        this.putRequestParamers("contact_info", contact_info);
    }

    public SubjectInfoDTO getSubject_info() {
        return subject_info;
    }

    public void setSubject_info(SubjectInfoDTO subject_info) {
        this.subject_info = subject_info;
        this.putRequestParamers("subject_info", subject_info);
    }

    public BusinessInfoDTO getBusiness_info() {
        return business_info;
    }

    public void setBusiness_info(BusinessInfoDTO business_info) {
        this.business_info = business_info;
        this.putRequestParamers("business_info", business_info);
    }

    public SettlementInfoDTO getSettlement_info() {
        return settlement_info;
    }

    public void setSettlement_info(SettlementInfoDTO settlement_info) {
        this.settlement_info = settlement_info;
        this.putRequestParamers("settlement_info", settlement_info);
    }

    public BankAccountInfoDTO getBank_account_info() {
        return bank_account_info;
    }

    public void setBank_account_info(BankAccountInfoDTO bank_account_info) {
        this.bank_account_info = bank_account_info;
        this.putRequestParamers("bank_account_info", bank_account_info);
    }

    public AdditionInfoDTO getAddition_info() {
        return addition_info;
    }

    public void setAddition_info(AdditionInfoDTO addition_info) {
        this.addition_info = addition_info;
        this.putRequestParamers("addition_info", addition_info);
    }

    @Override
    public Class<SpecialMchApplymentResponse> getResponseClass() {
        return SpecialMchApplymentResponse.class;
    }

    @Override
    public HttpEntity getHttpEntity() throws Exception {
        return new StringEntity((new Gson()).toJson(getRequestParamers()), "utf-8");
    }

    public static class ContactInfoDTO {
        /**
         * contact_name : pVd1HJ6zyvPedzGaV+X3qtmrq9bb9tPROvwia4ibL+F6mfjbzQIzfb3HHLEjZ4YiR/cJiCrZxnAqi+pjeKIEdkwzXRAI7FUhrfPK3SNjaBTEu9Gmsu 	gMIA9r3x887Q+ODuC8HH2nzAn7NGpE/e3yiHgWhk0ps5k5DP/2qIdGdONoDzZelrxCl/NWWNUyB93K9F+jC1JX2IMttdY+aQ6zBlw0xnOiNW6Hzy7UtC+xriudjD5APomty 	7/mYNxLMpRSvWKIjOv/69bDnuC4EL5Kz4jBHLiCyOb+tI0m2qhZ9evAM+Jv1z0NVa8MRtelw/wDa4SzfeespQO/0kjiwfqdfg==
         * contact_id_number : pVd1HJ6zyvPedzGaV+X3qtmrq9bb9tPROvwia4ibL+F6mfjbzQIzfb3HHLEjZ4YiR/cJiCrZxnAqi+pjeKIEdkwzXRAI7FUhrfPK3SNjaBTEu 	9GmsugMIA9r3x887Q+ODuC8HH2nzAn7NGpE/e3yiHgWhk0ps5k5DP/2qIdGdONoDzZelrxCl/NWWNUyB93K9F+jC1JX2IMttdY+aQ6zBlw0xnOiNW6Hzy7UtC+xriudjD5A 	Pomty7/mYNxLMpRSvWKIjOv/69bDnuC4EL5Kz4jBHLiCyOb+tI0m2qhZ9evAM+Jv1z0NVa8MRtelw/wDa4SzfeespQO/0kjiwfqdfg==
         * openid : pVd1HJ6zyvPedzGaV+X3qtmrq9bb9tPROvwia4ibL+F6mfjbzQIzfb3HHLEjZ4YiR/cJiCrZxnAqi+pjeKIEdkwzXRAI7FUhrfPK3SNjaBTEu9GmsugMIA9r 	3x887Q+ODuC8HH2nzAn7NGpE/e3yiHgWhk0ps5k5DP/2qIdGdONoDzZelrxCl/NWWNUyB93K9F+jC1JX2IMttdY+aQ6zBlw0xnOiNW6Hzy7UtC+xriudjD5APomty7/mYN 	xLMpRSvWKIjOv/69bDnuC4EL5Kz4jBHLiCyOb+tI0m2qhZ9evAM+Jv1z0NVa8MRtelw/wDa4SzfeespQO/0kjiwfqdfg== 字段加密: 使用APIv3定义的方式加密
         * mobile_phone : pVd1HJ6zyvPedzGaV+X3qtmrq9bb9tPROvwia4ibL+F6mfjbzQIzfb3HHLEjZ4YiR/cJiCrZxnAqi+pjeKIEdkwzXRAI7FUhrfPK3SNjaBTEu9Gms 	ugMIA9r3x887Q+ODuC8HH2nzAn7NGpE/e3yiHgWhk0ps5k5DP/2qIdGdONoDzZelrxCl/NWWNUyB93K9F+jC1JX2IMttdY+aQ6zBlw0xnOiNW6Hzy7UtC+xriudjD5APo 	mty7/mYNxLMpRSvWKIjOv/69bDnuC4EL5Kz4jBHLiCyOb+tI0m2qhZ9evAM+Jv1z0NVa8MRtelw/wDa4SzfeespQO/0kjiwfqdfg==
         * contact_email : pVd1HJ6zyvPedzGaV+X3qtmrq9bb9tPROvwia4ibL+F6mfjbzQIzfb3HHLEjZ4YiR/cJiCrZxnAqi+pjeKIEdkwzXRAI7FUhrfPK3SNjaBTEu9G 	msugMIA9r3x887Q+ODuC8HH2nzAn7NGpE/e3yiHgWhk0ps5k5DP/2qIdGdONoDzZelrxCl/NWWNUyB93K9F+jC1JX2IMttdY+aQ6zBlw0xnOiNW6Hzy7UtC+xriudjD5 	APomty7/mYNxLMpRSvWKIjOv/69bDnuC4EL5Kz4jBHLiCyOb+tI0m2qhZ9evAM+Jv1z0NVa8MRtelw/wDa4SzfeespQO/0kjiwfqdfg==
         */

        private String contact_name;
        private String contact_id_number;
        private String openid;
        private String mobile_phone;
        private String contact_email;

        public String getContact_name() {
            return contact_name;
        }

        public void setContact_name(String contact_name) {
            this.contact_name = contact_name;
        }

        public String getContact_id_number() {
            return contact_id_number;
        }

        public void setContact_id_number(String contact_id_number) {
            this.contact_id_number = contact_id_number;
        }

        public String getOpenid() {
            return openid;
        }

        public void setOpenid(String openid) {
            this.openid = openid;
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

    public static class SubjectInfoDTO {
        /**
         * subject_type : SUBJECT_TYPE_ENTERPRISE
         * business_license_info : {"license_copy":"47ZC6GC-vnrbEny__Ie_An5-tCpqxucuxi-vByf3Gjm7KE53JXvGy9tqZm2XAUf-4KGprrKhpVBDIUv0OF4wFNIO4kqg05InE4d2I6_H7I4","license_number":"123456789012345678","merchant_name":"腾讯科技有限公司","legal_person":"张三"}
         * certificate_info : {"cert_copy":"0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo","cert_type":"CERTIFICATE_TYPE_2388","cert_number":"111111111111","merchant_name":"xx公益团体","company_address":"广东省深圳市南山区xx路xx号","legal_person":"李四","period_begin":"2019-08-01","period_end":"2019-08-01"}
         * organization_info : {"organization_copy":"47ZC6GC-vnrbEny__Ie_An5-tCpqxucuxi-vByf3Gjm7KE53JXvGy9tqZm2XAUf-4KGprrKhpVBDIUv0OF4wFNIO4kqg05InE4d2I6_H7I4","organization_code":"123456789-A","org_period_begin":"2019-08-01","org_period_end":"2019-08-01长期"}
         * certificate_letter_copy : 47ZC6GC-vnrbEny__Ie_An5-tCpqxucuxi-vByf3Gjm7KE53JXvGy9tqZm2XAUf-4KGprrKhpVBDIUv0OF4wFNIO4kqg05InE4d2I6_H7I4
         * micro_biz_info : {"micro_biz_type":"MICRO_TYPE_STORE","micro_store_info":{"micro_name":"大郎烧饼","micro_address_code":"440305","micro_address":"南山区xx大厦x层xxxx室","store_entrance_pic":"0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo","micro_indoor_copy":"0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo","store_longitude":"113.941355","store_latitude":"22.546245","address_certification":"0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo"},"micro_mobile_info":{"micro_mobile_name":"早餐车","micro_mobile_city":"440305","micro_mobile_address":"无","micro_mobile_pics":["0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo"]},"micro_online_info":{"micro_online_store":"李三服装店","micro_ec_name":"XX购物平台","micro_qrcode":"https://www.qq.com","micro_link":"https://www.qq.com"}}
         * identity_info : {"id_doc_type":"IDENTIFICATION_TYPE_IDCARD","id_card_info":{"id_card_copy":"jTpGmxUX3FBWVQ5NJTZvlKX_gdU4cRz7z5NxpnFuAxhBTEO_PvWkfSCJ3zVIn001D8daLC-ehEuo0BJqRTvDujqhThn4ReFxikqJ5YW6zFQ","id_card_national":"47ZC6GC-vnrbEny__Ie_An5-tCpqxucuxi-vByf3Gjm7KE53JXvGy9tqZm2XAUf-4KGprrKhpVBDIUv0OF4wFNIO4kqg05InE4d2I6_H7I4","id_card_name":"pVd1HJ6zyvPedzGaV+X3qtmrq9bb9tPROvwia4ibL+F6mfjbzQIzfb3HHLEjZ4YiR/cJiCrZxnAqi+pjeKIEdkwzXRAI7FUhrfPK3SNjaBTEu9G \t\tmsugMIA9r3x887Q+ODuC8HH2nzAn7NGpE/e3yiHgWhk0ps5k5DP/2qIdGdONoDzZelrxCl/NWWNUyB93K9F+jC1JX2IMttdY+aQ6zBlw0xnOiNW6Hzy7UtC+xriudjD5 \t\tAPomty7/mYNxLMpRSvWKIjOv/69bDnuC4EL5Kz4jBHLiCyOb+tI0m2qhZ9evAM+Jv1z0NVa8MRtelw/wDa4SzfeespQO/0kjiwfqdfg==","id_card_number":"AOZdYGISxo4y44/UgZ69bdu9X+tfMUJ9dl+LetjM45/zMbrYu+wWZ8gn4CTdo+D/m9MrPg+V4sm73oxqdQu/hj7aWyDl4GQtPXVdaztB9jVb \t\tVZh3QFzV+BEmytMNQp9dt1uWJktlfdDdLR3AMWyMB377xd+m9bSr/ioDTzagEcGe+vLYiKrzcroQv3OR0p3ppFYoQ3IfYeU/04S4t9rNFL+kyblK2FCCqQ11NdbbHoC \t\trJc7NV4oASq6ZFonjTtgjjgKsadIKHXtb3JZKGZjduGdtkRJJp0/0eow96uY1Pk7Rq79Jtt7+I8juwEc4P4TG5xzchG/5IL9DBd+Z0zZXkw==","card_period_begin":"2026-06-06","card_period_end":"2026-06-06"},"id_doc_info":{"id_doc_copy":"jTpGmxUX3FBWVQ5NJTZvlKX_gdU4cRz7z5NxpnFuAxhBTEO_PvWkfSCJ3zVIn001D8daLC-ehEuo0BJqRTvDujqhThn4ReFxikqJ5YW6zFQ","id_doc_name":"pVd1HJ6zyvPedzGaV+X3qtmrq9bb9tPROvwia4ibL+F6mfjbzQIzfb3HHLEjZ4YiR/cJiCrZxnAqi+pjeKIEdkwzXRAI7FUhrfPK3SNjaBTE \t\tu9GmsugMIA9r3x887Q+ODuC8HH2nzAn7NGpE/e3yiHgWhk0ps5k5DP/2qIdGdONoDzZelrxCl/NWWNUyB93K9F+jC1JX2IMttdY+aQ6zBlw0xnOiNW6Hzy7UtC+ \t\txriudjD5APomty7/mYNxLMpRSvWKIjOv/69bDnuC4EL5Kz4jBHLiCyOb+tI0m2qhZ9evAM+Jv1z0NVa8MRtelw/wDa4SzfeespQO/0kjiwfqdfg==","id_doc_number":"AOZdYGISxo4y44/UgZ69bdu9X+tfMUJ9dl+LetjM45/zMbrYu+wWZ8gn4CTdo+D/m9MrPg+V4sm73oxqdQu/hj7aWyDl4GQtPXVdaztB9j \t\tVbVZh3QFzV+BEmytMNQp9dt1uWJktlfdDdLR3AMWyMB377xd+m9bSr/ioDTzagEcGe+vLYiKrzcroQv3OR0p3ppFYoQ3IfYeU/04S4t9rNFL+kyblK2FCCqQ11Nd \t\tbbHoCrJc7NV4oASq6ZFonjTtgjjgKsadIKHXtb3JZKGZjduGdtkRJJp0/0eow96uY1Pk7Rq79Jtt7+I8juwEc4P4TG5xzchG/5IL9DBd+Z0zZXkw==","doc_period_begin":"2019-06-06","doc_period_end":"2026-06-06"},"owner":"true"}
         * ubo_info : {"id_type":"IDENTIFICATION_TYPE_IDCARD","id_card_copy":"jTpGmxUX3FBWVQ5NJTZvlKX_gdU4cRz7z5NxpnFuAxhBTEO_PvWkfSCJ3zVIn001D8daLC-ehEuo0BJqRTvDujqhThn4ReFxikqJ5YW6zFQ","id_card_national":"jTpGmxUX3FBWVQ5NJTZvlKX_gdU4cRz7z5NxpnFuAxhBTEO_PvWkfSCJ3zVIn001D8daLC-ehEuo0BJqRTvDujqhThn4ReFxikqJ5YW6zFQ","id_doc_copy":"jTpGmxUX3FBWVQ5NJTZvlKX_gdU4cRz7z5NxpnFuAxhBTEO_PvWkfSCJ3zVIn001D8daLC-ehEuo0BJqRTvDujqhThn4ReFxikqJ5YW6zFQ","name":"李四","id_number":"AOZdYGISxo4y44/UgZ69bdu9X+tfMUJ9dl+LetjM45/zMbrYu+wWZ8gn4CTdo+D/m9MrPg+V4sm73oxqdQu/hj7aWyDl4GQtPXVdaztB9jVbVZh3 \t  QFzV+BEmytMNQp9dt1uWJktlfdDdLR3AMWyMB377xd+m9bSr/ioDTzagEcGe+vLYiKrzcroQv3OR0p3ppFYoQ3IfYeU/04S4t9rNFL+kyblK2FCCqQ11NdbbHoCrJc \t  7NV4oASq6ZFonjTtgjjgKsadIKHXtb3JZKGZjduGdtkRJJp0/0eow96uY1Pk7Rq79Jtt7+I8juwEc4P4TG5xzchG/5IL9DBd+Z0zZXkw==","id_period_begin":"2019-06-06","id_period_end":"2026-06-06"}
         */

        private String subject_type;
        private BusinessLicenseInfoDTO business_license_info;
        private CertificateInfoDTO certificate_info;
        private OrganizationInfoDTO organization_info;
        private String certificate_letter_copy;
        private MicroBizInfoDTO micro_biz_info;
        private IdentityInfoDTO identity_info;
        private UboInfoDTO ubo_info;

        public String getSubject_type() {
            return subject_type;
        }

        public void setSubject_type(String subject_type) {
            this.subject_type = subject_type;
        }

        public BusinessLicenseInfoDTO getBusiness_license_info() {
            return business_license_info;
        }

        public void setBusiness_license_info(BusinessLicenseInfoDTO business_license_info) {
            this.business_license_info = business_license_info;
        }

        public CertificateInfoDTO getCertificate_info() {
            return certificate_info;
        }

        public void setCertificate_info(CertificateInfoDTO certificate_info) {
            this.certificate_info = certificate_info;
        }

        public OrganizationInfoDTO getOrganization_info() {
            return organization_info;
        }

        public void setOrganization_info(OrganizationInfoDTO organization_info) {
            this.organization_info = organization_info;
        }

        public String getCertificate_letter_copy() {
            return certificate_letter_copy;
        }

        public void setCertificate_letter_copy(String certificate_letter_copy) {
            this.certificate_letter_copy = certificate_letter_copy;
        }

        public MicroBizInfoDTO getMicro_biz_info() {
            return micro_biz_info;
        }

        public void setMicro_biz_info(MicroBizInfoDTO micro_biz_info) {
            this.micro_biz_info = micro_biz_info;
        }

        public IdentityInfoDTO getIdentity_info() {
            return identity_info;
        }

        public void setIdentity_info(IdentityInfoDTO identity_info) {
            this.identity_info = identity_info;
        }

        public UboInfoDTO getUbo_info() {
            return ubo_info;
        }

        public void setUbo_info(UboInfoDTO ubo_info) {
            this.ubo_info = ubo_info;
        }

        public static class BusinessLicenseInfoDTO {
            /**
             * license_copy : 47ZC6GC-vnrbEny__Ie_An5-tCpqxucuxi-vByf3Gjm7KE53JXvGy9tqZm2XAUf-4KGprrKhpVBDIUv0OF4wFNIO4kqg05InE4d2I6_H7I4
             * license_number : 123456789012345678
             * merchant_name : 腾讯科技有限公司
             * legal_person : 张三
             */

            private String license_copy;
            private String license_number;
            private String merchant_name;
            private String legal_person;

            public String getLicense_copy() {
                return license_copy;
            }

            public void setLicense_copy(String license_copy) {
                this.license_copy = license_copy;
            }

            public String getLicense_number() {
                return license_number;
            }

            public void setLicense_number(String license_number) {
                this.license_number = license_number;
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

        public static class CertificateInfoDTO {
            /**
             * cert_copy : 0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo
             * cert_type : CERTIFICATE_TYPE_2388
             * cert_number : 111111111111
             * merchant_name : xx公益团体
             * company_address : 广东省深圳市南山区xx路xx号
             * legal_person : 李四
             * period_begin : 2019-08-01
             * period_end : 2019-08-01
             */

            private String cert_copy;
            private String cert_type;
            private String cert_number;
            private String merchant_name;
            private String company_address;
            private String legal_person;
            private String period_begin;
            private String period_end;

            public String getCert_copy() {
                return cert_copy;
            }

            public void setCert_copy(String cert_copy) {
                this.cert_copy = cert_copy;
            }

            public String getCert_type() {
                return cert_type;
            }

            public void setCert_type(String cert_type) {
                this.cert_type = cert_type;
            }

            public String getCert_number() {
                return cert_number;
            }

            public void setCert_number(String cert_number) {
                this.cert_number = cert_number;
            }

            public String getMerchant_name() {
                return merchant_name;
            }

            public void setMerchant_name(String merchant_name) {
                this.merchant_name = merchant_name;
            }

            public String getCompany_address() {
                return company_address;
            }

            public void setCompany_address(String company_address) {
                this.company_address = company_address;
            }

            public String getLegal_person() {
                return legal_person;
            }

            public void setLegal_person(String legal_person) {
                this.legal_person = legal_person;
            }

            public String getPeriod_begin() {
                return period_begin;
            }

            public void setPeriod_begin(String period_begin) {
                this.period_begin = period_begin;
            }

            public String getPeriod_end() {
                return period_end;
            }

            public void setPeriod_end(String period_end) {
                this.period_end = period_end;
            }
        }

        public static class OrganizationInfoDTO {
            /**
             * organization_copy : 47ZC6GC-vnrbEny__Ie_An5-tCpqxucuxi-vByf3Gjm7KE53JXvGy9tqZm2XAUf-4KGprrKhpVBDIUv0OF4wFNIO4kqg05InE4d2I6_H7I4
             * organization_code : 123456789-A
             * org_period_begin : 2019-08-01
             * org_period_end : 2019-08-01长期
             */

            private String organization_copy;
            private String organization_code;
            private String org_period_begin;
            private String org_period_end;

            public String getOrganization_copy() {
                return organization_copy;
            }

            public void setOrganization_copy(String organization_copy) {
                this.organization_copy = organization_copy;
            }

            public String getOrganization_code() {
                return organization_code;
            }

            public void setOrganization_code(String organization_code) {
                this.organization_code = organization_code;
            }

            public String getOrg_period_begin() {
                return org_period_begin;
            }

            public void setOrg_period_begin(String org_period_begin) {
                this.org_period_begin = org_period_begin;
            }

            public String getOrg_period_end() {
                return org_period_end;
            }

            public void setOrg_period_end(String org_period_end) {
                this.org_period_end = org_period_end;
            }
        }

        public static class MicroBizInfoDTO {
            /**
             * micro_biz_type : MICRO_TYPE_STORE
             * micro_store_info : {"micro_name":"大郎烧饼","micro_address_code":"440305","micro_address":"南山区xx大厦x层xxxx室","store_entrance_pic":"0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo","micro_indoor_copy":"0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo","store_longitude":"113.941355","store_latitude":"22.546245","address_certification":"0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo"}
             * micro_mobile_info : {"micro_mobile_name":"早餐车","micro_mobile_city":"440305","micro_mobile_address":"无","micro_mobile_pics":["0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo"]}
             * micro_online_info : {"micro_online_store":"李三服装店","micro_ec_name":"XX购物平台","micro_qrcode":"https://www.qq.com","micro_link":"https://www.qq.com"}
             */

            private String micro_biz_type;
            private MicroStoreInfoDTO micro_store_info;
            private MicroMobileInfoDTO micro_mobile_info;
            private MicroOnlineInfoDTO micro_online_info;

            public String getMicro_biz_type() {
                return micro_biz_type;
            }

            public void setMicro_biz_type(String micro_biz_type) {
                this.micro_biz_type = micro_biz_type;
            }

            public MicroStoreInfoDTO getMicro_store_info() {
                return micro_store_info;
            }

            public void setMicro_store_info(MicroStoreInfoDTO micro_store_info) {
                this.micro_store_info = micro_store_info;
            }

            public MicroMobileInfoDTO getMicro_mobile_info() {
                return micro_mobile_info;
            }

            public void setMicro_mobile_info(MicroMobileInfoDTO micro_mobile_info) {
                this.micro_mobile_info = micro_mobile_info;
            }

            public MicroOnlineInfoDTO getMicro_online_info() {
                return micro_online_info;
            }

            public void setMicro_online_info(MicroOnlineInfoDTO micro_online_info) {
                this.micro_online_info = micro_online_info;
            }

            public static class MicroStoreInfoDTO {
                /**
                 * micro_name : 大郎烧饼
                 * micro_address_code : 440305
                 * micro_address : 南山区xx大厦x层xxxx室
                 * store_entrance_pic : 0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo
                 * micro_indoor_copy : 0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo
                 * store_longitude : 113.941355
                 * store_latitude : 22.546245
                 * address_certification : 0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo
                 */

                private String micro_name;
                private String micro_address_code;
                private String micro_address;
                private String store_entrance_pic;
                private String micro_indoor_copy;
                private String store_longitude;
                private String store_latitude;
                private String address_certification;

                public String getMicro_name() {
                    return micro_name;
                }

                public void setMicro_name(String micro_name) {
                    this.micro_name = micro_name;
                }

                public String getMicro_address_code() {
                    return micro_address_code;
                }

                public void setMicro_address_code(String micro_address_code) {
                    this.micro_address_code = micro_address_code;
                }

                public String getMicro_address() {
                    return micro_address;
                }

                public void setMicro_address(String micro_address) {
                    this.micro_address = micro_address;
                }

                public String getStore_entrance_pic() {
                    return store_entrance_pic;
                }

                public void setStore_entrance_pic(String store_entrance_pic) {
                    this.store_entrance_pic = store_entrance_pic;
                }

                public String getMicro_indoor_copy() {
                    return micro_indoor_copy;
                }

                public void setMicro_indoor_copy(String micro_indoor_copy) {
                    this.micro_indoor_copy = micro_indoor_copy;
                }

                public String getStore_longitude() {
                    return store_longitude;
                }

                public void setStore_longitude(String store_longitude) {
                    this.store_longitude = store_longitude;
                }

                public String getStore_latitude() {
                    return store_latitude;
                }

                public void setStore_latitude(String store_latitude) {
                    this.store_latitude = store_latitude;
                }

                public String getAddress_certification() {
                    return address_certification;
                }

                public void setAddress_certification(String address_certification) {
                    this.address_certification = address_certification;
                }
            }

            public static class MicroMobileInfoDTO {
                /**
                 * micro_mobile_name : 早餐车
                 * micro_mobile_city : 440305
                 * micro_mobile_address : 无
                 * micro_mobile_pics : ["0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo"]
                 */

                private String micro_mobile_name;
                private String micro_mobile_city;
                private String micro_mobile_address;
                private List<String> micro_mobile_pics;

                public String getMicro_mobile_name() {
                    return micro_mobile_name;
                }

                public void setMicro_mobile_name(String micro_mobile_name) {
                    this.micro_mobile_name = micro_mobile_name;
                }

                public String getMicro_mobile_city() {
                    return micro_mobile_city;
                }

                public void setMicro_mobile_city(String micro_mobile_city) {
                    this.micro_mobile_city = micro_mobile_city;
                }

                public String getMicro_mobile_address() {
                    return micro_mobile_address;
                }

                public void setMicro_mobile_address(String micro_mobile_address) {
                    this.micro_mobile_address = micro_mobile_address;
                }

                public List<String> getMicro_mobile_pics() {
                    return micro_mobile_pics;
                }

                public void setMicro_mobile_pics(List<String> micro_mobile_pics) {
                    this.micro_mobile_pics = micro_mobile_pics;
                }
            }

            public static class MicroOnlineInfoDTO {
                /**
                 * micro_online_store : 李三服装店
                 * micro_ec_name : XX购物平台
                 * micro_qrcode : https://www.qq.com
                 * micro_link : https://www.qq.com
                 */

                private String micro_online_store;
                private String micro_ec_name;
                private String micro_qrcode;
                private String micro_link;

                public String getMicro_online_store() {
                    return micro_online_store;
                }

                public void setMicro_online_store(String micro_online_store) {
                    this.micro_online_store = micro_online_store;
                }

                public String getMicro_ec_name() {
                    return micro_ec_name;
                }

                public void setMicro_ec_name(String micro_ec_name) {
                    this.micro_ec_name = micro_ec_name;
                }

                public String getMicro_qrcode() {
                    return micro_qrcode;
                }

                public void setMicro_qrcode(String micro_qrcode) {
                    this.micro_qrcode = micro_qrcode;
                }

                public String getMicro_link() {
                    return micro_link;
                }

                public void setMicro_link(String micro_link) {
                    this.micro_link = micro_link;
                }
            }
        }

        public static class IdentityInfoDTO {
            /**
             * id_doc_type : IDENTIFICATION_TYPE_IDCARD
             * id_card_info : {"id_card_copy":"jTpGmxUX3FBWVQ5NJTZvlKX_gdU4cRz7z5NxpnFuAxhBTEO_PvWkfSCJ3zVIn001D8daLC-ehEuo0BJqRTvDujqhThn4ReFxikqJ5YW6zFQ","id_card_national":"47ZC6GC-vnrbEny__Ie_An5-tCpqxucuxi-vByf3Gjm7KE53JXvGy9tqZm2XAUf-4KGprrKhpVBDIUv0OF4wFNIO4kqg05InE4d2I6_H7I4","id_card_name":"pVd1HJ6zyvPedzGaV+X3qtmrq9bb9tPROvwia4ibL+F6mfjbzQIzfb3HHLEjZ4YiR/cJiCrZxnAqi+pjeKIEdkwzXRAI7FUhrfPK3SNjaBTEu9G \t\tmsugMIA9r3x887Q+ODuC8HH2nzAn7NGpE/e3yiHgWhk0ps5k5DP/2qIdGdONoDzZelrxCl/NWWNUyB93K9F+jC1JX2IMttdY+aQ6zBlw0xnOiNW6Hzy7UtC+xriudjD5 \t\tAPomty7/mYNxLMpRSvWKIjOv/69bDnuC4EL5Kz4jBHLiCyOb+tI0m2qhZ9evAM+Jv1z0NVa8MRtelw/wDa4SzfeespQO/0kjiwfqdfg==","id_card_number":"AOZdYGISxo4y44/UgZ69bdu9X+tfMUJ9dl+LetjM45/zMbrYu+wWZ8gn4CTdo+D/m9MrPg+V4sm73oxqdQu/hj7aWyDl4GQtPXVdaztB9jVb \t\tVZh3QFzV+BEmytMNQp9dt1uWJktlfdDdLR3AMWyMB377xd+m9bSr/ioDTzagEcGe+vLYiKrzcroQv3OR0p3ppFYoQ3IfYeU/04S4t9rNFL+kyblK2FCCqQ11NdbbHoC \t\trJc7NV4oASq6ZFonjTtgjjgKsadIKHXtb3JZKGZjduGdtkRJJp0/0eow96uY1Pk7Rq79Jtt7+I8juwEc4P4TG5xzchG/5IL9DBd+Z0zZXkw==","card_period_begin":"2026-06-06","card_period_end":"2026-06-06"}
             * id_doc_info : {"id_doc_copy":"jTpGmxUX3FBWVQ5NJTZvlKX_gdU4cRz7z5NxpnFuAxhBTEO_PvWkfSCJ3zVIn001D8daLC-ehEuo0BJqRTvDujqhThn4ReFxikqJ5YW6zFQ","id_doc_name":"pVd1HJ6zyvPedzGaV+X3qtmrq9bb9tPROvwia4ibL+F6mfjbzQIzfb3HHLEjZ4YiR/cJiCrZxnAqi+pjeKIEdkwzXRAI7FUhrfPK3SNjaBTE \t\tu9GmsugMIA9r3x887Q+ODuC8HH2nzAn7NGpE/e3yiHgWhk0ps5k5DP/2qIdGdONoDzZelrxCl/NWWNUyB93K9F+jC1JX2IMttdY+aQ6zBlw0xnOiNW6Hzy7UtC+ \t\txriudjD5APomty7/mYNxLMpRSvWKIjOv/69bDnuC4EL5Kz4jBHLiCyOb+tI0m2qhZ9evAM+Jv1z0NVa8MRtelw/wDa4SzfeespQO/0kjiwfqdfg==","id_doc_number":"AOZdYGISxo4y44/UgZ69bdu9X+tfMUJ9dl+LetjM45/zMbrYu+wWZ8gn4CTdo+D/m9MrPg+V4sm73oxqdQu/hj7aWyDl4GQtPXVdaztB9j \t\tVbVZh3QFzV+BEmytMNQp9dt1uWJktlfdDdLR3AMWyMB377xd+m9bSr/ioDTzagEcGe+vLYiKrzcroQv3OR0p3ppFYoQ3IfYeU/04S4t9rNFL+kyblK2FCCqQ11Nd \t\tbbHoCrJc7NV4oASq6ZFonjTtgjjgKsadIKHXtb3JZKGZjduGdtkRJJp0/0eow96uY1Pk7Rq79Jtt7+I8juwEc4P4TG5xzchG/5IL9DBd+Z0zZXkw==","doc_period_begin":"2019-06-06","doc_period_end":"2026-06-06"}
             * owner : true
             */

            private String id_doc_type;
            private IdCardInfoDTO id_card_info;
            private IdDocInfoDTO id_doc_info;
            private String owner;

            public String getId_doc_type() {
                return id_doc_type;
            }

            public void setId_doc_type(String id_doc_type) {
                this.id_doc_type = id_doc_type;
            }

            public IdCardInfoDTO getId_card_info() {
                return id_card_info;
            }

            public void setId_card_info(IdCardInfoDTO id_card_info) {
                this.id_card_info = id_card_info;
            }

            public IdDocInfoDTO getId_doc_info() {
                return id_doc_info;
            }

            public void setId_doc_info(IdDocInfoDTO id_doc_info) {
                this.id_doc_info = id_doc_info;
            }

            public String getOwner() {
                return owner;
            }

            public void setOwner(String owner) {
                this.owner = owner;
            }

            public static class IdCardInfoDTO {
                /**
                 * id_card_copy : jTpGmxUX3FBWVQ5NJTZvlKX_gdU4cRz7z5NxpnFuAxhBTEO_PvWkfSCJ3zVIn001D8daLC-ehEuo0BJqRTvDujqhThn4ReFxikqJ5YW6zFQ
                 * id_card_national : 47ZC6GC-vnrbEny__Ie_An5-tCpqxucuxi-vByf3Gjm7KE53JXvGy9tqZm2XAUf-4KGprrKhpVBDIUv0OF4wFNIO4kqg05InE4d2I6_H7I4
                 * id_card_name : pVd1HJ6zyvPedzGaV+X3qtmrq9bb9tPROvwia4ibL+F6mfjbzQIzfb3HHLEjZ4YiR/cJiCrZxnAqi+pjeKIEdkwzXRAI7FUhrfPK3SNjaBTEu9G 		msugMIA9r3x887Q+ODuC8HH2nzAn7NGpE/e3yiHgWhk0ps5k5DP/2qIdGdONoDzZelrxCl/NWWNUyB93K9F+jC1JX2IMttdY+aQ6zBlw0xnOiNW6Hzy7UtC+xriudjD5 		APomty7/mYNxLMpRSvWKIjOv/69bDnuC4EL5Kz4jBHLiCyOb+tI0m2qhZ9evAM+Jv1z0NVa8MRtelw/wDa4SzfeespQO/0kjiwfqdfg==
                 * id_card_number : AOZdYGISxo4y44/UgZ69bdu9X+tfMUJ9dl+LetjM45/zMbrYu+wWZ8gn4CTdo+D/m9MrPg+V4sm73oxqdQu/hj7aWyDl4GQtPXVdaztB9jVb 		VZh3QFzV+BEmytMNQp9dt1uWJktlfdDdLR3AMWyMB377xd+m9bSr/ioDTzagEcGe+vLYiKrzcroQv3OR0p3ppFYoQ3IfYeU/04S4t9rNFL+kyblK2FCCqQ11NdbbHoC 		rJc7NV4oASq6ZFonjTtgjjgKsadIKHXtb3JZKGZjduGdtkRJJp0/0eow96uY1Pk7Rq79Jtt7+I8juwEc4P4TG5xzchG/5IL9DBd+Z0zZXkw==
                 * card_period_begin : 2026-06-06
                 * card_period_end : 2026-06-06
                 */

                private String id_card_copy;
                private String id_card_national;
                private String id_card_name;
                private String id_card_number;
                private String card_period_begin;
                private String card_period_end;


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

                public String getCard_period_begin() {
                    return card_period_begin;
                }

                public void setCard_period_begin(String card_period_begin) {
                    this.card_period_begin = card_period_begin;
                }

                public String getCard_period_end() {
                    return card_period_end;
                }

                public void setCard_period_end(String card_period_end) {
                    this.card_period_end = card_period_end;
                }
            }

            public static class IdDocInfoDTO {
                /**
                 * id_doc_copy : jTpGmxUX3FBWVQ5NJTZvlKX_gdU4cRz7z5NxpnFuAxhBTEO_PvWkfSCJ3zVIn001D8daLC-ehEuo0BJqRTvDujqhThn4ReFxikqJ5YW6zFQ
                 * id_doc_name : pVd1HJ6zyvPedzGaV+X3qtmrq9bb9tPROvwia4ibL+F6mfjbzQIzfb3HHLEjZ4YiR/cJiCrZxnAqi+pjeKIEdkwzXRAI7FUhrfPK3SNjaBTE 		u9GmsugMIA9r3x887Q+ODuC8HH2nzAn7NGpE/e3yiHgWhk0ps5k5DP/2qIdGdONoDzZelrxCl/NWWNUyB93K9F+jC1JX2IMttdY+aQ6zBlw0xnOiNW6Hzy7UtC+ 		xriudjD5APomty7/mYNxLMpRSvWKIjOv/69bDnuC4EL5Kz4jBHLiCyOb+tI0m2qhZ9evAM+Jv1z0NVa8MRtelw/wDa4SzfeespQO/0kjiwfqdfg==
                 * id_doc_number : AOZdYGISxo4y44/UgZ69bdu9X+tfMUJ9dl+LetjM45/zMbrYu+wWZ8gn4CTdo+D/m9MrPg+V4sm73oxqdQu/hj7aWyDl4GQtPXVdaztB9j 		VbVZh3QFzV+BEmytMNQp9dt1uWJktlfdDdLR3AMWyMB377xd+m9bSr/ioDTzagEcGe+vLYiKrzcroQv3OR0p3ppFYoQ3IfYeU/04S4t9rNFL+kyblK2FCCqQ11Nd 		bbHoCrJc7NV4oASq6ZFonjTtgjjgKsadIKHXtb3JZKGZjduGdtkRJJp0/0eow96uY1Pk7Rq79Jtt7+I8juwEc4P4TG5xzchG/5IL9DBd+Z0zZXkw==
                 * doc_period_begin : 2019-06-06
                 * doc_period_end : 2026-06-06
                 */

                private String id_doc_copy;
                private String id_doc_name;
                private String id_doc_number;
                private String doc_period_begin;
                private String doc_period_end;

                public String getId_doc_copy() {
                    return id_doc_copy;
                }

                public void setId_doc_copy(String id_doc_copy) {
                    this.id_doc_copy = id_doc_copy;
                }

                public String getId_doc_name() {
                    return id_doc_name;
                }

                public void setId_doc_name(String id_doc_name) {
                    this.id_doc_name = id_doc_name;
                }

                public String getId_doc_number() {
                    return id_doc_number;
                }

                public void setId_doc_number(String id_doc_number) {
                    this.id_doc_number = id_doc_number;
                }

                public String getDoc_period_begin() {
                    return doc_period_begin;
                }

                public void setDoc_period_begin(String doc_period_begin) {
                    this.doc_period_begin = doc_period_begin;
                }

                public String getDoc_period_end() {
                    return doc_period_end;
                }

                public void setDoc_period_end(String doc_period_end) {
                    this.doc_period_end = doc_period_end;
                }
            }
        }

        public static class UboInfoDTO {
            /**
             * id_type : IDENTIFICATION_TYPE_IDCARD
             * id_card_copy : jTpGmxUX3FBWVQ5NJTZvlKX_gdU4cRz7z5NxpnFuAxhBTEO_PvWkfSCJ3zVIn001D8daLC-ehEuo0BJqRTvDujqhThn4ReFxikqJ5YW6zFQ
             * id_card_national : jTpGmxUX3FBWVQ5NJTZvlKX_gdU4cRz7z5NxpnFuAxhBTEO_PvWkfSCJ3zVIn001D8daLC-ehEuo0BJqRTvDujqhThn4ReFxikqJ5YW6zFQ
             * id_doc_copy : jTpGmxUX3FBWVQ5NJTZvlKX_gdU4cRz7z5NxpnFuAxhBTEO_PvWkfSCJ3zVIn001D8daLC-ehEuo0BJqRTvDujqhThn4ReFxikqJ5YW6zFQ
             * name : 李四
             * id_number : AOZdYGISxo4y44/UgZ69bdu9X+tfMUJ9dl+LetjM45/zMbrYu+wWZ8gn4CTdo+D/m9MrPg+V4sm73oxqdQu/hj7aWyDl4GQtPXVdaztB9jVbVZh3  QFzV+BEmytMNQp9dt1uWJktlfdDdLR3AMWyMB377xd+m9bSr/ioDTzagEcGe+vLYiKrzcroQv3OR0p3ppFYoQ3IfYeU/04S4t9rNFL+kyblK2FCCqQ11NdbbHoCrJc  7NV4oASq6ZFonjTtgjjgKsadIKHXtb3JZKGZjduGdtkRJJp0/0eow96uY1Pk7Rq79Jtt7+I8juwEc4P4TG5xzchG/5IL9DBd+Z0zZXkw==
             * id_period_begin : 2019-06-06
             * id_period_end : 2026-06-06
             */

            private String id_type;
            private String id_card_copy;
            private String id_card_national;
            private String id_doc_copy;
            private String name;
            private String id_number;
            private String id_period_begin;
            private String id_period_end;

            public String getId_type() {
                return id_type;
            }

            public void setId_type(String id_type) {
                this.id_type = id_type;
            }

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

            public String getId_doc_copy() {
                return id_doc_copy;
            }

            public void setId_doc_copy(String id_doc_copy) {
                this.id_doc_copy = id_doc_copy;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getId_number() {
                return id_number;
            }

            public void setId_number(String id_number) {
                this.id_number = id_number;
            }

            public String getId_period_begin() {
                return id_period_begin;
            }

            public void setId_period_begin(String id_period_begin) {
                this.id_period_begin = id_period_begin;
            }

            public String getId_period_end() {
                return id_period_end;
            }

            public void setId_period_end(String id_period_end) {
                this.id_period_end = id_period_end;
            }
        }
    }

    public static class BusinessInfoDTO {
        /**
         * merchant_shortname : 张三餐饮店
         * service_phone : 0758XXXXX
         * sales_info : {"sales_scenes_type":["string "],"biz_store_info":{"biz_store_name":"大郎烧饼","biz_address_code":"440305","biz_store_address":"南山区xx大厦x层xxxx室","store_entrance_pic":["0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo"],"indoor_pic":["0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo"],"biz_sub_appid":"wx1234567890123456"},"mp_info":{"mp_appid":"wx1234567890123456","mp_sub_appid":"wx1234567890123456","mp_pics":["string "]},"mini_program_info":{"mini_program_appid":"wx1234567890123456","mini_program_sub_appid":"wx1234567890123456","mini_program_pics":["string "]},"app_info":{"app_appid":"wx1234567890123456","app_sub_appid":"wx1234567890123456","app_pics":["string "]},"web_info":{"domain":"http://www.qq.com","web_authorisation":"47ZC6GC-vnrbEny__Ie_An5-tCpqxucuxi-vByf3Gjm7KE53JXvGy9tqZm2XAUf-4KGprrKhpVBDIUv0OF4wFNIO4kqg05InE4d2I6_H7I4","web_appid":"wx1234567890123456"},"wework_info":{"corp_id":"wx1234567890123456","sub_corp_id":"wx1234567890123456","wework_pics":["string "]}}
         */

        private String merchant_shortname;
        private String service_phone;
        private SalesInfoDTO sales_info;

        public String getMerchant_shortname() {
            return merchant_shortname;
        }

        public void setMerchant_shortname(String merchant_shortname) {
            this.merchant_shortname = merchant_shortname;
        }

        public String getService_phone() {
            return service_phone;
        }

        public void setService_phone(String service_phone) {
            this.service_phone = service_phone;
        }

        public SalesInfoDTO getSales_info() {
            return sales_info;
        }

        public void setSales_info(SalesInfoDTO sales_info) {
            this.sales_info = sales_info;
        }

        public static class SalesInfoDTO {
            /**
             * sales_scenes_type : ["string "]
             * biz_store_info : {"biz_store_name":"大郎烧饼","biz_address_code":"440305","biz_store_address":"南山区xx大厦x层xxxx室","store_entrance_pic":["0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo"],"indoor_pic":["0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo"],"biz_sub_appid":"wx1234567890123456"}
             * mp_info : {"mp_appid":"wx1234567890123456","mp_sub_appid":"wx1234567890123456","mp_pics":["string "]}
             * mini_program_info : {"mini_program_appid":"wx1234567890123456","mini_program_sub_appid":"wx1234567890123456","mini_program_pics":["string "]}
             * app_info : {"app_appid":"wx1234567890123456","app_sub_appid":"wx1234567890123456","app_pics":["string "]}
             * web_info : {"domain":"http://www.qq.com","web_authorisation":"47ZC6GC-vnrbEny__Ie_An5-tCpqxucuxi-vByf3Gjm7KE53JXvGy9tqZm2XAUf-4KGprrKhpVBDIUv0OF4wFNIO4kqg05InE4d2I6_H7I4","web_appid":"wx1234567890123456"}
             * wework_info : {"corp_id":"wx1234567890123456","sub_corp_id":"wx1234567890123456","wework_pics":["string "]}
             */

            private BizStoreInfoDTO biz_store_info;
            private MpInfoDTO mp_info;
            private MiniProgramInfoDTO mini_program_info;
            private AppInfoDTO app_info;
            private WebInfoDTO web_info;
            private WeworkInfoDTO wework_info;
            private List<String> sales_scenes_type;

            public BizStoreInfoDTO getBiz_store_info() {
                return biz_store_info;
            }

            public void setBiz_store_info(BizStoreInfoDTO biz_store_info) {
                this.biz_store_info = biz_store_info;
            }

            public MpInfoDTO getMp_info() {
                return mp_info;
            }

            public void setMp_info(MpInfoDTO mp_info) {
                this.mp_info = mp_info;
            }

            public MiniProgramInfoDTO getMini_program_info() {
                return mini_program_info;
            }

            public void setMini_program_info(MiniProgramInfoDTO mini_program_info) {
                this.mini_program_info = mini_program_info;
            }

            public AppInfoDTO getApp_info() {
                return app_info;
            }

            public void setApp_info(AppInfoDTO app_info) {
                this.app_info = app_info;
            }

            public WebInfoDTO getWeb_info() {
                return web_info;
            }

            public void setWeb_info(WebInfoDTO web_info) {
                this.web_info = web_info;
            }

            public WeworkInfoDTO getWework_info() {
                return wework_info;
            }

            public void setWework_info(WeworkInfoDTO wework_info) {
                this.wework_info = wework_info;
            }

            public List<String> getSales_scenes_type() {
                return sales_scenes_type;
            }

            public void setSales_scenes_type(List<String> sales_scenes_type) {
                this.sales_scenes_type = sales_scenes_type;
            }

            public static class BizStoreInfoDTO {
                /**
                 * biz_store_name : 大郎烧饼
                 * biz_address_code : 440305
                 * biz_store_address : 南山区xx大厦x层xxxx室
                 * store_entrance_pic : ["0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo"]
                 * indoor_pic : ["0P3ng6KTIW4-Q_l2FjKLZuhHjBWoMAjmVtCz7ScmhEIThCaV-4BBgVwtNkCHO_XXqK5dE5YdOmFJBZR9FwczhJehHhAZN6BKXQPcs-VvdSo"]
                 * biz_sub_appid : wx1234567890123456
                 */

                private String biz_store_name;
                private String biz_address_code;
                private String biz_store_address;
                private String biz_sub_appid;
                private List<String> store_entrance_pic;
                private List<String> indoor_pic;

                public String getBiz_store_name() {
                    return biz_store_name;
                }

                public void setBiz_store_name(String biz_store_name) {
                    this.biz_store_name = biz_store_name;
                }

                public String getBiz_address_code() {
                    return biz_address_code;
                }

                public void setBiz_address_code(String biz_address_code) {
                    this.biz_address_code = biz_address_code;
                }

                public String getBiz_store_address() {
                    return biz_store_address;
                }

                public void setBiz_store_address(String biz_store_address) {
                    this.biz_store_address = biz_store_address;
                }

                public String getBiz_sub_appid() {
                    return biz_sub_appid;
                }

                public void setBiz_sub_appid(String biz_sub_appid) {
                    this.biz_sub_appid = biz_sub_appid;
                }

                public List<String> getStore_entrance_pic() {
                    return store_entrance_pic;
                }

                public void setStore_entrance_pic(List<String> store_entrance_pic) {
                    this.store_entrance_pic = store_entrance_pic;
                }

                public List<String> getIndoor_pic() {
                    return indoor_pic;
                }

                public void setIndoor_pic(List<String> indoor_pic) {
                    this.indoor_pic = indoor_pic;
                }
            }

            public static class MpInfoDTO {
                /**
                 * mp_appid : wx1234567890123456
                 * mp_sub_appid : wx1234567890123456
                 * mp_pics : ["string "]
                 */

                private String mp_appid;
                private String mp_sub_appid;
                private List<String> mp_pics;

                public String getMp_appid() {
                    return mp_appid;
                }

                public void setMp_appid(String mp_appid) {
                    this.mp_appid = mp_appid;
                }

                public String getMp_sub_appid() {
                    return mp_sub_appid;
                }

                public void setMp_sub_appid(String mp_sub_appid) {
                    this.mp_sub_appid = mp_sub_appid;
                }

                public List<String> getMp_pics() {
                    return mp_pics;
                }

                public void setMp_pics(List<String> mp_pics) {
                    this.mp_pics = mp_pics;
                }
            }

            public static class MiniProgramInfoDTO {
                /**
                 * mini_program_appid : wx1234567890123456
                 * mini_program_sub_appid : wx1234567890123456
                 * mini_program_pics : ["string "]
                 */

                private String mini_program_appid;
                private String mini_program_sub_appid;
                private List<String> mini_program_pics;

                public String getMini_program_appid() {
                    return mini_program_appid;
                }

                public void setMini_program_appid(String mini_program_appid) {
                    this.mini_program_appid = mini_program_appid;
                }

                public String getMini_program_sub_appid() {
                    return mini_program_sub_appid;
                }

                public void setMini_program_sub_appid(String mini_program_sub_appid) {
                    this.mini_program_sub_appid = mini_program_sub_appid;
                }

                public List<String> getMini_program_pics() {
                    return mini_program_pics;
                }

                public void setMini_program_pics(List<String> mini_program_pics) {
                    this.mini_program_pics = mini_program_pics;
                }
            }

            public static class AppInfoDTO {
                /**
                 * app_appid : wx1234567890123456
                 * app_sub_appid : wx1234567890123456
                 * app_pics : ["string "]
                 */

                private String app_appid;
                private String app_sub_appid;
                private List<String> app_pics;

                public String getApp_appid() {
                    return app_appid;
                }

                public void setApp_appid(String app_appid) {
                    this.app_appid = app_appid;
                }

                public String getApp_sub_appid() {
                    return app_sub_appid;
                }

                public void setApp_sub_appid(String app_sub_appid) {
                    this.app_sub_appid = app_sub_appid;
                }

                public List<String> getApp_pics() {
                    return app_pics;
                }

                public void setApp_pics(List<String> app_pics) {
                    this.app_pics = app_pics;
                }
            }

            public static class WebInfoDTO {
                /**
                 * domain : http://www.qq.com
                 * web_authorisation : 47ZC6GC-vnrbEny__Ie_An5-tCpqxucuxi-vByf3Gjm7KE53JXvGy9tqZm2XAUf-4KGprrKhpVBDIUv0OF4wFNIO4kqg05InE4d2I6_H7I4
                 * web_appid : wx1234567890123456
                 */

                private String domain;
                private String web_authorisation;
                private String web_appid;

                public String getDomain() {
                    return domain;
                }

                public void setDomain(String domain) {
                    this.domain = domain;
                }

                public String getWeb_authorisation() {
                    return web_authorisation;
                }

                public void setWeb_authorisation(String web_authorisation) {
                    this.web_authorisation = web_authorisation;
                }

                public String getWeb_appid() {
                    return web_appid;
                }

                public void setWeb_appid(String web_appid) {
                    this.web_appid = web_appid;
                }
            }

            public static class WeworkInfoDTO {
                /**
                 * corp_id : wx1234567890123456
                 * sub_corp_id : wx1234567890123456
                 * wework_pics : ["string "]
                 */

                private String corp_id;
                private String sub_corp_id;
                private List<String> wework_pics;

                public String getCorp_id() {
                    return corp_id;
                }

                public void setCorp_id(String corp_id) {
                    this.corp_id = corp_id;
                }

                public String getSub_corp_id() {
                    return sub_corp_id;
                }

                public void setSub_corp_id(String sub_corp_id) {
                    this.sub_corp_id = sub_corp_id;
                }

                public List<String> getWework_pics() {
                    return wework_pics;
                }

                public void setWework_pics(List<String> wework_pics) {
                    this.wework_pics = wework_pics;
                }
            }
        }
    }

    public static class SettlementInfoDTO {
        /**
         * settlement_id : 719
         * qualification_type : 餐饮
         * qualifications : ["string "]
         * activities_id : 716
         * activities_rate : 0.6
         * activities_additions : ["string "]
         */

        private String settlement_id;
        private String qualification_type;
        private String activities_id;
        private String activities_rate;
        private List<String> qualifications;
        private List<String> activities_additions;

        public String getSettlement_id() {
            return settlement_id;
        }

        public void setSettlement_id(String settlement_id) {
            this.settlement_id = settlement_id;
        }

        public String getQualification_type() {
            return qualification_type;
        }

        public void setQualification_type(String qualification_type) {
            this.qualification_type = qualification_type;
        }

        public String getActivities_id() {
            return activities_id;
        }

        public void setActivities_id(String activities_id) {
            this.activities_id = activities_id;
        }

        public String getActivities_rate() {
            return activities_rate;
        }

        public void setActivities_rate(String activities_rate) {
            this.activities_rate = activities_rate;
        }

        public List<String> getQualifications() {
            return qualifications;
        }

        public void setQualifications(List<String> qualifications) {
            this.qualifications = qualifications;
        }

        public List<String> getActivities_additions() {
            return activities_additions;
        }

        public void setActivities_additions(List<String> activities_additions) {
            this.activities_additions = activities_additions;
        }
    }

    public static class BankAccountInfoDTO {
        /**
         * bank_account_type : BANK_ACCOUNT_TYPE_CORPORATE
         * account_name : AOZdYGISxo4y44/UgZ69bdu9X+tfMUJ9dl+LetjM45/zMbrYu+wWZ8gn4CTdo+D/m9MrPg+V4sm73oxqdQu/hj7aWyDl4GQtPXVdaztB9jV 	bVZh3QFzV+BEmytMNQp9dt1uWJktlfdDdLR3AMWyMB377xd+m9bSr/ioDTzagEcGe+vLYiKrzcroQv3OR0p3ppFYoQ3IfYeU/04S4t9rNFL+kyblK2FCCqQ11Ndb 	bHoCrJc7NV4oASq6ZFonjTtgjjgKsadIKHXtb3JZKGZjduGdtkRJJp0/0eow96uY1Pk7Rq79Jtt7+I8juwEc4P4TG5xzchG/5IL9DBd+Z0zZXkw==
         * account_bank : 工商银行
         * bank_address_code : 110000
         * bank_branch_id : 402713354941
         * bank_name : 施秉县农村信用合作联社城关信用社
         * account_number : d+xT+MQCvrLHUVDWv/8MR/dB7TkXM2YYZlokmXzFsWs35NXUot7C0NcxIrUF5FnxqCJHkNgKtxa6RxEYyba1+VBRLnqKG2fSy/Y5qDN08 	Ej9zHCwJjq52Wg1VG8MRugli9YMI1fI83KGBxhuXyemgS/hqFKsfYGiOkJqjTUpgY5VqjtL2N4l4z11T0ECB/aSyVXUysOFGLVfSrUxMPZy6jWWYGvT1+4P633f+ 	R+ki1gT4WF/2KxZOYmli385ZgVhcR30mr4/G3HBcxi13zp7FnEeOsLlvBmI1PHN4C7Rsu3WL8sPndjXTd75kPkyjqnoMRrEEaYQE8ZRGYoeorwC+w==
         */

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

    public static class AdditionInfoDTO {
        /**
         * legal_person_commitment : 47ZC6GC-vnrbEny__Ie_An5-tCpqxucuxi-vByf3Gjm7KE53JXvGy9tqZm2XAUf-4KGprrKhpVBDIUv0OF4wFNIO4kqg05InE4d2I6_H7I4
         * legal_person_video : 47ZC6GC-vnrbEny__Ie_An5-tCpqxucuxi-vByf3Gjm7KE53JXvGy9tqZm2XAUf-4KGprrKhpVBDIUv0OF4wFNIO4kqg05InE4d2I6_H7I4
         * business_addition_pics : ["string "]
         * business_addition_msg : 特殊情况，说明原因
         */

        private String legal_person_commitment;
        private String legal_person_video;
        private String business_addition_msg;
        private List<String> business_addition_pics;

        public String getLegal_person_commitment() {
            return legal_person_commitment;
        }

        public void setLegal_person_commitment(String legal_person_commitment) {
            this.legal_person_commitment = legal_person_commitment;
        }

        public String getLegal_person_video() {
            return legal_person_video;
        }

        public void setLegal_person_video(String legal_person_video) {
            this.legal_person_video = legal_person_video;
        }

        public String getBusiness_addition_msg() {
            return business_addition_msg;
        }

        public void setBusiness_addition_msg(String business_addition_msg) {
            this.business_addition_msg = business_addition_msg;
        }

        public List<String> getBusiness_addition_pics() {
            return business_addition_pics;
        }

        public void setBusiness_addition_pics(List<String> business_addition_pics) {
            this.business_addition_pics = business_addition_pics;
        }
    }
}
