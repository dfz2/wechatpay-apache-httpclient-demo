# wechatpay-apache-httpclient-demo
微信支付apiv3上传文件测试

```
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

```