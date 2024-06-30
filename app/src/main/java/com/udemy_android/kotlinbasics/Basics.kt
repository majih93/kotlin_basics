package com.udemy_android.kotlinbasics

fun main() {
    // creating a list in Kotlin
    // immutable list
    // 추가할 수 없음. val 변수인것과 무관하게 listOf함수는 불변 리스트 생성함
//    val shoppingList = listOf("Processor", "RAM", "Graphics Card RTX 3060", "SSD")

    // 초기화 이후에도 값을 추가/삭제하는 것이 가능함.
    val mutableShoppingList = mutableListOf("Processor", "RAM", "Graphics Card", "SSD")

    // 값을 추가하기
    mutableShoppingList.add("Cooling System") // add는 메서드이다. 메서드란 간단하게 말하면 객체의 컨텍스트 내에 존재하는 함수

    // 값을 제거하기(그래픽 리스트 더 좋은걸로 살래!!)
    mutableShoppingList.remove("Graphics Card RTX 3060")

    // 새로운 그래픽 카드 추가!
    mutableShoppingList.add("Graphics Card RTX 4090")

    println(mutableShoppingList)

    // list에는 string, int값들이나, 객체 자체도 저장이 가능하다.

    // 반복문
    // 코틀린 문법은 for...in 이구만.
    for(item in mutableShoppingList) {
        println(item)
    }

    // JavaScript for문처럼 인덱스 값에 접근하려면?
    // 0 until list.size 형식으로 작성하는구나. 오홍 꽤나 직관적으로 처리하려고 신경을 좀 많이 쓴 느낌이네.
    // until은 시작점 포함, 종료점 직전까지
    for(itemIndex in 0 until mutableShoppingList.size) {
        println(itemIndex) // 0 1 2 3 4 5
    }

    // 그러면 종료지점까지 포함시키고 싶으면?
    for(num in 0..4) {
        println(num) // 0 1 2 3 4
    }

}
