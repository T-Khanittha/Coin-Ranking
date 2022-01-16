package com.example.coinranking.models

import com.google.gson.annotations.SerializedName

data class CoinResponse(
    @SerializedName("status") val status: String,
    @SerializedName("data") val data: List<Coin>,
)

data class Coin(
    @SerializedName("name") val name: String,
    @SerializedName("iconUrl") val iconUrl: String,
    @SerializedName("description") val description: String,
)