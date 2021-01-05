package com.currencyconverter.route

import com.currencyconverter.util.CurrencyUtils.getCurrencies
import com.currencyconverter.util.baseCurrencyValueList
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*


fun Application.registerCurrencyRoutes() {
    routing {
        currencyRouting()
    }
}

fun Route.currencyRouting() {
    get("/currency/{base}") {
        val base = call.parameters["base"] ?: return@get call.respondText(
            "Missing or malformed input",
            status = HttpStatusCode.BadRequest
        )
        val currency = if (baseCurrencyValueList.contains(base)) getCurrencies(base) else
            return@get call.respondText(
                "No currency with base $base",
                status = HttpStatusCode.NotFound
            )
        call.respond(currency)
    }

    get ("/currency") {
        call.respond(getCurrencies("USD"))
    }
}
