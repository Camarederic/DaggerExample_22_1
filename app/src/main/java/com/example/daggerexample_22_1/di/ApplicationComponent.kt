package com.example.daggerexample_22_1.di

import android.content.Context
import com.example.daggerexample_22_1.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    @Component.Factory
    interface ApplicationComponentFactory{

        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ): ApplicationComponent

    }
}