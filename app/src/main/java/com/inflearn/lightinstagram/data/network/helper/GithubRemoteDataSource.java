package com.inflearn.lightinstagram.data.network.helper;

import com.inflearn.lightinstagram.data.entity.User;
import com.inflearn.lightinstagram.data.network.RetrofitStore;
import com.inflearn.lightinstagram.data.network.api.GithubService;

import java.util.List;

import retrofit2.Callback;

public class GithubRemoteDataSource {

    private GithubService service = RetrofitStore.get().create(GithubService.class);

    public void get(Callback<List<User>> callback) {
        service.listUsers().enqueue(callback);
    }
}