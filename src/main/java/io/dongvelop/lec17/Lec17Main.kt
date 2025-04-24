package io.dongvelop.lec17

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 23
 * @description Kotlin에서 람다를 다루는 방법
 */
fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000),
    )

    // 람다를 직접 호출하는 방법 1
    // 함수의 이름이 없으며, 함수의 타입을 명시 가능 (Fruit을 받아, Boolean으로 리턴)
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    // 호출 방식 (직접 , invoke() 이용)
    isApple(fruits[0])
    isApple.invoke(fruits[0])

    // 람다를 직접 호출하는 방법 2
    val isApple2 = { fruit: Fruit -> fruit.name == "사과" }

    // 호출 예시 Step1
    val filteredFruit = filterFruit(fruits, isApple)

    // 호출 예시 Step2 : 함수 자체를 선언
    val filteredFruit2 = filterFruit(fruits, { fruit: Fruit -> fruit.name == "사과" })

    // 호출 예시 Step 3 : 소괄호 내에 중괄호가 있는 것이 어색하니, 바깥으로 분리
    val filteredFruit3 = filterFruit(fruits) { fruit: Fruit -> fruit.name == "사과" }

    // 호출 예시 Step 4 : fruit 변수의 타입이 추론이 가능하므로 생략.
    val filteredFruit4 = filterFruit(fruits) { fruit -> fruit.name == "사과" }

    // 호출 예시 Step 5 : fruit 변수 간소화
    val filteredFruit5 = filterFruit(fruits) { it.name == "사과" }
}

// Kotlin에서는 매개변수로 함수 자체를 넘길 수 있음.
fun filterFruit(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean
): List<Fruit> {

//    val results = mutableListOf<Fruit>()
//
//    for (fruit in fruits) {
//        if (filter(fruit)) {
//            results.add(fruit)
//        }
//    }
//
//    return results
    return fruits.filter(filter)
}
