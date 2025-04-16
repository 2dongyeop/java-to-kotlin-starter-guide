package io.dongvelop.lec03

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 16
 * @description Kotlin 에서의 Type 을 다루는 방법
 */
fun main() {

    // Kotlin에서는 타입 변환이 "명시적으로" 이루어져야 함 => `.toLong()` 호출.
    // 반대로 Java는 타입 변환이 "묵시적"으로 이루어짐.
    val number1 = 3
    val number2: Long = number1.toLong()

    // nullable 한 변수의 경우, Safe Call & Elvis 연산자 사용
    val number1Nullable: Int? = 3
    val number2Nullable: Long = number1Nullable?.toLong() ?: 0

    // `${}` 기호를 통해 값을 출력할 수 있다.
    val person = Person("name", 20)
    println("이름 : ${person.name}")

    // 여러 줄에 걸친 문장을 """ """를 이용해 작성 가능하다.
    // Java 17 이상을 사용하면 동일하게 사용 가능.
    val trimIndent = """
        여러줄에
        걸친
        문장
    """.trimIndent()
    println(trimIndent)

    // 문장에서 특정 문자를 가져올 때, 배열처럼 가져올 수 있다.
    val string = "ABC"
    val char = string[1]
    println(char)
}

fun printAgeIfPerson(obj: Any) {
    // `is` 연산자는 Java 의 `instanceof` 와 동일
    if (obj is Person) {
        // `as` 연산자는 (Person)과 같이 형변환 역할. 생략 가능.
        val person = obj as Person
        println(person.age)
    }

    // is를 이용해 컴파일러가 타입을 확인했다면 바로 obj를 사용 가능
    // => 스마트 캐스트
    if (obj is Person) {
        println(obj.age)
    }

    // ! 연산자를 `is` 연산자 앞에 붙여 사용할 수도 있음.
    if (obj !is Person) {
        println("not person")
    }
}

fun printAgeIfPersonNullable(obj: Any?) {
    // `as` 연산자 뒤에도 ?를 붙일 수 있음. => Safe Call
    val person = obj as? Person
    println(person?.age)
}