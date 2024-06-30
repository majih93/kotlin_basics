package com.udemy_android.kotlinbasics

// var로 초기화 하는 이유는, val로 초기화하면 변경이 안된다.
class BankAccount(var accountHolder: String, var balance: Double) {
    // private으로 선언하면 접근제한이 된다.
    // 클래스 밖에서 직접 접근이 불가능함.
    // 클래스 내에 선언된 함수들만 접근할 수 있도록 한다.

    private val transactionHistory = mutableListOf<String>()
    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("$accountHolder 님이 $amount 원을 입금함")
    }

    fun withdraw(amount: Double) {
        if(amount <= balance) {
            balance -= amount
            transactionHistory.add("$accountHolder 님이 $amount 원을 출금함.")
        } else {
            println("계좌 잔액이 부족합니다.")
        }
    }

    fun displayTransactionHistory() {
        println("$accountHolder 님의 계좌 거래 내역입니다.")
        for(transaction in transactionHistory)  {
            println(transaction)
        }
    }

    fun displayBalance() {
        println("$accountHolder 님의 계좌 잔액은 $balance 원입니다.")
    }

}