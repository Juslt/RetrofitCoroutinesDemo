package com.wx.retrofitcoroutinesdemo.base

data class ErrorVo(
    val code: Int,
    val msg: String
)


data class BaseResponse<T>(
    val errorCode:Int,
    val errorMsg:String,
    val data:T?
)