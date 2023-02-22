package com.hsf.myretrofit.model.administrative;

/**
 * 县级行政区
 */
public class County {
    String code;
    String name;

    @Override
    public String toString() {
        return "County{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
