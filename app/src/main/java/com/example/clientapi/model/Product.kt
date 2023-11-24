package com.example.clientapi.model

data class Product(
    val id: Long,
    val title: String,
    val description: String,
    val price: Int,
    val city: String,
    val author: String
)