package io.dongvelop.lec10

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 20
 * @description
 */
abstract class Animal(
    protected val species: String,
    protected open val legCount: Int,
) {
    abstract fun move()
}