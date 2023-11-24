package com.example.clientapi.API

import com.example.clientapi.model.Product
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path


interface APIProject
{
    @GET("products")
    fun listProducts(): Call<List<Product?>?>?
    @GET("products/{id}")
    fun getProductById(@Path("id") id:Int):Call<Product>
    @POST("products/create")
    fun createProduct(@Body product: Product?): Call<Product?>?
    @PUT("products/update/{id}")
    fun updateProduct(@Body product: Product?): Call<Product?>?
    @DELETE("products/update/{id}")
    fun deleteProduct(@Path("id") id:Int):Call<Product>
}