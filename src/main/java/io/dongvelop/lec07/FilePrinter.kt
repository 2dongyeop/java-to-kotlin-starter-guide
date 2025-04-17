package io.dongvelop.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.IOException

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 17
 * @description Kotlin에서 예외를 다루는 방법
 */
class FilePrinter {

    /*
     * Kotlin에서는 CheckedException과 UnCheckedException를 구분하지 않음.
     * 따라서, 아래 메서드에서 throws IOException 과 같이 명시해주지 않아도 정상 동작함.
     */
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    /*
     * Kotlin에서는 try-with-resource 구문이 존재하지 않음.
     * 다만, `.use` 등과 같은 인라인 함수를 통해 동일하게 동작할 수 있음.
     */
    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}