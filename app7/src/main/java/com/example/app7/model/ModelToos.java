package com.example.app7.model;

import com.example.app7.Bean;
import com.example.app7.net.Api;
import com.example.app7.servece.MyService;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2017/12/30/030.
 */

public class ModelToos implements ModelPort {
    private OnFinish onFinish;

    public ModelToos(OnFinish onFinish) {
        this.onFinish = onFinish;
    }
    @Override
    public void getUser() {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(Api.uri)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        MyService service=retrofit.create(MyService.class);
        service.getBean().enqueue(new Callback<Bean>() {
            @Override
            public void onResponse(Call<Bean> call, Response<Bean> response) {
                Bean bean=response.body();
                onFinish.finish(bean);
            }
            @Override
            public void onFailure(Call<Bean> call, Throwable t) {
            }
        });
    }
    public interface OnFinish{
        public void finish(Bean bean);
    }
}
