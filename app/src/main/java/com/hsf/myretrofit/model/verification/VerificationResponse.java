package com.hsf.myretrofit.model.verification;

public class VerificationResponse {
    int code;
    String msg;
    VerificationData data;

    @Override
    public String toString() {
        return "VerificationResponse{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
