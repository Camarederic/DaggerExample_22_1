package com.example.daggerexample_22_1.data.datasource

import com.example.daggerexample_22_1.data.network.ExampleApiService
import javax.inject.Inject

class ExampleRemoteDataSourceImpl @Inject constructor(
    private val apiService: ExampleApiService
): ExampleRemoteDataSource {

    override fun method(){
        apiService.method()
    }
}