package com.example.yotechpractice.retrofitapicall;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("lan-communication/config/create")
    Call<List<userModel>> getUsers();
}
