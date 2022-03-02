package ru.netology

fun main() {
    val amount = 10_000_00
    val lastAmount = 11_000_00
    val regularUser = true
    val discountFirstThreshold = 1_001_00
    val discountFirstAmount = 100_00
    val discountSecondThreshold = 10_001_00
    val discountSecondPercentage = 5
    val discountRegularUserPercentage = 1

    val calculatedDiscount = if (lastAmount >= discountSecondThreshold) (amount * discountSecondPercentage / 100) else if (lastAmount >= discountFirstThreshold) discountFirstAmount else 0
    val amountIncludingDiscount = amount - calculatedDiscount
    val regularUserDiscount = if (regularUser)  (amountIncludingDiscount * discountRegularUserPercentage / 100) else 0
    val total = amountIncludingDiscount - regularUserDiscount

    println ("""
            Покупка на сумму ${amount / 100} руб. ${amount % 100} коп.  
            Скидка: ${calculatedDiscount / 100} руб. ${calculatedDiscount % 100} коп.
            Доп скидка постоянного покупателя: ${regularUserDiscount / 100} руб. ${regularUserDiscount % 100} коп.
            
            Сумма с учетом скидок: ${total / 100} руб. ${total % 100} коп.
        """.trimIndent())
}