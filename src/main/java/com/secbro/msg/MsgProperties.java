package com.secbro.msg;
/**
 * @Description: ${todo}
 * @author wll
 * @date 2020/7/4 15:28
 */

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 **/
@ConfigurationProperties(prefix = "msg")
public class MsgProperties {
    /**
    *访问发送短信的url地址
    */
    private String url;

    /**
     *短信服务提供商提供的请求keyId
     */
    private String accessKeyId;

    /**
     *短信服务商提供的keySecret
    */
    private String accessKeySecret;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }
}
