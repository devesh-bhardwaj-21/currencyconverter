package com.currencyconverter.model


import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class CurrencyModel(
    @SerializedName("date")
    val date: String = "",
    @SerializedName("rates")
     val rates: List<CurrencyRates>,
    @SerializedName("base")
    val base: String = ""
)