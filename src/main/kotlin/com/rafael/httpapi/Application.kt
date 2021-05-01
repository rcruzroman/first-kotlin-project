package com.rafael.httpapi

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.serialization.*
import registerCustomerRoutes
import registerOrderRoutes


fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
  install(ContentNegotiation) {
    json()
  }
  registerCustomerRoutes()
  registerOrderRoutes()
}
