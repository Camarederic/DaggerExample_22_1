package com.example.daggerexample_22_1.presentation

import com.example.daggerexample_22_1.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase()
    }
}