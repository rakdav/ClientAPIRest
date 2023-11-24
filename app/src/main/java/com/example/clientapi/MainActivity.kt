package com.example.clientapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.clientapi.API.Common
import com.example.clientapi.API.RetrofitClient
import com.example.clientapi.model.Product
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val call = Common.retrofitService.listProducts()
        if (call != null) {
            call.enqueue(object: Callback<List<Product?>?> {
                override fun onResponse(
                    call: Call<List<Product?>?>,
                    response: Response<List<Product?>?>
                )
                {
                    var products=response?.body()
                    var i=9
                }

                override fun onFailure(call: Call<List<Product?>?>, t: Throwable) {
                    Log.d("you",t.message.toString())
                }

            })
        }
    }
}