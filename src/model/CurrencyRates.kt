package com.currencyconverter.model

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import java.math.BigDecimal

@Serializable
data class CurrencyRates(
    @SerializedName("code")
    val currencyCode: String = "",
    @Contextual @SerializedName("value")
    var currencyValue: BigDecimal
)
