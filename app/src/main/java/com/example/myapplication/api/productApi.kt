package com.example.myapplication.api

import com.example.myapplication.model.Product
import retrofit2.Call
import retrofit2.http.GET

interface productApi {
    @GET("getdata.php")
    fun getProductApi():Call<List<Product>>
}