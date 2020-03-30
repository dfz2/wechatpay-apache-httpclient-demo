package com.github.wechatpay.payload;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:08
 */

public class IdentityInfo {

    private String id_doc_type;
    private IdCardInfo id_card_info;
    private IdDocInfo id_doc_info;
    private String owner;


    public String getId_doc_type() {
        return id_doc_type;
    }

    public void setId_doc_type(String id_doc_type) {
        this.id_doc_type = id_doc_type;
    }

    public IdCardInfo getId_card_info() {
        return id_card_info;
    }

    public void setId_card_info(IdCardInfo id_card_info) {
        this.id_card_info = id_card_info;
    }

    public IdDocInfo getId_doc_info() {
        return id_doc_info;
    }

    public void setId_doc_info(IdDocInfo id_doc_info) {
        this.id_doc_info = id_doc_info;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
