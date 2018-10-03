package com.inflearn.lightinstagram.data.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitStore {

    private static final String GITHUB_API = "https://api.github.com/";

    private static Retrofit retrofit;

    public synchronized static Retrofit get() {
        if (retrofit != null) return retrofit;

        retrofit = new Retrofit.Builder()
                .baseUrl(GITHUB_API)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }
}