package com.currencyconverter.model


import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import java.math.BigDecimal

@Serializable
data class Rates(
    @Contextual @SerializedName("INR")
    val inr: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("CHF")
    val chf: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("HRK")
    val hrk: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("MXN")
    val mxn: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("ZAR")
    val zar: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("CNY")
    val cny: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("THB")
    val thb: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("AUD")
    val aud: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("ILS")
    val ils: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("KRW")
    val krw: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("JPY")
    val jpy: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("PLN")
    val pln: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("GBP")
    val gbp: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("IDR")
    val idr: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("HUF")
    val huf: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("PHP")
    val php: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("TRY")
    val TRY: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("RUB")
    val rub: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("HKD")
    val hkd: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("ISK")
    val isk: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("EUR")
    val eur: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("DKK")
    val dkk: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("CAD")
    val cad: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("MYR")
    val myr: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("USD")
    val usd: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("BGN")
    val bgn: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("NOK")
    val nok: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("RON")
    val ron: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("SGD")
    val sgd: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("CZK")
    val czk: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("SEK")
    val sek: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("NZD")
    val nzd: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN),
    @Contextual @SerializedName("BRL")
    val brl: BigDecimal = BigDecimal(Math.random()).times(BigDecimal(100)).setScale(2, BigDecimal.ROUND_HALF_EVEN)
)