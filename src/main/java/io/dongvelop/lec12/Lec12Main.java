package io.dongvelop.lec12;

public class Lec12Main {

  public static void main(String[] args) {
//     Person.Companion.newBaby("ABC");
    Person.Factory.newBaby("ABC");

    // @JvmStatic 애너테이션을 명시함으로써 이름 생략 가능.
    Person.newBaby("ABC");
  }

}
