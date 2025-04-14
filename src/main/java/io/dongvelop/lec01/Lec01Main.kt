package io.dongvelop.lec01

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 14
 * @description Kotlin 에서의 변수를 다루는 방법
 */
fun main() {

    /**
     * Kotlin <-> Java 차이
     * 1. var/val 키워드로 수정 가능 여부를 명시해야 함.
     * 2. 컴파일러가 타입을 추론하므로 명시하지 않아도 됨.
     *    - 타입을 명시할 경우 "{변수}: {타입}" 꼴로 작성
     *
     * 간단한 TIP
     * - 모든 변수를 불변으로 만들고, 필요시 가변(var)로 변경하기.
     */

    /*
     * var : 가변 (Variable 약자 : 발)
     * val : 불변 (Value 약자 : )
     */
    var number1 = 10L
    val number2 = 10L

    // 타입을 명시할 경우 "{변수}: {타입}" 꼴로 작성.
    var number1WithType: Long = 1L

    /*
     * Kotlin 에서는 long(Primitive) vs Long(Referenced) 차이가 Kotlin 에서는 존재하지 X
     * => 런타임에 최적화된 내부 표현을 통해 원시 값(예: 숫자, 문자, 불리언 등)으로 표현
     * => 개발자가 Boxing/UnBoxing 을 고려하지 않아도 된다.
     * ref : https://kotlinlang.org/docs/basic-types.html
     */
    val number3 = 1_000L;

    // 대신 Java 의 Long 처럼 nullable 하려면, 타입과 함께 "?"를 명시한다.
    var number3nullable: Long? = null;

    /*
     * Kotlin 에서는 객체 생성 시, "new" 키워드를 사용하지 않음.
     */
    val person = Person("이동엽")
}