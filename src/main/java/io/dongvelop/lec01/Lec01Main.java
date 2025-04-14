package io.dongvelop.lec01;

/**
 * Java 에서의 변수를 다루는 방법
 */
public class Lec01Main {

    public static void main(String[] args) {
        /*
         * 아래 두 변수는 가변/불변의 차이.
         */
        long number1 = 10L;       // (1)
        final long number2 = 10L; // (2)

        /*
         * long(Primitive) vs Long(Referenced) 차이가 Kotlin 에서는 존재하지 X
         */
        Long number3 = 1_000L;                       // (3)
        Long number3nullable = null;
        Person person = new Person("이동엽"); // (4)
    }
}
