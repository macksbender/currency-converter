package com.macksbender.currencyconverter.main

import com.macksbender.currencyconverter.data.models.CurrencyResponse
import com.macksbender.currencyconverter.util.Resource

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>
}