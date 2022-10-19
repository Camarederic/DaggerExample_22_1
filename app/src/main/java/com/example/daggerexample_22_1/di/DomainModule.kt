package com.example.daggerexample_22_1.di

import com.example.daggerexample_22_1.data.repository.ExampleRepositoryImpl
import com.example.daggerexample_22_1.domain.ExampleRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DomainModule {

    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
}