package com.example.daggerexample_22_1.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerexample_22_1.R
import com.example.daggerexample_22_1.di.ContextModule
import com.example.daggerexample_22_1.di.DaggerApplicationComponent
import com.example.daggerexample_22_1.di.DataModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component by lazy {
        DaggerApplicationComponent.builder()
            .contextModule(ContextModule(application))
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        component.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.method()


    }
}