package com.example.coinranking.services

import com.example.coinranking.models.CoinResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinService {
    @GET("coin/{uuid}")
    fun getCoinList(@Path("uuid") uuid: String): Call<List<CoinResponse>>
}