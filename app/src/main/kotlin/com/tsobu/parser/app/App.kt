package com.tsobu.parser.app

import com.tsobu.parser.core.EnumState

class App {
    val greeting: String
        get() {
            return "Hello world " + EnumState.STATE_NAME.name
        }
}

fun main(args: Array<String>) {
    println(App().greeting)
}