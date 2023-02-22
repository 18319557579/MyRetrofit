package com.hsf.myretrofit.model.administrative;

import java.util.List;

/**
 * 返回总的数据结构
 */
public class WholeResponse {
    int code;
    String msg;
    List<Province> data;

    @Override
    public String toString() {
        return "WholeResponse{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
