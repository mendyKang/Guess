package com.compal.guess

import java.util.*

class SecretNumber {
    val secret = Random().nextInt(10) + 1
    var count = 0

    fun valitate(number: Int):Int {
        count++
        return number - secret
    }
}

fun main() {
    val secretNumber = SecretNumber()
    println(secretNumber.secret)
    print("${secretNumber.valitate(2)} , count:${secretNumber.count}")
}