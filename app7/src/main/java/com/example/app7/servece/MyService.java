package com.example.app7.servece;

import com.example.app7.Bean;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2017/12/30/030.
 */

public interface MyService {
    @GET("umIPmfS6c83237d9c70c7c9510c9b0f97171a308d13b611?uri=homepage")
    Call<Bean> getBean();
}
