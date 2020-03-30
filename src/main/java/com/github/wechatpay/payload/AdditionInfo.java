package com.github.wechatpay.payload;

import java.util.List;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:14
 */

public class AdditionInfo {

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
