package com.wx.retrofitcoroutinesdemo.repo

import com.wx.retrofitcoroutinesdemo.ArticleBean
import com.wx.retrofitcoroutinesdemo.base.BaseRepo
import com.wx.retrofitcoroutinesdemo.base.WanAndroidRetrofitClient
import com.wx.retrofitcoroutinesdemo.base.BaseResponse

object WanRepo : BaseRepo(){
    suspend fun getArticles(): BaseResponse<List<ArticleBean>> {
        return safeApi { WanAndroidRetrofitClient.service.getAdapters() }
    }
}