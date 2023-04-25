package com.hsf.myretrofit.okhttp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.hsf.myretrofit.R;
import com.hsf.myretrofit.databinding.ActivityOkHttpBinding;
import com.hsf.myretrofit.view_binding.BaseActivity;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OkHttpActivity extends BaseActivity<ActivityOkHttpBinding> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding.btnOkhttp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            OkHttpClient client = new OkHttpClient();
                            Request request = new Request.Builder()
                                    .url("https://www.mxnzp.com/api/verifycode/code?len=4&type=0&app_id=okigjumztesciryt&app_secret=QVlhTjJudmYwbFRXNFRyRDcyM3Fodz09")
                                    .build();
                            okhttp3.Response response = client.newCall(request).execute();
                            String responseData = response.body().string();
                            Log.d("Daisy", "内容：" + responseData);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        });

        binding.btnOkhttp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    OkHttpClient client = new OkHttpClient();
                    RequestBody requestBody = new FormBody.Builder()
                            .add("len","6")
                            .add("type","0")
                            .add("app_id", "okigjumztesciryt")
                            .add("app_secret", "QVlhTjJudmYwbFRXNFRyRDcyM3Fodz09")
                            .build();

                    Request request = new Request.Builder()
                            .url("https://www.mxnzp.com/api/verifycode/code")
                            .post(requestBody)
                            .build();
                    client.newCall(request).enqueue(new Callback() {
                        @Override
                        public void onFailure(Call call, IOException e) {
                            Log.d("Daisy", "有问题：" + e);
                        }

                        @Override
                        public void onResponse(Call call, Response response) throws IOException {
                            String responseData = response.body().string();
                            Log.d("Daisy", "内容2：" + responseData);
                        }
                    });


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    protected ActivityOkHttpBinding getViewBinding() {
        return ActivityOkHttpBinding.inflate(getLayoutInflater());
    }
}