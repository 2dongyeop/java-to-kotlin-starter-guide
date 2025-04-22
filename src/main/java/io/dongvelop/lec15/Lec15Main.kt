package io.dongvelop.lec15

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 22
 * @description Kotlin에서 배열과 컬렉션을 다루는 방법
 */
fun main() {

    // 배열을 다루는 방법 시작
    val array = arrayOf(100, 200)
    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    val newArray = array.plus(300)
    for ((index, value) in newArray.withIndex()) {
        println("$index $value")
    }
    // 배열을 다루는 방법 종료

    // 컬렉션을 다루는 방법 시작
    // List
    val emptyList = emptyList<Int>()
    val numbers = listOf(100, 200)            // 불변 리스트
    val mutableList = mutableListOf(100, 200) // 가변 리스트
    mutableList.add(300)

    println(numbers[0])
    for (number in numbers) println(number)
    for ((index, value) in mutableList.withIndex()) println("$index $value")

    // Set
    val set = setOf(100, 200)
    val mutableSet = mutableSetOf(100, 200)

    // Map
    val newMap = mapOf(1 to "ASF", 2 to "ASD")
    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "ASF"
    oldMap[2] = "ASD"

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in newMap.entries) println("$key $value")
    // 컬렉션을 다루는 방법 종료


}