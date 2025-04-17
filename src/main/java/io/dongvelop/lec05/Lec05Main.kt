package io.dongvelop.lec05

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 17
 * @description Kotlin에서 제어문을 다루는 방법
 */

/*
 * Kotlin에서는 if-else문이 값으로 여겨지기 때문에 리턴문 뒤에 사용 가능
 * Java에서는 Statement가 아닌 Expression으로써만 사용됨.
 */
fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

/*
 * `in` 구문을 통해 범위 값을 확인할 수 있다.
 * between과 비슷.
 */
fun validateScore(score: Int): Unit {
    if (score !in 0..100) {
        throw IllegalArgumentException()
    }
}

/*
 * Java의 Switch문 대신 When 문법을 사용할 수 있다. (사용 방법이 훨씬 많다.)
 * 마찬가지로 Statement로 여겨지기 때문에 리턴문 뒤에 사용 가능.
 */
fun getScoreWhen1(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        else -> "C"
    }
}

fun getScoreWhen2(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        else -> "C"
    }
}

fun getScoreWhen3(score: Any): String {
    return when (score) {
        is String -> "String Result"
        in 90..99 -> "A"
        80, 81, 82 -> "B"
        else -> "C"
    }
}