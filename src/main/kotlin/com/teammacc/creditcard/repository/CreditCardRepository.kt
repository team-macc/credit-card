package com.teammacc.creditcard.repository

import com.teammacc.creditcard.entity.CreditCard
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CreditCardRepository : JpaRepository<CreditCard, Long> {
    fun findByNumber(number: String): CreditCard ?
}