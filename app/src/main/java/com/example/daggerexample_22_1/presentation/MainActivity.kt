package com.example.daggerexample_22_1.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.daggerexample_22_1.ExampleApp
import com.example.daggerexample_22_1.R
import com.example.daggerexample_22_1.data.database.ExampleDatabase
import com.example.daggerexample_22_1.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component by lazy {
        (application as ExampleApp).component
    }





    override fun onCreate(savedInstanceState: Bundle?) {

        component.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()


    }
}