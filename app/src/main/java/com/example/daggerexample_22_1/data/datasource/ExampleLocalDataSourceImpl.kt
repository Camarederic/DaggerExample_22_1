package com.example.daggerexample_22_1.data.datasource

import com.example.daggerexample_22_1.data.database.ExampleDatabase
import javax.inject.Inject

class ExampleLocalDataSourceImpl @Inject constructor(
    private val database: ExampleDatabase
): ExampleLocalDataSource {

    override fun method() {
        database.method()
    }

}