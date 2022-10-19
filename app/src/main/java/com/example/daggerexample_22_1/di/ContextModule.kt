package com.example.daggerexample_22_1.di

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
class ContextModule(private val application: Application) {

    @Provides
    fun provideContext():Context{
        return application
    }
}