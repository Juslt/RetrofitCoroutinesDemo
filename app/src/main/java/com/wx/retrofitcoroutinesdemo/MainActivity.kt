package com.wx.retrofitcoroutinesdemo

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.wx.retrofitcoroutinesdemo.base.resultError
import com.wx.retrofitcoroutinesdemo.base.resultSuccess
import com.wx.retrofitcoroutinesdemo.repo.WanRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch(Dispatchers.Main){
              WanRepo.getArticles().resultSuccess {
                    Log.e("===",it.toString())
                    Toast.makeText(this@MainActivity, it.toString(), Toast.LENGTH_SHORT).show()
                }.resultError {
                    Toast.makeText(this@MainActivity, it.toString(), Toast.LENGTH_SHORT).show()
                }
            }
        }

//        https://wanandroid.com/wxarticle/chapters/json
//方法： GET
}