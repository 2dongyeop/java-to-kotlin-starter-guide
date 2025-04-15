package io.dongvelop.lec02

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 15
 * @description Kotlin 에서의 null 을 다루는 방법
 */

fun main() {

    /*
     * =================
     * Safe Call Example
     * =================
     */
    // 1. null 이므로 Safe Call 실행 X
    val strNull: String? = null
    println(strNull?.length) // null

    // 2. 변수가 nullable 타입이므로, Safe Call 로 호출하도록 컴파일 에러 발생
    // Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    val strNotNull: String? = "notnull"
//    println(strNotNull.length)

    // 3. Safe Call 정상 동작.
    val strNotNull2: String? = "notnull"
    println(strNotNull2?.length)

    /*
     * ====================
     * Elvis 연산자(?:) Example
     * ====================
     */
    // 1. null 일 경우에 대신할 동작을 지정.
    val strNull2: String? = null
    println(strNull2?.length ?: 0)

    /*
     * ====================
     * null 이 아님을 단언 : (!!)
     * ====================
     */
    println(startsWith("ABC")) // true
    println(startsWith(null))  // NPE 발생. => 정말 확실하게 Not Null 일 때만 사용..

    /*
     * Platform Type
     * = person.name 이 nullable 유무를 코틀린이 알 수 없음.
     * = 런타임시 Exception 발생 가능성.
     */
    val person = Person("123")
    startsWithNotNull(person.name)
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null string")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}

fun startsWithNotNull(str: String): Boolean {
    return str.startsWith("A")
}