package com.currencyconverter.util

import com.currencyconverter.model.CurrencyModel
import com.currencyconverter.model.Rates
import org.joda.time.DateTime

val baseCurrencyValueList = arrayListOf(
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

var baseCurrency = baseCurrencyValueList.random()

object CurrencyUtils {
    val currencyModelStorage = mutableListOf<CurrencyModel>()
    init {
        currencyModelStorage.clear()
        currencyModelStorage.add(CurrencyModel(DateTime.now().toString(), Rates(), baseCurrency))
    }

}