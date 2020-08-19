package com.wx.retrofitcoroutinesdemo.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

abstract class BaseRetrofitClient {
    private val client = OkHttpClient().newBuilder()
        .addInterceptor(HttpLoggingInterceptor()).build()

    abstract fun handleClient(client: OkHttpClient)

    protected fun <T> createService(cClass: Class<T>, url: String): T {
        handleClient(client)

        val retrofit = Retrofit.Builder()
            .baseUrl(url)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(cClass)
    }
}