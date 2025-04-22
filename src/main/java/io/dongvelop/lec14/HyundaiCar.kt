package io.dongvelop.lec14

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 22
 * @description
 */
sealed class HyundaiCar(
    val name: String,
    val price: Long,
)

class Avante : HyundaiCar("아반떼", 1_000L)

class Sonata : HyundaiCar("소나타", 2_000L)

class Grandeur : HyundaiCar("그랜져", 3_000L)