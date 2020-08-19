package com.wx.retrofitcoroutinesdemo.base

import com.wx.retrofitcoroutinesdemo.ArticleBean
import retrofit2.http.GET

// https://wanandroid.com/wxarticle/chapters/json
interface WanAndroidService{
    @GET("wxarticle/chapters/json")
    suspend fun getAdapters(): BaseResponse<List<ArticleBean>>
}
//interface GitHubService {
//    @GET("users/{user}/repos")
//    fun listRepos(@Path("user") user: String?): Call<List<Repo?>?>?
//}