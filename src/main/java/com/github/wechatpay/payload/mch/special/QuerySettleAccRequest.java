package com.github.wechatpay.payload.mch.special;

import com.github.wechatpay.apiv3.WechatRequest;
import org.apache.http.HttpEntity;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: FZ.Dong
 * @create: 2020-03-30 16:27
 */

public class QuerySettleAccRequest extends WechatRequest<QuerySettleAccReponse> {

    public QuerySettleAccRequest(String subMchid) {
        super("/v3/apply4sub/sub_merchants/" + subMchid + "/settlement", "GET");
    }

    @Override
    public Class<QuerySettleAccReponse> getResponseClass() {
        return QuerySettleAccReponse.class;
    }

    @Override
    public HttpEntity getHttpEntity() throws Exception {
        return null;
    }
}
