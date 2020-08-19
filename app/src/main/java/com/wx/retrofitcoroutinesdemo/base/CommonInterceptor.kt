package com.wx.retrofitcoroutinesdemo.base

import okhttp3.Interceptor
import okhttp3.Response

class CommonInterceptor :Interceptor{
    override fun intercept(chain: Interceptor.Chain): Response {
        val oldRequest = chain.request()

        val httpUrlBuilder = oldRequest.url.newBuilder()
            .addQueryParameter("key", "value")

        val newRequest = oldRequest.newBuilder()
            .addHeader("authority","value")
            .url(httpUrlBuilder.build())
            .build()

        return chain.proceed(newRequest)
    }

}