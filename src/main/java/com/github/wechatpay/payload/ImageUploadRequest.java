package com.github.wechatpay.payload;

import com.github.wechatpay.common.WechatRequest;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.HttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: FZ.Dong
 * @create: 2020-03-30 12:24
 */

public class ImageUploadRequest extends WechatRequest<ImageUploadResponse> {

    private File file;

    public ImageUploadRequest() {
        super("/v3/merchant/media/upload", "POST");
    }

    @Override
    public Class<ImageUploadResponse> getResponseClass() {
        return ImageUploadResponse.class;
    }

    @Override
    public HttpEntity getHttpEntity() throws Exception {
        String fileName = file.getName();//文件名
        String fileSha256 = DigestUtils.sha256Hex(new FileInputStream(file));//文件sha256
        String meta = String.format("{\"filename\":\"%s\",\"sha256\":\"%s\"}", fileName, fileSha256);
        headers.put("Wechatpay-Media", meta);
        MultipartEntityBuilder eb = MultipartEntityBuilder
                .create().setMode(HttpMultipartMode.RFC6532)
                .setCharset(StandardCharsets.UTF_8)
                .setBoundary("boundary")
                .addTextBody("meta", meta, ContentType.APPLICATION_JSON)
                .addBinaryBody("file", file, ContentType.create("image/jpg"), fileName);
        return eb.build();
    }


    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
