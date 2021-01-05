package com.currencyconverter


import com.currencyconverter.route.registerCurrencyRoutes
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.gson.*
import io.ktor.serialization.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {

    install(CORS) {
        anyHost()
    }

    install(ContentNegotiation) {
        gson()
    }
    registerCurrencyRoutes()
}


