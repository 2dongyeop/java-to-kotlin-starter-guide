# java-to-kotlin-starter-guide

## 0. 목차

* [1. Kotlin에서 변수와 타입, 연산자를 다루는 방법](#1-kotlin에서-변수와-타입-연산자를-다루는-방법)
    * [1-1. Kotlin에서 변수를 다루는 방법](#1-1-kotlin에서-변수를-다루는-방법)
    * [1-2. Kotlin에서 null을 다루는 방법](#1-2-kotlin에서-null을-다루는-방법)
    * [1-3. Kotlin에서 Type을 다루는 방법](#1-3-kotlin에서-type을-다루는-방법)
    * [1-4. Kotlin에서 연산자를 다루는 방법](#1-4-kotlin에서-연산자를-다루는-방법)
* [2. Kotlin에서 코드를 제어하는 방법](#2-kotlin에서-코드를-제어하는-방법)
    * [2-1. Kotlin에서 제어문을 다루는 방법](#2-1-kotlin에서-제어문을-다루는-방법)
    * [2-2. Kotlin에서 반복문을 다루는 방법](#2-2-kotlin에서-반복문을-다루는-방법)
    * [2-3. Kotlin에서 예외를 다루는 방법](#2-3-kotlin에서-예외를-다루는-방법)
    * [2-4. Kotlin에서 함수를 다루는 방법](#2-4-kotlin에서-함수를-다루는-방법)
* [3. Kotlin에서의 OOP](#3-kotlin에서의-oop)
    * [3-1. Kotlin에서 클래스를 다루는 방법](#3-1-kotlin에서-클래스를-다루는-방법)
    * [3-2. Kotlin에서 상속을 다루는 방법](#3-2-kotlin에서-상속을-다루는-방법)
    * [3-3. Kotlin에서 접근 제어를 다루는 방법](#3-3-kotlin에서-접근-제어를-다루는-방법)
    * [3-4. Kotlin에서 object 키워드를 다루는 방법](#3-4-kotlin에서-object-키워드를-다루는-방법)
    * [3-5. Kotlin에서 중첩 클래스를 다루는 방법](#3-5-kotlin에서-중첩-클래스를-다루는-방법)
    * [3-6. Kotlin에서 다양한 클래스를 다루는 방법](#3-6-kotlin에서-다양한-클래스를-다루는-방법)
* [4. Kotlin에서의 FP](#4-kotlin에서의-fp)
    * [4-1. Kotlin에서 배열과 컬렉션을 다루는 방법](#4-1-kotlin에서-배열과-컬렉션을-다루는-방법)
    * [4-2. Kotlin에서 다양한 함수를 다루는 방법](#4-2-kotlin에서-다양한-함수를-다루는-방법)
    * [4-3. Kotlin에서 람다를 다루는 방법](#4-3-kotlin에서-람다를-다루는-방법)
    * [4-4. Kotlin에서 컬렉션을 함수형으로 다루는 방법](#4-4-kotlin에서-컬렉션을-함수형으로-다루는-방법)
* [5. 추가적으로 알아두어야 할 코틀린 특성](#5-추가적으로-알아두어야-할-코틀린-특성)
    * [5-1. Kotlin의 이모저모](#5-1-kotlin의-이모저모)
    * [5-2. Kotlin의 scope function](#5-2-kotlin의-scope-function)

<br/>

## 1. Kotlin에서 변수와 타입, 연산자를 다루는 방법

### 1-1. [Kotlin에서 변수를 다루는 방법](src/main/java/io/dongvelop/lec01/Lec01Main.kt)

- 모든 변수는 `var`, `val` 키워드로 수정 가능 여부를 명시해야 한다.
- 컴파일러가 타입을 추론하므로 명시하지 않아도 된다.
- Primitive Type과 Reference 타입을 구분하지 않아도 된다.
- 변수가 Nullable 하려면, 타입과 함께 `?`를 명시한다.
- 객체 생성 시, `new` 키워드를 사용하지 않는다.

<br/>

### 1-2. [Kotlin에서 null을 다루는 방법](src/main/java/io/dongvelop/lec02/Lec02Main.kt)

- 코틀린에서 null이 들어갈 수 있는 타입은 완전히 다르게 간주된다.
    - 한 번 null을 검사하면 not null임을 컴파일러가 알 수 있다.
- null이 아닌 경우에만 호출되는 Safe Call(`?.`)이 있다.
- null인 경우에만 호출되는 Elvis 연산자(`?:`)가 있다.
- null이 절대 아닐 때 사용할 수 있는, 널 아님 단언(`!!`)이 있다.
- 코틀린에서 자바 코드를 사용할 때, 플랫폼 타입에 주의해야 한다.
    - 플랫폼 타입 : 코틀린 컴파일러가 nullable 유무를 알 수 없는 타입
    - Java 코드로부터 null 가능성을 확인하거나, 코틀린으로 Wrapping 하여 단일 포인트로 관리하는 것이 좋다.

<br/>

### 1-3. [Kotlin에서 Type을 다루는 방법](src/main/java/io/dongvelop/lec03/Lec03Main.kt)

- 코틀린의 변수는 초기값으로 타입을 추론하며, 타입 변환은 **명시적으로** 이루어진다.
- 코틀린에서는 `is`, `!is`, `as`, `as?`를 이용해 타입을 확인하고 캐스팅한다.
- 코틀린의 `Any`는 최상위 타입으로, Java의 Object와 동일하다.
    - `equals()`, `toString()`, `hashcode()`를 동일하게 가진다.
- 코틀린의 `Unit`은 Java의 void와 동일하다.
- 코틀린의 `Nothing`은 정상적으로 끝나지 않는 함수의 반환을 의미한다.
- ~~여러 줄바꿈에 걸친 문자열을 `""" """`를 이용해 작성 가능하다.~~
    - **Java 17 이상 사용 시에도 동일하게 [Multi-line String](https://www.baeldung.com/java-multiline-string)을 사용할 수 있다.**
- 문자열에서 특정 위치의 문자를 가져올 때는 배열처럼 가져올 수 있다.

<br/>

### 1-4. Kotlin에서 연산자를 다루는 방법

- 아래 연산자들은 Java와 모두 완전 동일하다.
    - 단항 연산자(`++,` `--`)
    - 산술 연산자(`+`, `-`, `*`, `/`, `%`)
    - 산술 대입 연산자(`+=`, `-=`, `*=`, `/=`, `%=`)
- Kotlin에서는 비교연산자를 호출 시, 자동으로 `compareTo()`를 호출한다.
    - 비교 연산자 (`>`, `<`, `>=`, `<=`)

- 논리 연산자 또한 Java와 완전히 동일하다.
    - 논리 연산자(`&&`, `||`, `!`)
    - Java와 마찬가지로 Lazy 연산이 수행된다.

- **코틀린에만 존재하는 연산자**
    - `in`, `!in` : 컬렉션이나 범위에 포함되어있는지 확인
    - `a..b` : a부터 b까지의 범위 객체를 생성
    - `a[i]` : a에서 특정 index를 가져온다.

- 동등성과 동일성
    - 동등성(Equality) : 두 객체의 값이 같은가?
    - 동일성(Identity) : 두 객체의 주소가 같은가?

| 구분     | Java     | Kotlin |
|--------|----------|--------|
| 동등성 비교 | ==       | ===    |
| 동일성 비교 | equals() | ==     |

<br/>

## 2. Kotlin에서 코드를 제어하는 방법

### 2-1. [Kotlin에서 제어문을 다루는 방법](src/main/java/io/dongvelop/lec05/Lec05Main.kt)

- `if`, `if-else`는 Java와 모두 동일하다.
    - 단, 코틀린에서는 Expression으로 취급되어 return 문과 함께 사용할 수 있다.
- **Java의 switch는 Kotlin에서 `when`으로 대체되었고, 이는 더 강력한 기능을 제공한다.**

<br/>

### 2-2. [Kotlin에서 반복문을 다루는 방법](src/main/java/io/dongvelop/lec06/Lec06Main.kt)

- for-each 문 : Java와 동일하되, `in` 키워드를 사용한다.
- 전통적인 for 문 : 등차수열과 `in` 키워드를 사용한다.
    - `downTo`, `step` 또한 함수이다.
- while, do-while 문 : Java와 동일하다.

<br/>

### 2-3. [Kotlin에서 예외를 다루는 방법](src/main/java/io/dongvelop/lec07/FilePrinter.kt)

- try-catch 구문은 문법적으로 완전히 동일하다.
    - Kotlin 에서는 Expression이기 때문에 return 문의 값으로 사용 가능하다.
- **Kotlin에서는 CheckedException과 UnCheckedException를 구분하지 않는다.**
- **Kotlin에서는 try-with-resource 구문이 존재하지 않는다.**
    - 대신 코틀린의 언어적 특성을 활용하여 close()를 호출한다.
    - e.g. `.use { ... }` 와 같은 인라인 함수

<br/>

### [2-4. Kotlin에서 함수를 다루는 방법](src/main/java/io/dongvelop/lec08/Lec08Main.kt)

- `default parameter` : 함수 파라미터에 기본 값을 설정할 수 있다.
    - Java의 오버로딩을 대체하며, 빌더의 장점을 누릴 수 있다.
- `named parameter` : 함수를 호출할 때, 특정 파라미터를 지정해 넣을 수 있다.
- `vararg` : 가변인자를 나타낼 때 사용
    - 배열과 함께 호출 시에는 `*`를 붙여주어야 한다.

<br/>

## 3. Kotlin에서의 OOP

### 3-1. [Kotlin에서 클래스를 다루는 방법](src/main/java/io/dongvelop/lec09/Person.kt)

- 코틀린에서는 필드를 만들면 자동으로 Getter와 (필요에 따라) Setter가 생성된다.
    - 때문에 이를 `프로퍼티`라고 부른다.
- 코틀린에서는 주 생성자가 필수이다.
    - `contstructor` 키워드로 부생성자를 작성할 수 있지만, 정적 팩토리 메서드를 추천
- 실제 메모리에 있는 것과 무관하게 Custom Getter/Setter를 작성할 수 있다.
    - 실제 함수로 만들거나, 프로퍼티처럼 보이도록 커스텀 Getter를 만들거나
- Custom Getter/Setter에서 무한루프가 발생하지 않도록 `field` 키워드를 이용할 수 있으며, 이를 `backing field` 라고 부른다.

<br/>

### [3-2. Kotlin에서 상속을 다루는 방법](src/main/java/io/dongvelop/lec10/Penguin.kt)

- 상속 또는 구현할 때에 extends 키워드가 아닌 `:`를 사용한다.
- 상위 클래스를 상속할 때, 반드시 생성자를 명시하여 호출해야 한다.
- 인터페이스에서 `default` 키워드를 사용하지 않아도 메서드 구현이 가능하다.
- `override` 키워드는 필수로 붙여야 한다.
- 프로퍼티에 접근하기 위해서는 `open` 키워드를 붙여주어야 한다.
- **상위 클래스의 생성자/초기화_블록 에서 open 프로퍼티를 사용하면 예상하지 못한 버그가 발생할 수 있다.**
- 특정 상위 인터페이스의 메서드를 호출시, 아래와 같이 호출한다.
    - `super<Swimable>.act()`

<br/>

### 3-3. [Kotlin에서 접근 제어를 다루는 방법](src/main/java/io/dongvelop/lec11/StringUtils.kt)

- 코틀린에서는 패키지가 namespace 관리용이기 때문에 `protected`의 의미가 달라졌다.
- 코틀린에서는 `default`가 사라지고, 모듈 간의 접근을 제어하는 `internal`이 새로 생겼다.
- 생성자에 접근 지시어를 붙일 때면, `constructor`를 명시적으로 써주어야 한다.
- 유틸성 함수를 만들 때는 파일 최상단에 작성하면 편하다.
- 프로퍼티의 custom setter에 접근 지시어를 붙일 수 있다.
- Java에서 Kotlin 코드를 사용할 때 `internal`과 `protected`는 주의해야 한다.
    - `internal`은 바이트 코드 상 `public`이 된다.
        - 때문에 Java 코드에서는 Kotlin 모듈의 internal 코드를 가져올 수 있다.
    - Kotlin의 `protected`와 Java의 `protected`는 다르다.
        - Java는 같은 패키지의 Kotlin `protected` 멤버에 접근할 수 있다.

**Java의 접근제한자**

| 접근 제한자    | 설명                      |
|-----------|-------------------------|
| public    | 모든 곳에서 접근 가능            |
| protected | 같은 패키지 & 하위 클래스에서 접근 가능 |
| default   | 같은 패키지에서만 접근 가능         |
| private   | 선언된 클래스에서만 접근 가능        |

**Kotlin의 접근 제어**

| 접근 제한자    | 설명                       |
|-----------|--------------------------|
| public    | 모든 곳에서 접근 가능             |
| protected | 선언된 클래스 & 하위 클래스에서 접근 가능 |
| internal  | 같은 모듈에서만 접근 가능           |
| private   | 선언된 클래스에서만 접근 가능         |

<br/>

### [3-4. Kotlin에서 object 키워드를 다루는 방법](src/main/java/io/dongvelop/lec12/Person.kt)

- Java의 `static` 변수와 함수를 만드려면, Kotlin에서는 `companion object`를 이용한다.
- `companion object`도 객체이기 때문에 이름을 지정할 수 있고, 다른 타입을 상속받을 수 있다.
    - `@JvmStatic`을 이용하면 호출하는 코드에서 Companion 객체의 이름을 생략하여 호출 가능하다.
- Kotlin에서 싱글톤 클래스를 만들 때는 `object` 키워드를 이용한다.
- Kotlin에서 익명 클래스를 만들 때는 `object : ${타입}`을 이용한다.

<br/>

### 3-5. [Kotlin에서 중첩 클래스를 다루는 방법](src/main/java/io/dongvelop/lec13/House.kt)

- 클래스 내부에 클래스가 있는 경우는 크게 두 가지가 존재한다.
    1. (Java 기준) Static으로 명시된 클래스 => **권장하는 방법**
        - 바깥 클래스를 참조 불가
    2. (Java 기준) Static으로 명시되지 않은 클래스
        - 바깥 클래스를 참조 가능.
- 코틀린에서는 기본적으로 내부 클래스를 작성하면 Static으로 명시된 것처럼 동작.
- 외부 클래스를 참조해야 할 경우, `inner class` 와 같이 명시한다.
    - 참조 문법 => `this@외부클래스.field`

<br/>

### 3-6. [Kotlin에서 다양한 클래스를 다루는 방법](src/main/java/io/dongvelop/lec14/PersonDto.kt)

- `Data Class`를 이용하면 `equals`, `hashCode`, `toString`을 자동으로 만들어준다.
- `Enum Class`는 Java의 Enum과 동일, `when` 키워드와 함께 사용하면 큰 장점을 갖는다.
- `Sealed Class`는 하위 클래스를 제한하며, 동일한 패키지 내에 위치해야 한다.

<br/>

## 4. Kotlin에서의 FP

### 4-1. [Kotlin에서 배열과 컬렉션을 다루는 방법](src/main/java/io/dongvelop/lec15/Lec15Main.kt)

- 배열의 사용법이 약간 다르다.
    - `arrayOf()`, `array.withIndex()`
- Kotlin에서는 컬렉션을 만들 때에도 불변/가변을 지정해야 한다.
- **Java <-> Kotlin 코드를 섞어 컬렉션을 사용할 때에는 주의가 필요하다.**
    - Java에서 Kotlin의 불변 컬렉션을 수정할 수 있고, non-nullable 컬렉션에 null을 넣을 수도 있다.
    - Kotlin에서 Java 컬렉션을 사용할 때에는 플랫폼 타입을 주의해야 한다.
        - : 코틀린에서는 `List<Int?>`, `List<Int>?`, `List<Int?>?` 이 모두 다른 의미

<br/>

### 4-2. [Kotlin에서 다양한 함수를 다루는 방법](src/main/java/io/dongvelop/lec16/StringUtils.kt)

- **Java 코드가 존재하는 상황에서, Kotlin 코드로 추가 기능을 개발하기 위해 확장 함수와 확장 프로퍼티가 등장**.
- **확장 함수** : 클래스 외부에 선언하되, 멤버함수인 것 처럼 호출하기 위함
    - 확장 함수에서는 원본 클래스의 private, protected 멤버 접근이 불가능하다.
    - 멤버 함수, 확장 함수의 시그니처가 같을 경우 멤버 함수에 우선권이 있다.
    - 확장 함수는 현재 타입을 기준으로 호출된다.
    - Java에서는 Kotlin에 존재하는 확장 함수를 정적 메서드처럼 호출할 수 있다.
- **중위 함수** : 함수의 호출 방식을 바꿔주는 방식
    - 변수와 매개변수가 하나일 때, `infix` 키워드로 선언 가능
    - `변수.메서드(매개변수)` 꼴 대신, `변수 메서드 매개변수`로 선언이 가능.
- **인라인 함수** : 함수가 호출되는 대신, 함수를 호출한 지점에 함수 본문을 그대로 복붙
    - `lnline` 키워드를 이용.
    - **함수를 파라미터로 전달할 때, 오버헤드를 줄일 수 있음.**
    - **하지만, 성능 측정과 함께 신중하게 사용되어야 함.**
- **지역 함수** : 함수 안에 함수를 선언
    - 함수로 추출하면 좋을 것 같은데, 현재 함수 내에서만 사용하고 싶을 때 사용
    - 코드의 depth가 깊어지지도 하고, 깔끔하지는 않다.

<br/>

### 4-3. [Kotlin에서 람다를 다루는 방법](src/main/java/io/dongvelop/lec17/Lec17Main.kt)

- 함수는 Java에서는 2급 시민이지만, **코틀린에서는 1급 시민**이다.
    - 때문에 함수 자체를 변수에 넣을 수도 있고, 파라미터로 전달할 수도 있다.
- 코틀린에서 람다는 두 가지 방법으로 만들 수 있고, `{ }` 방법이 더 많이 사용된다.
  ```kotlin
  // 람다를 직접 호출하는 방법 1
  val isApple  = fun(fruit: Fruit): Boolean {
      return fruit.name == "사과"
  }
  
  // 람다를 직접 호출하는 방법 2
  val isApple2 = { fruit: Fruit -> fruit.name == "사과" }
  ```
- 함수를 호출하며, 마지막 파라미터인 람다를 쓸 때는 소괄호 밖으로 람다를 뺄 수 있다.
  ```kotlin
  // AS-IS
  val filteredFruit2 = filterFruit(fruits, { fruit: Fruit -> fruit.name == "사과" })
  
  // TO-BE
  val filteredFruit3 = filterFruit(fruits) { fruit: Fruit -> fruit.name == "사과" }
  ```
- 파라미터가 한 개인 람다를 쓸 때에는, `it`을 통해 접근할 수 있다.
  ```kotlin
  // 호출 예시 Step 4 : fruit 변수의 타입이 추론이 가능하므로 생략.
  val filteredFruit4 = filterFruit(fruits) { fruit -> fruit.name == "사과" }
  
  // 호출 예시 Step 5 : fruit 변수 간소화
  val filteredFruit5 = filterFruit(fruits) { it.name == "사과" }
  ```
- 람다의 마지막 expression 결과는 람다의 반환 값이다.
  ```kotlin
  filterFruit(fruits) {
      println("사과만 받는다.")
      it.name == "사과" // return value
  }
  ```
- 코틀린에서는 `Closure`를 사용하여 `non-final` 변수도 람다에서 사용할 수 있다.

<br/>

### 4-4. [Kotlin에서 컬렉션을 함수형으로 다루는 방법](src/main/java/io/dongvelop/lec18/Lec18Main.kt)

- filter : `filter`, `filterIndexed`, `all`, `none`, `any`
- map : `map`, `mapIndexed`, `mapNotNull`
- 공통 : `count`, `sortedBy`, `sortedByDescending`, `distinct`, `first`, `firstOrNull`, `last`, `lastOrNull`
- 기타 : `groupBy`, `associateBy`, `flatMap`, `flatten`

<br/>

## 5. 추가적으로 알아두어야 할 코틀린 특성

### 5-1. [Kotlin의 이모저모](src/main/java/io/dongvelop/lec19/Lec19Main.kt)

- 타입에 대한 별칭을 줄 수 있는 `typealias`라는 키워드가 존재한다.
- Import 당시 이름을 바꿀 수 있는 `as import` 기능이 존재한다.
- 변수를 한 번에 선언하여 값을 할당하는 `구조분해` 기능이 있으며, `componentN` 함수를 사용한다.
- for, while 문과 달리 forEach에서는 break와 continue를 사용할 수 없다.
    - 반복문에 `라벨이름@` 꼴의 라벨을 붙일 수 있다.
- `takeIf`와 `takeUnless`를 활용해 코드 양을 줄이고 method chaining을 활용할 수 있다.

<br/>

### 5-2. [Kotlin의 scope function](src/main/java/io/dongvelop/lec20/Lec20Main.kt)

- `Scope Function`이란?
    - 람다를 사용해 일시적인 영역을 만들고, 코드를 더 간결하게 하거나, Method Chaining에 활용하는 함수를 의미한다.
- Scope Function을 사용하면 사람에 따라 가독성을 다르게 느낄 수 있다.
    - 따라서, 팀에서 컨벤션을 적절하게 정의해야 한다.
- Scope Function 종류

| 함수      | 호출 방식               | 람다 수신자 | 반환값   | 주로 쓰는 상황               |
|---------|---------------------|--------|-------|------------------------|
| `let`   | 확장 함수 (`obj.let`)   | `it`   | 람다 결과 | null-safe 처리, 값 가공     |
| `run`   | 확장 함수 (`obj.run`)   | `this` | 람다 결과 | 객체 기반 계산 및 컨텍스트 구성     |
| `also`  | 확장 함수 (`obj.also`)  | `it`   | 원본 객체 | 로깅, 디버깅, 체이닝 중간 사이드이펙트 |
| `apply` | 확장 함수 (`obj.apply`) | `this` | 원본 객체 | 객체 초기화 및 설정            |
| `with`  | 일반 함수 (`with(obj)`) | `this` | 람다 결과 | 특정 객체 컨텍스트에서 여러 작업 수행  |

