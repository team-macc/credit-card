package com.teammacc.creditcard

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class CreditCardApplication

fun main(args: Array<String>) {
	runApplication<CreditCardApplication>(*args)
}
