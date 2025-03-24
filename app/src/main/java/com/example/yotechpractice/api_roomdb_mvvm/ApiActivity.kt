package com.example.yotechpractice.api_roomdb_mvvm

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.yotechpractice.R
import com.example.yotechpractice.api_roomdb_mvvm.api.RetrofitHelper
import com.example.yotechpractice.api_roomdb_mvvm.api.SmartphonesApiService
import com.example.yotechpractice.api_roomdb_mvvm.repository.SmartphonesRepository
import com.example.yotechpractice.api_roomdb_mvvm.viewModel.MainViewModel
import com.example.yotechpractice.api_roomdb_mvvm.viewModel.MainViewModelFactory

class ApiActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_api)

        val smartphonesApiService = RetrofitHelper.getInstance().create(SmartphonesApiService::class.java)
        val smartphonesRepository = SmartphonesRepository(smartphonesApiService)

        mainViewModel = ViewModelProvider(this, MainViewModelFactory(smartphonesRepository)).get(MainViewModel::class.java)

        mainViewModel.smartPhonesData.observe(this) {
            Log.d("oncreate", "onCreate: api_mvvm------>$it")
        }
    }
}