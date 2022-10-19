package com.example.daggerexample_22_1.data.database

import android.content.Context
import android.util.Log
import com.example.daggerexample_22_1.R
import javax.inject.Inject

class ExampleDatabase @Inject constructor(
    private val context:Context
) {

    fun method(){
        Log.d("TAG", "ExampleDatabase ${context.getString(R.string.app_name)}" )
    }
}