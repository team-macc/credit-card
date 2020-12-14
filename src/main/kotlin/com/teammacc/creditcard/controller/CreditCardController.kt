package com.teammacc.creditcard.controller

import com.teammacc.creditcard.services.CreditCardService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/api/credit-card")
class CreditCardController(@Autowired private val creditCardService: CreditCardService) {

    @GetMapping("/{number}")
    fun validate(@PathVariable number: String): String {
        return creditCardService.validate(number)
            ?: throw ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid Credit Card Number.")
    }
}







