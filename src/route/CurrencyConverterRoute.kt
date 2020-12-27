package com.currencyconverter.route

import com.currencyconverter.util.CurrencyUtils.currencyModelStorage
import com.currencyconverter.util.baseCurrency
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
    route("/currency") {
        get("{base}") {
            val base = call.parameters["base"] ?: return@get call.respondText(
                "Missing or malformed input",
                status = HttpStatusCode.BadRequest
            )
            val currency =
                currencyModelStorage.find { it.base == base }.also { currencyModelStorage }.also { baseCurrency = base } ?: return@get call.respondText(
                    "No currency with base $base",
                    status = HttpStatusCode.NotFound
                )
            if (currencyModelStorage.isNotEmpty()) {
                call.respond(currency)
            } else {
                call.respondText("No customers found", status = HttpStatusCode.NotFound)
            }
        }
    }
}
