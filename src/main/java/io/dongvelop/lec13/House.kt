package io.dongvelop.lec13

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 21
 * @description Kotlin에서 중첩 클래스를 다루는 방법
 */
class House(
    var address: String,
) {
    /*
     * Java의 static과 함께 작성한 예시.
     * 외부 클래스에 접근 "불가"
     */
    class GoodClass(
        private val area: Double
    ) {
    }

    /*
     * Java의 static과 함께 작성하지 않은 예시.
     * 외부 클래스에 접근 "가능"
     */
    inner class NotGoodClass(
        private val area: Double
    ) {
        val address: String
            get() {
                return this@House.address
            }
    }
}