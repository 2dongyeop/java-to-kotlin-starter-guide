package io.dongvelop.lec18

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 24
 * @description
 */
data class Fruit(
    val id: Long,
    val name: String,
    val factoryPrice: Long,  // 출고가
    val currentPrice: Long,  // 현재가
) {

    val isSamePrice: Boolean
        get() = factoryPrice == currentPrice
}