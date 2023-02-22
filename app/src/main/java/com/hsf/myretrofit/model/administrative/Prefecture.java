package com.hsf.myretrofit.model.administrative;

import java.util.List;

/**
 * 地级行政区
 */
public class Prefecture {
    String code;
    String name;
    List<County> cchilds;

    @Override
    public String toString() {
        return "Prefecture{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", cchilds=" + cchilds +
                '}';
    }
}
