package com.example.daggerexample_22_1.data.repository

import com.example.daggerexample_22_1.data.datasource.ExampleLocalDataSource
import com.example.daggerexample_22_1.data.datasource.ExampleRemoteDataSource
import com.example.daggerexample_22_1.data.mapper.ExampleMapper
import com.example.daggerexample_22_1.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}