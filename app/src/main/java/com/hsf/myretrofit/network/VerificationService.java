package com.hsf.myretrofit.network;

import com.hsf.myretrofit.model.verification.VerificationResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface VerificationService {

    @GET("verifycode/code")
    Call<VerificationResponse> getVerification(@Query("app_id") String app_id, @Query("app_secret") String app_secret,
                                               @Query("len") String codeLength, @Query("type") String type);
}
