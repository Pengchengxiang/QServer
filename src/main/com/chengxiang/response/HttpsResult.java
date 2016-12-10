package main.com.chengxiang.response;

import java.io.Serializable;

/**
 * Created by chengxiang.peng on 2016/11/4.
 */
public class HttpsResult implements Serializable{
    private String code;
    private String message;

    public HttpsResult() {
    }

    public HttpsResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
