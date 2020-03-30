package com.github.wechatpay.payload;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:09
 */


public class UboInfo {

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
