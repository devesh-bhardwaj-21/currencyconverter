package com.currencyconverter.util

import com.currencyconverter.model.CurrencyModel
import com.currencyconverter.model.Rates
import com.currencyconverter.util.StorageUtils.getCurrencyList
import org.joda.time.DateTime

val baseCurrencyValueList = listOf(
    "USD",
    "EUR",
    "CHF",
    "HRK",
    "MXN",
    "ZAR",
    "CNY",
    "THB",
    "AUD",
    "ILS",
    "KRW",
    "JPY",
    "PLN",
    "GBP",
    "IDR",
    "HUF",
    "PHP",
    "TRY",
    "RUB",
    "HKD",
    "ISK",
    "DKK",
    "CAD",
    "MYR",
    "BGN",
    "NOK",
    "RON",
    "SGD",
    "CZK",
    "SEK",
    "NZD",
    "BRL",
    "INR"
)

object CurrencyUtils {

    fun getCurrencies(base: String) : CurrencyModel {
        return CurrencyModel(DateTime.now().toString(), getCurrencyList(), base)
    }

}