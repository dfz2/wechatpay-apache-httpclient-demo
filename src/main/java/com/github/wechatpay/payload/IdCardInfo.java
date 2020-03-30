package com.github.wechatpay.payload;


/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:09
 */

public class IdCardInfo {
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
