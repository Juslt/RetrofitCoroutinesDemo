package com.wx.retrofitcoroutinesdemo.base

import java.lang.Exception

open class BaseRepo {
    suspend fun <T> safeApi(f: suspend () -> BaseResponse<T>): BaseResponse<T> {
        return try {
            f()
        } catch (e: Exception) {
            BaseResponse(-2000, "网络错误", null)
        }
    }
}