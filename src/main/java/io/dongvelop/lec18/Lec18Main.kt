package io.dongvelop.lec18

import io.dongvelop.lec17.Fruit

/**
 * @author 이동엽(Lee Dongyeop)
 * @date 2025. 04. 24
 * @description Kotlin에서 컬렉션을 함수형으로 다루는 방법
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

    /**
     * 컬렉션 사용 예시
     */
    // 사과만 주세요
    val apples = fruits.filter { fruit -> fruit.name == "사과" }
    val appleswithIndex = fruits.filterIndexed { idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }

    // 사과 가격들 알려주세요
    val applePrices = fruits
        .filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.price }

    // 결과가 null이 아닌 것들만 가져오기
    val applePrices2 = fruits
        .filter { fruit -> fruit.name == "사과" }
        .mapNotNull { fruit -> fruit.price }

    // 모든 과일이 사과인가요?
    val isAllApple = fruits.all { fruit -> fruit.name == "사과" }

    // 모든 과일이 사과가 아닌가요?
    val isNotApple = fruits.none { fruit -> fruit.name == "사과" }

    // 사과가 하나라도 있나요?

    // 출고가 10,000원 이상의 과일이 하나라도 있나요?
    val isAnyApple = fruits.any { fruit -> fruit.name == "사과" && fruit.price >= 10_000 }

    // 총 과일 갯수
    fruits.count()

    // 낮은 가격 순
    fruits.sortedBy { fruit -> fruit.price }
    fruits.sortedByDescending { fruit -> fruit.price }

    // 과일 종류
    fruits.distinctBy { fruit -> fruit.name }
        .map { fruit -> fruit.name }

    // 첫번째, 마지막 과일만 주세요
    fruits.first()        // 비어있을 경우 Exception 발생
    fruits.firstOrNull()
    fruits.last()         // 비어있을 경우 Exception 발생
    fruits.lastOrNull()

    // List -> Map : Key(과일이름), Value(과일목록)
    val fruitNameMap: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }

    // List -> Map : Key(id), Value(과일)
    // val map: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id }

    // List -> Map : Key(과일이름), Value(과일 가격 목록)
    val map2: Map<String, List<Int>> = fruits.groupBy({ fruit: Fruit -> fruit.name }, { fruit: Fruit -> fruit.price })

    // List -> Map : Key(과일 id), Value(과일 가격)
    // val map3: Map<Int, Int> = fruits.associateBy({ fruit: Fruit -> fruit.id }, { fruit: Fruit -> fruit.price })


    /**
     * 중첩된 컬렉션 처리
     */
    val fruitsInList: List<List<io.dongvelop.lec18.Fruit>> = listOf(
        listOf(
            Fruit(1L, "사과", 1_000, 1_500),
            Fruit(2L, "사과", 1_200, 1_500),
            Fruit(3L, "사과", 1_200, 1_500),
            Fruit(4L, "사과", 1_500, 1_500),
        ),
        listOf(
            Fruit(5L, "바나나", 3_000, 3_200),
            Fruit(6L, "바나나", 3_200, 3_200),
            Fruit(7L, "바나나", 2_500, 3_200),
        ),
        listOf(
            Fruit(8L, "수박", 10_000, 10_000),
        ),
    )

    // 출고가와 현재가가 동일한 과일
    val same1 = fruitsInList.flatMap { list -> list.filter { fruit -> fruit.factoryPrice == fruit.currentPrice } }

    // List<List<Fruit>>를 List<Fruit>로 바꿔주세요
    val fruitList: List<io.dongvelop.lec18.Fruit> = fruitsInList.flatten()

}
