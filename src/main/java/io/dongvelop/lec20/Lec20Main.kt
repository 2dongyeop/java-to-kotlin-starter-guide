package io.dongvelop.lec20

import io.dongvelop.lec09.Person

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 25
 * @description Kotlin Scope Function
 */
fun main() {
    printPerson(Person("dsa", 1))
    printPerson(null)

    /**
     * Scope Function : 람다를 사용해 일시적인 영역을 만들고,
     * 코드를 더 간결하게 하거나, Method Chaining에 활용하는 함수를 의미
     */
}

fun printPerson(person: Person?) {
    // TO-BE
    person?.let {
        println(it.name)
        println(it.age)
    }

    // AS-IS
    if (person != null) {
        println(person.name)
        println(person.age)
    }

}