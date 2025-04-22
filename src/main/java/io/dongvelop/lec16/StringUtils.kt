package io.dongvelop.lec16

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 22
 * @description 코틀린에서 다양한 함수를 다루는 방법
 */

fun main() {
    val str = "hello"
    println("lastChar = ${str.lastChar()}")

    3.add2(4)
    3 add2 4


}

/**
 * 지역 함수 Example
 */
fun createPerson(firstName: String, lastName: String): Person {
    fun validate(name: String) {
        if (name.isEmpty()) {
            throw IllegalArgumentException("Name cannot be empty")
        }
    }
    validate(firstName)
    validate(lastName)
    return Person(firstName, lastName, 1)
}

/**
 * inline 함수 Example => 컴파일하여 바이트코드 확인
 */
inline fun Int.addInline(other: Int): Int {
    return this + other
}

/**
 * 중위 함수 Example
 */
infix fun Int.add2(other: Int): Int {
    return this + other
}

/**
 * 확장 함수 Example
 * - String.kt 클래스에서 작성한 함수처럼 사용.
 * - 캡슐화의 개념을 지키기 위해, private/protected 멤버를 가져올 수 없다.
 * - 확장함수와 멤버함수의 시그니처가 같다면 => 멤버함수가 우선.
 */
fun String.lastChar(): Char {
    return this[this.length - 1]
}

class StringUtils {
}