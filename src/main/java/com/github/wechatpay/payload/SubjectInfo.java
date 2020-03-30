package com.github.wechatpay.payload;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:05
 */

public class SubjectInfo {

    private String subject_type;
    private BusinessLicenseInfo business_license_info;
    private CertificateInfo certificate_info;
    private OrganizationInfo organization_info;
    private String certificate_letter_copy;
    private MicroBizInfo micro_biz_info;
    private IdentityInfo identity_info;
    private UboInfo ubo_info;

    public String getSubject_type() {
        return subject_type;
    }

    public void setSubject_type(String subject_type) {
        this.subject_type = subject_type;
    }

    public BusinessLicenseInfo getBusiness_license_info() {
        return business_license_info;
    }

    public void setBusiness_license_info(BusinessLicenseInfo business_license_info) {
        this.business_license_info = business_license_info;
    }

    public CertificateInfo getCertificate_info() {
        return certificate_info;
    }

    public void setCertificate_info(CertificateInfo certificate_info) {
        this.certificate_info = certificate_info;
    }

    public OrganizationInfo getOrganization_info() {
        return organization_info;
    }

    public void setOrganization_info(OrganizationInfo organization_info) {
        this.organization_info = organization_info;
    }

    public String getCertificate_letter_copy() {
        return certificate_letter_copy;
    }

    public void setCertificate_letter_copy(String certificate_letter_copy) {
        this.certificate_letter_copy = certificate_letter_copy;
    }

    public MicroBizInfo getMicro_biz_info() {
        return micro_biz_info;
    }

    public void setMicro_biz_info(MicroBizInfo micro_biz_info) {
        this.micro_biz_info = micro_biz_info;
    }

    public IdentityInfo getIdentity_info() {
        return identity_info;
    }

    public void setIdentity_info(IdentityInfo identity_info) {
        this.identity_info = identity_info;
    }

    public UboInfo getUbo_info() {
        return ubo_info;
    }

    public void setUbo_info(UboInfo ubo_info) {
        this.ubo_info = ubo_info;
    }
}
