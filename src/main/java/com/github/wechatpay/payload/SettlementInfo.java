package com.github.wechatpay.payload;

import java.util.List;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: dong
 * @create: 2020-03-17 17:13
 */

public class SettlementInfo {

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
