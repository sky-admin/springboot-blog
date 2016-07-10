package com.lihuanyu.blog.dto;

/**
 * Created by skyADMIN on 16/7/7.
 */
public class ErrorReporter {

    private int code;           //0:no error \ -1:unknow error \ 1:password error \ 2:no account \ 3:reg duplication \
    private String message;

    public ErrorReporter() {
    }

    public ErrorReporter(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
