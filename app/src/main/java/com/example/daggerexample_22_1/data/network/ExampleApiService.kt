package com.example.daggerexample_22_1.data.network

import android.util.Log
import javax.inject.Inject

class ExampleApiService @Inject constructor() {

    fun method(){
        Log.d("TAG", "ExampleApiService")
    }
}