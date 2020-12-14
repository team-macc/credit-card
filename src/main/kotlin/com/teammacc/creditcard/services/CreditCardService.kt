package com.teammacc.creditcard.services

import com.teammacc.creditcard.entity.CreditCard
import com.teammacc.creditcard.repository.CreditCardRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.util.*

@Service
class CreditCardService(private val creditCardRepository: CreditCardRepository) {

    fun validate(number: String) : String? {
        val currentDate = Calendar.getInstance().time
        val creditCard = creditCardRepository.findByNumber(number) ?: return null
        //throw Exception("Invalid Credit Card Number.")
        if (creditCard.expiration.after(currentDate)) return null
        //throw Exception("Credit Card Expired.")
        // TODO verificar comparação de datas currentDate: Mon Dec 14 03:23:53 BRT 2020
        //  creditCard.expiration: 2019-07-02 21:00:00.0
        return "Valid Credit Card."
    }
}