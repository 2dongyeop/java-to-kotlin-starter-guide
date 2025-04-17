package io.dongvelop.lec06

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 17
 * @description Kotlin에서 반복문을 다루는 방법
 */
fun main() {

    /*
     * for-each 문법 사용예시
     */
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }

    /*
     * 전통적인 for 문 => 이러한 `..` 연산자는 사실상 Range라는 클래스를 의미하며, 이는 Pregression(등차수열)을 상속
     * 기본 값으로 공차가 1인 수열을 만들도록 구현되어 있기 때문. => 시작값이 1이고, 끝값이 3인, 공차가 1인 등차수열
     */
    // 값을 1씩 증가시켜 반복시키는 경우 => for (i = 1; i <= 3; i++)
    for (i in 1..3) {
        println(i)
    }

    // 값을 1씩 감소시켜 반복시키는 경우 => for (i = 3; i >= 1; i--)
    for (i in 3 downTo 1) {
        println(i)
    }

    // 값을 2씩 증가시켜 반복시키는 경우 => for (i = 1; i <= 3; i+=2)
    for (i in 1..3 step 2) {
        println(i)
    }

    // 값을 2씩 감소 시켜 반복시키는 경우 => for (i = 3; i >= 1; i-=2)
    for (i in 3 downTo 1 step 2) {
        println(i)
    }
}