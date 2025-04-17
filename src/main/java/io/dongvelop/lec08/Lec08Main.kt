package io.dongvelop.lec08

fun main() {
    /*
     * default 파라미터 소개
     * Java에서 메서드 오버로딩을 이용해 작성했던 내용들을 아래와 같이 디폴트 파라미터로 대체 가능.
     */
    repeat("str", 3, true)
    repeat("str", 3)
    repeat("str")

    /*
     * named 파라미터 소개
     * 특정 매개변수에 어떤 값을 넣을지 지정해서 호출하는 방식.
     * 지정되지 않은 매개변수는 기본값을 사용하게 됨.
     * => 빌더를 만들지 않았지만, 빌더의 효과를 누릴 수 있음.
     *
     * Java의 함수를 가져다 사용할 때는 Named 파라미터 사용 불가.
     * => 바이트코드로 변환되었을 때 함수의 매개변수 이름을 저장하지 않기 때문.
     */
    repeat("str", useNewLine = false)

    /*
     * 가변인자 사용법 소개
     * 배열을 바로 넣을 경우, spread(`*`) 연산자를 사용해야 함.
     */
    val array = arrayOf("A", "B", "C")
    printAll(*array)
    printAll("A", "B", "C")
}

fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 17
 * @description Kotlin에서 함수를 다루는 방법
 */

// 가변인자 사용 방법 => Java에서 String... strings 와 동일
fun printAll(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}


/*
 * =================
 * 함수의 정리 형태
 * =================
 */
// v1 : 초기의 함수 형태
fun maxV1(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

// v2 : {} 블록과 return 키워드를 없애고 `=` 으로 대체
fun maxV2(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }

// v3 : 함수의 타입(Int) 생략 & 한줄로 정렬
// 함수의 타입은 위에서 `=`을 사용했기 때문에 생략 가능함을 인지하기.
fun maxV3(a: Int, b: Int) = if (a > b) a else b

