package io.dongvelop.lec07

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 17
 * @description Kotlin에서 예외를 다루는 방법
 */
fun main() {
    val filePrinter = FilePrinter()

    /*
     * Kotlin에서는 CheckedException과 UnCheckedException를 구분하지 않음.
     * 따라서, 아래 메서드에서 throws IOException 과 같이 명시해주지 않아도 정상 동작함.
     */
    filePrinter.readFile();

    /*
     * Kotlin에서는 try-with-resource 구문이 존재하지 않음.
     * 다만, `.use` 블록을 통해 동일하게 동작할 수 있음.
     */
    filePrinter.readFile(".");
}

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException()
    }
}

// try-catch 또한 if-else 처럼 return 문의 값으로 사용될 수 있음.
fun parseIntOrThrow2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}