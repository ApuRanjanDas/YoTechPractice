package com.example.yotechpractice.api_roomdb_mvvm.api

import com.example.yotechpractice.api_roomdb_mvvm.model.ApiModel
import retrofit2.Response
import retrofit2.http.GET

interface SmartphonesApiService {

    @GET("/objects")
    suspend fun getSmartphones() : Response<ApiModel>
}