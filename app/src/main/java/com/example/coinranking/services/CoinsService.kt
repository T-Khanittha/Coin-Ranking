package com.example.coinranking.services

import com.example.coinranking.models.CoinsResponse
import retrofit2.Call
import retrofit2.http.GET

interface CoinsService {
    @GET("coins")
    fun getCoinsList(): Call<List<CoinsResponse>>
}