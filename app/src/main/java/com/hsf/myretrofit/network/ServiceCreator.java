package com.hsf.myretrofit.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public enum ServiceCreator {
    INSTANCE;

    public static String APP_ID = "okigjumztesciryt";
    public static String APP_SECRET = "QVlhTjJudmYwbFRXNFRyRDcyM3Fodz09";

    private final String BASE_URL = "https://www.mxnzp.com/api/";

    private final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public <T> T create(Class<T> serviceClass) {
        return retrofit.create(serviceClass);
    }
}
