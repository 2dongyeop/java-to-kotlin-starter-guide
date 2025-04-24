package io.dongvelop.lec19

import io.dongvelop.lec18.Fruit
import io.dongvelop.lec19.a.printHello as printHelloA
import io.dongvelop.lec19.b.printHello as printHelloB

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 24
 * @description 코틀린의 이모저모
 */
fun main() {

    /**
     * as import Example
     * 동일한 이름의 함수를 가져올 때, 이름을 바꾸어 한 파일 내에서 함께 사용할 수 있도록 함.
     */
    printHelloA()
    printHelloB()

    /**
     * 구조 분해 : 여러 개의 값을 한번에 할당하는 방법..
     */
    val person = Person("name", 10)
    val (name, age) = person
    println("$name, $age")

    /**
     * Jump & Label
     */
    val numbers = listOf(1, 2, 3)
    loop@ for (i in numbers) {
        for (j in numbers) {
            if (j == 2) break@loop
        }
    }
}

/**
 * TakeIf : 주어진 조건이 만족하면 결과값이 나오고, 아닐 경우 null이 나옴.
 * TakeUnless : 주어진 조건이 만족하지 않으면 결과값이 나오고, 만족하면 null이 나옴.
 */
fun getNumberOrNull(number: Int): Int? {
    // AS-IS
    // return if (number > 0) {
    //   number
    // } else {
    //   null
    // }

    // TO-BE
//    return number.takeIf { it > 0 }
    return number.takeUnless { it <= 0 }
}

/**
 * Type Alias Example
 *
 */
typealias FruitFilter = (Fruit) -> Boolean
typealias USLTClass = UltraSuperLongTitleClass

fun filterFruit(fruit: Fruit, filter: FruitFilter) {
    val ultraSuperLongTitleClass = USLTClass("title")
}

data class UltraSuperLongTitleClass(
    val name: String,
)

data class Person(
    val name: String,
    val age: Int
)