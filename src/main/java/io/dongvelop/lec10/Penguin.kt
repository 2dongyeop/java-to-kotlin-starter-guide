package io.dongvelop.lec10

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 20
 * @description
 */
class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2

    /*
     * 상속을 의미하는 extends 대신 : 을 사용 + 바로 상위 생성자 호출
     * 메서드 오버라이드시에는 애너테이션이 아닌 키워드로 명시.
     */
    override fun move() {
        println("펭귄")
    }

    /*
         * legCount와 같이 프로퍼티를 오버라이드 하려면
         * 상위 클래스에서 `open` 키워드를 명시해주어야 한다.
         */
    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        /*
         * Java 와 문법 다름 주의
         * ```java
         * Swimable.super.act();
         * ```
         */
        super<Swimable>.act()
        super<Flyable>.act()
    }
}