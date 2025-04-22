package io.dongvelop.lec14

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 22
 * @description Kotlin에서 다양한 클래스를 다루는 방법
 */
fun main() {
    val dto1 = PersonDto("asd", 100)
    val dto2 = PersonDto("asd", 200)
    println(dto1 == dto2)
    println(dto1)
    println(dto1.age)

    handleCountry(Country.KOREA)
    handleCar(Avante())
}

/**
 * Sealed Class Example
 */
private fun handleCar(car: HyundaiCar) {
    when (car) {
        is Avante -> println(car.name)
        is Sonata -> TODO()
        is Grandeur -> TODO()
    }
}

/**
 * Enum Class Example
 */
fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> println("Korea")
        Country.AMERICA -> println("Korea")
    }
}

/**
 * Data class Example
 * - getter & hashcode & equals & toString을 자동으로 만들어준다.
 * - Java의 record 키워드와 동일.
 */
data class PersonDto(
    val name: String,
    val age: Int,
)
