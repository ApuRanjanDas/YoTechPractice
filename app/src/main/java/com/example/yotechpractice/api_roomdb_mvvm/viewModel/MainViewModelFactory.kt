package com.example.yotechpractice.api_roomdb_mvvm.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.yotechpractice.api_roomdb_mvvm.repository.SmartphonesRepository

class MainViewModelFactory(private val smartphonesRepository: SmartphonesRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(smartphonesRepository) as T
//        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
//            return MainViewModel(smartphonesRepository) as T
//        }
//        throw IllegalArgumentException("Unknown ViewModel class")
    }
}