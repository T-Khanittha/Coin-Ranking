package com.example.coinranking.models

import com.google.gson.annotations.SerializedName

data class CoinsResponse(
    @SerializedName("status") val status: String,
    @SerializedName("data") val data: ArrayList<Coins>,
)

data class Coins(
    @SerializedName("coins") val coins: ArrayList<CoinUUID>,
)

data class CoinUUID(
    @SerializedName("uuid") val uuid: String,
)
