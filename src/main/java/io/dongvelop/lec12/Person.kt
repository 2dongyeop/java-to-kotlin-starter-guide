package io.dongvelop.lec12

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 21
 * @description Kotlin에서 object 키워드를 다루는 방법
 */
fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    /**
     * 익명 클래스 Example
     */
    moveSomething(object : Movable {
        override fun move() {
            TODO("Not yet implemented")
        }

        override fun fly() {
            TODO("Not yet implemented")
        }

    })
}

/**
 * Companion Object Example => Like Java Static
 */
class Person private constructor(
    val name: String,
    val age: Int
) {
    // Companion Object(동반 객체)는 Java의 static과 유사
    // => 단, 객체이므로 이름을 붙일 수 있고, 인터페이스를 구현할 수도 있음!!!
    companion object Factory : Movable {
        // const : 컴파일 시에 값(=1)을 할당, 없을 경우에느 런타임 시에 할당.
        private const val MIN_AGE = 1

        // 호출하는 코드에서 Companion 객체의 이름을 생략하여 호출 가능.
        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name = name, age = MIN_AGE)
        }

        override fun move() {
            TODO("Not yet implemented")
        }

        override fun fly() {
            TODO("Not yet implemented")
        }
    }
}

/**
 * Object Example => Like Java Singleton
 */
object Singleton {
    var a: Int = 0
}

private fun moveSomething(movable: Movable) {
    movable.move();
    movable.fly();
}