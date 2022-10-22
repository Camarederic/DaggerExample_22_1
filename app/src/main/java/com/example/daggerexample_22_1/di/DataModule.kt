package com.example.daggerexample_22_1.di

import android.content.Context
import com.example.daggerexample_22_1.data.datasource.ExampleLocalDataSource
import com.example.daggerexample_22_1.data.datasource.ExampleLocalDataSourceImpl
import com.example.daggerexample_22_1.data.datasource.ExampleRemoteDataSource
import com.example.daggerexample_22_1.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {


    @ApplicationScope
    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ApplicationScope
    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}