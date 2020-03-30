package com.github.wechatpay.payload;

import java.util.List;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:16
 */

public class MiniProgramInfo {

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
