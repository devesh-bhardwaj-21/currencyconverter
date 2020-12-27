package com.currencyconverter.model


import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class CurrencyModel(
    @SerializedName("date")
    val date: String = "",
    @SerializedName("rates")
    val rates: Rates,
    @SerializedName("base")
    val base: String = ""
)