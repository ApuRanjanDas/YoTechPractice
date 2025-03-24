package com.example.yotechpractice.api_roomdb_mvvm.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.yotechpractice.api_roomdb_mvvm.api.SmartphonesApiService
import com.example.yotechpractice.api_roomdb_mvvm.model.ApiModel

class SmartphonesRepository(private val smartphonesApiService: SmartphonesApiService) {

    private val smmartphoneLiveData = MutableLiveData<ApiModel>()

    val smartphones : LiveData<ApiModel>
        get() = smmartphoneLiveData

    suspend fun getSmartphones(){
        val result = smartphonesApiService.getSmartphones()
        if (result.body() != null){
            smmartphoneLiveData.postValue(result.body())
        }
    }

}