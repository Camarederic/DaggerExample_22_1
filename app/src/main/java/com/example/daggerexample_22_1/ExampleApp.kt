package com.example.daggerexample_22_1

import android.app.Application
import com.example.daggerexample_22_1.di.DaggerApplicationComponent

class ExampleApp : Application() {

    val component by lazy {
        DaggerApplicationComponent.factory()
            .create(this, System.currentTimeMillis())
    }
}