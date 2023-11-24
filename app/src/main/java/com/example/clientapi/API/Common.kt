package com.example.clientapi.API

object Common
{
    private val BASE_URL = "http://192.168.1.71:8080/"
    val retrofitService: APIProject
        get() = RetrofitClient.getClient(BASE_URL).
        create(APIProject::class.java)
}