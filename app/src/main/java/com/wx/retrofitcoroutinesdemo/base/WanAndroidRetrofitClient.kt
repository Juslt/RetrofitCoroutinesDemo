package com.wx.retrofitcoroutinesdemo.base

import com.wx.retrofitcoroutinesdemo.api.BaseRetrofitClient
import okhttp3.OkHttpClient

object WanAndroidRetrofitClient : BaseRetrofitClient() {
    private val baseUrl = "https://wanandroid.com/"
    val service by lazy {  createService(
        WanAndroidService::class.java,
        baseUrl
    )}


    override fun handleClient(client: OkHttpClient) {
        client.newBuilder().addInterceptor(CommonInterceptor())
    }

}