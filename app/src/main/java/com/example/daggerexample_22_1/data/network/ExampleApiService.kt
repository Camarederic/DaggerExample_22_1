package com.example.daggerexample_22_1.data.network

import android.content.Context
import android.util.Log
import com.example.daggerexample_22_1.R
import javax.inject.Inject

class ExampleApiService @Inject constructor(
    private val context: Context,
    private val timeMillis:Long
) {

    fun method() {
        Log.d("TAG", "ExampleApiService ${context.getString(R.string.app_name)} $timeMillis")
    }
}