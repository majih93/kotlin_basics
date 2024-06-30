package com.udemy_android.kotlinbasics

fun main() {
    val jamesBankAccount = BankAccount("James", 0.0)

    jamesBankAccount.deposit(200.0)
    jamesBankAccount.withdraw(50.0)
    jamesBankAccount.withdraw(1000.0)
    jamesBankAccount.deposit(270.0)
    jamesBankAccount.displayTransactionHistory()
    jamesBankAccount.displayBalance()
}
