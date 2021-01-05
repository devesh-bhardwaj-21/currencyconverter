package com.currencyconverter.util

import com.currencyconverter.model.CurrencyModel
import com.currencyconverter.model.CurrencyRates
import com.currencyconverter.model.Rates
import java.math.BigDecimal

object StorageUtils {

    fun convertCurrencyToMap(rates: Rates): HashMap<String, BigDecimal> {
        val uiCurrencyRateMap = hashMapOf<String, BigDecimal>()
        uiCurrencyRateMap[Constants.CURRENCY_CODE_USD] = rates.usd
        uiCurrencyRateMap[Constants.CURRENCY_CODE_EUR] = rates.eur
        uiCurrencyRateMap[Constants.CURRENCY_CODE_CHF] = rates.chf
        uiCurrencyRateMap[Constants.CURRENCY_CODE_HRK] = rates.hrk
        uiCurrencyRateMap[Constants.CURRENCY_CODE_MXN] = rates.mxn
        uiCurrencyRateMap[Constants.CURRENCY_CODE_ZAR] = rates.zar
        uiCurrencyRateMap[Constants.CURRENCY_CODE_CNY] = rates.cny
        uiCurrencyRateMap[Constants.CURRENCY_CODE_THB] = rates.thb
        uiCurrencyRateMap[Constants.CURRENCY_CODE_AUD] = rates.aud
        uiCurrencyRateMap[Constants.CURRENCY_CODE_ILS] = rates.ils
        uiCurrencyRateMap[Constants.CURRENCY_CODE_KRW] = rates.krw
        uiCurrencyRateMap[Constants.CURRENCY_CODE_JPY] = rates.jpy
        uiCurrencyRateMap[Constants.CURRENCY_CODE_PLN] = rates.pln
        uiCurrencyRateMap[Constants.CURRENCY_CODE_GBP] = rates.gbp
        uiCurrencyRateMap[Constants.CURRENCY_CODE_IDR] = rates.idr
        uiCurrencyRateMap[Constants.CURRENCY_CODE_HUF] = rates.huf
        uiCurrencyRateMap[Constants.CURRENCY_CODE_PHP] = rates.php
        uiCurrencyRateMap[Constants.CURRENCY_CODE_TRY] = rates.TRY
        uiCurrencyRateMap[Constants.CURRENCY_CODE_RUB] = rates.rub
        uiCurrencyRateMap[Constants.CURRENCY_CODE_HKD] = rates.hkd
        uiCurrencyRateMap[Constants.CURRENCY_CODE_ISK] = rates.isk
        uiCurrencyRateMap[Constants.CURRENCY_CODE_DKK] = rates.dkk
        uiCurrencyRateMap[Constants.CURRENCY_CODE_CAD] = rates.cad
        uiCurrencyRateMap[Constants.CURRENCY_CODE_MYR] = rates.myr
        uiCurrencyRateMap[Constants.CURRENCY_CODE_BGN] = rates.bgn
        uiCurrencyRateMap[Constants.CURRENCY_CODE_NOK] = rates.nok
        uiCurrencyRateMap[Constants.CURRENCY_CODE_RON] = rates.ron
        uiCurrencyRateMap[Constants.CURRENCY_CODE_SGD] = rates.sgd
        uiCurrencyRateMap[Constants.CURRENCY_CODE_CZK] = rates.czk
        uiCurrencyRateMap[Constants.CURRENCY_CODE_SEK] = rates.sek
        uiCurrencyRateMap[Constants.CURRENCY_CODE_NZD] = rates.nzd
        uiCurrencyRateMap[Constants.CURRENCY_CODE_BRL] = rates.brl
        return uiCurrencyRateMap
    }

    fun getCurrencyList(): List<CurrencyRates> {
        val currencyList = mutableListOf<CurrencyRates>()
        val currencyRateMap = convertCurrencyToMap(Rates())
        currencyRateMap.forEach { (key, value) ->
            currencyList.add(
                CurrencyRates(
                    key,
                    currencyRateMap.getValue(key)
                )
            )
        }
        return currencyList
    }

}