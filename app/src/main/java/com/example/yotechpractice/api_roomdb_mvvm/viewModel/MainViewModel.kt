package com.example.yotechpractice.api_roomdb_mvvm.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.yotechpractice.api_roomdb_mvvm.model.ApiModel
import com.example.yotechpractice.api_roomdb_mvvm.repository.SmartphonesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val smartphonesRepository: SmartphonesRepository) : ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO){
            smartphonesRepository.getSmartphones()
        }
    }

    val smartPhonesData : LiveData<ApiModel>
        get() = smartphonesRepository.smartphones
}