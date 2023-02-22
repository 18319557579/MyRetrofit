package com.hsf.myretrofit.model.administrative;

import java.util.List;

/**
 * 省级行政区
 */
public class Province {
    String code;
    String name;
    List<Prefecture> pchilds;

    @Override
    public String toString() {
        return "Province{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", pchilds=" + pchilds +
                '}';
    }
}
