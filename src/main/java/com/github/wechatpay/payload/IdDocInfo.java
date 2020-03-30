package com.github.wechatpay.payload;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:10
 */

public class IdDocInfo {

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
