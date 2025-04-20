package io.dongvelop.lec10

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 20
 * @description
 */
interface Swimable {

    /*
     * Java와 달리 default 키워드를 사용하지 않아도 메서드 구현이 가능
     */
    fun act() {
        println("수영수영")
    }
}