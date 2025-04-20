package io.dongvelop.lec11

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 20
 * @description
 */

fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}

class Car(
    internal val name: String,
    var owner: String,
    _price: Int // 생성자 파라미터일 뿐 클래스의 프로퍼티가 아님.
) {

    var price: Int = _price
        private set
}