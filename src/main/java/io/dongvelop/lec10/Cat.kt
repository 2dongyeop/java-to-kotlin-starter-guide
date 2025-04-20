package io.dongvelop.lec10

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 20
 * @description
 */
class Cat(
    species: String,
) : Animal(species, 4) {
    /*
     * 상속을 의미하는 extends 대신 : 을 사용 + 바로 상위 생성자 호출
     * 메서드 오버라이드시에는 애너테이션이 아닌 키워드로 명시.
     */
    override fun move() {
        println("고양이가 걷는다")
    }
}