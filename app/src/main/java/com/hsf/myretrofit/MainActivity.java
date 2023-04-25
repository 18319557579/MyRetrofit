package com.hsf.myretrofit;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.hsf.myretrofit.databinding.ActivityMainBinding;
import com.hsf.myretrofit.model.administrative.WholeResponse;
import com.hsf.myretrofit.model.verification.VerificationResponse;
import com.hsf.myretrofit.network.AdministrativeService;
import com.hsf.myretrofit.network.ServiceCreator;
import com.hsf.myretrofit.network.VerificationService;
import com.hsf.myretrofit.okhttp.OkHttpActivity;
import com.hsf.myretrofit.util.MyUtil;
import com.hsf.myretrofit.view_binding.BaseActivity;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends BaseActivity<ActivityMainBinding> {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding.btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AdministrativeService administrativeService = ServiceCreator.INSTANCE.create(AdministrativeService.class);
                administrativeService.getAdministrativeData(ServiceCreator.APP_ID, ServiceCreator.APP_SECRET).enqueue(new Callback<WholeResponse>() {
                    @Override
                    public void onResponse(Call<WholeResponse> call, Response<WholeResponse> response) {
                        MyUtil.largeLog("Daisy", "获得结果 " + call + " / " + response.body());
                    }

                    @Override
                    public void onFailure(Call<WholeResponse> call, Throwable t) {
                        Log.d("Daisy", "获得结果 " + call + " / " + t);
                    }
                });
            }
        });

        binding.btnGetVerification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VerificationService verificationService = ServiceCreator.INSTANCE.create(VerificationService.class);
                verificationService.getVerification(ServiceCreator.APP_ID, ServiceCreator.APP_SECRET, "6", "0")
                        .enqueue(new Callback<VerificationResponse>() {
                            @Override
                            public void onResponse(Call<VerificationResponse> call, Response<VerificationResponse> response) {
                                Log.d("Daisy", "获得结果 " + " / " + response.body());
                            }

                            @Override
                            public void onFailure(Call<VerificationResponse> call, Throwable t) {
                                Log.d("Daisy", "出错了 " + call + " / " + t);
                            }
                        });
            }
        });

        binding.btn111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, OkHttpActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected ActivityMainBinding getViewBinding() {
        return ActivityMainBinding.inflate(getLayoutInflater());
    }
}