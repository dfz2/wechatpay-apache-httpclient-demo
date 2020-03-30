package com.github.wechatpay.payload;

import com.github.wechatpay.apiv3.WechatRequest;
import org.apache.http.HttpEntity;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: FZ.Dong
 * @create: 2020-03-30 16:19
 */

public class QueryApplymentRequest extends WechatRequest<QueryApplymentResponse> {

    public QueryApplymentRequest(String applymentId, String businessCode) {
        super("", "GET");
        if (applymentId != null) {
            setUrlSuffix("/v3/applyment4sub/applyment/applyment_id/" + applymentId);
        } else {
            setUrlSuffix("/v3/applyment4sub/applyment/business_code/" + businessCode);
        }
    }

    @Override
    public Class<QueryApplymentResponse> getResponseClass() {
        return QueryApplymentResponse.class;
    }

    @Override
    public HttpEntity getHttpEntity() throws Exception {
        return null;
    }
}
