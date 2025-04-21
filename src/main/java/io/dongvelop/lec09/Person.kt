package io.dongvelop.lec09

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 17
 * @description Kotlin에서 클래스를 다루는 방법
 */
fun main() {
    val person = Person("이동엽", 100)
    println(person.name)

    person.age = 10
    println(person.age)

    val person2 = Person("이동엽")
}

// 주 생성자는 상단에 위치. 필드가 존재할 경우, 반드시 작성해야 한다.
class Person(
    name: String,
    var age: Int
) {
    // 객체가 생성되는 시점(=클래스가 초기화되는 시점)에 호출되는 init 블록
    init {
        if (age < 0) {
            throw IllegalArgumentException("age must be greater than 0")
        }
    }

    /*
     * 부 생성자. 존재 여부는 선택이지만, 최종적으로 주 생성자를 this로 호출해야 한다.
     * 부 생성자 보다는 default 파라미터를 권장.
     */
    constructor(name: String) : this(name, 1)

    // v1 : 함수로 선언하여 계산되어 리턴하도록.
    fun isAdultV1(): Boolean {
        return this.age >= 20
    }

    // v2 : 커스텀 Getter로 (프로퍼티로 보이도록 하여) 호출할 때 계산식이 이루어지도록.
    val isAdultV2: Boolean
        get() {
            return this.age > 20
        }

    /*
     * V1 : name을 getter 호출시, 대문자로 리턴하도록 동작.
     * `field` 는 무한루프를 방지하기 위해 자기 자신을 의미함. (`.name` 자체가 getter 이기 떄문)
     * => backing field
     */
    val name: String = name
        get() {
            return field.uppercase()
        }

    // V2 : 함수로 생성
//    fun getUppercaseName(): String {
//        return this.name.uppercase()
//    }

    // V3 : 프로퍼티처럼 보이게 하기
//    val uppercaseName: String
//        get() = this.name.uppercase()
}