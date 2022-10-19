package com.example.daggerexample_22_1.data.database

import android.util.Log
import javax.inject.Inject

class ExampleDatabase @Inject constructor() {

    fun method(){
        Log.d("TAG", "ExampleDatabase")
    }
}