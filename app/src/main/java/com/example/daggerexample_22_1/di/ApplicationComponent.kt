package com.example.daggerexample_22_1.di

import android.content.Context
import com.example.daggerexample_22_1.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    @Component.Builder
    interface ApplicationComponentBuilder{

        @BindsInstance
        fun context(context: Context): ApplicationComponentBuilder

        @BindsInstance
        fun timeMillis(timeMillis:Long): ApplicationComponentBuilder

        fun build(): ApplicationComponent


    }
}