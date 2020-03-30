package com.github.wechatpay.payload;

import java.util.List;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:15
 */

public class SalesInfo {

    private BizStoreInfo biz_store_info;
    private MpInfo mp_info;
    private MiniProgramInfo mini_program_info;
    private AppInfo app_info;
    private WebInfo web_info;
    private WeworkInfo wework_info;
    private List<String> sales_scenes_type;


    public BizStoreInfo getBiz_store_info() {
        return biz_store_info;
    }

    public void setBiz_store_info(BizStoreInfo biz_store_info) {
        this.biz_store_info = biz_store_info;
    }

    public MpInfo getMp_info() {
        return mp_info;
    }

    public void setMp_info(MpInfo mp_info) {
        this.mp_info = mp_info;
    }

    public MiniProgramInfo getMini_program_info() {
        return mini_program_info;
    }

    public void setMini_program_info(MiniProgramInfo mini_program_info) {
        this.mini_program_info = mini_program_info;
    }

    public AppInfo getApp_info() {
        return app_info;
    }

    public void setApp_info(AppInfo app_info) {
        this.app_info = app_info;
    }

    public WebInfo getWeb_info() {
        return web_info;
    }

    public void setWeb_info(WebInfo web_info) {
        this.web_info = web_info;
    }

    public WeworkInfo getWework_info() {
        return wework_info;
    }

    public void setWework_info(WeworkInfo wework_info) {
        this.wework_info = wework_info;
    }

    public List<String> getSales_scenes_type() {
        return sales_scenes_type;
    }

    public void setSales_scenes_type(List<String> sales_scenes_type) {
        this.sales_scenes_type = sales_scenes_type;
    }
}
