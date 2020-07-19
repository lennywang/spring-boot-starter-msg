package com.secbro.msg;
/**
 * @Description: ${todo}
 * @author wll
 * @date 2020/7/4 15:21
 */


import com.secbro.utils.HttpClientUtils;

/**
 *
 **/
public class MsgService {

    private String url;

    private String accessKeyId;

    private String accessKeySecret;

    public MsgService(String url, String accessKeyId, String accessKeySecret) {
        this.url = url;
        this.accessKeyId = accessKeyId;
        this.accessKeySecret = accessKeySecret;
    }

    public int sendMsg(String msg) {
        return HttpClientUtils.sendMsg(url, accessKeyId, accessKeySecret, msg);
    }

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
