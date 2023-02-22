package com.hsf.myretrofit.model.verification;

public class VerificationData {
    String verifyCode;
    String verifyCodeImgUrl;
    String verifyCodeBase64;
    String whRatio;

    @Override
    public String toString() {
        return "VerificationData{" +
                "verifyCode='" + verifyCode + '\'' +
                ", verifyCodeImgUrl='" + verifyCodeImgUrl + '\'' +
                ", verifyCodeBase64='" + verifyCodeBase64 + '\'' +
                ", whRatio='" + whRatio + '\'' +
                '}';
    }
}
