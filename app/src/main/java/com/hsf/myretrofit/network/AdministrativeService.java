package com.hsf.myretrofit.network;

import com.hsf.myretrofit.model.administrative.WholeResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AdministrativeService {
    //获取全国行政区划
    @GET("address/list")
    Call<WholeResponse> getAdministrativeData(@Query("app_id") String app_id, @Query("app_secret") String app_secret);


}
