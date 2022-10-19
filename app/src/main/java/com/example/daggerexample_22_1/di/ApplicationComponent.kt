package com.example.daggerexample_22_1.di

import com.example.daggerexample_22_1.presentation.MainActivity
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class, ContextModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
}