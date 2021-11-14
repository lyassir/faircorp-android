package com.faircorp.service

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ApiServices {
    val windowsApiService : WindowApiService by lazy {
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl("https://yassirlairgi.cleverapps.io/api/")
            .build()
            .create(WindowApiService::class.java)
    }

    val roomsApiService : RoomApiService by lazy {
        Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl("https://yassirlairgi.cleverapps.io/api/")
            .build()
            .create(RoomApiService::class.java)
    }
}