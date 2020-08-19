package com.wx.retrofitcoroutinesdemo.base

suspend fun <T> BaseResponse<T>.resultSuccess(f: (t: T) -> Unit): BaseResponse<T> {
    if (this.errorCode == 0 && this.data != null) {
        f.invoke(this.data)
    }

    return this
}


fun <T> BaseResponse<T>.resultError(f: (e: ErrorVo) -> Unit): BaseResponse<T> {
    if (this.errorCode != 0) {
        f.invoke(
            ErrorVo(
                this.errorCode,
                this.errorMsg
            )
        )
    }
    return this
}