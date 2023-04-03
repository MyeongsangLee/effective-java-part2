package me.whiteship.chapter05.item30._02_after;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class GenericSingletonFactory {
    private static UnaryOperator<Object> INDENTITY_FN = (t -> t);

    public static <T> UnaryOperator<T> identityFunction() {
        return (UnaryOperator<T>) INDENTITY_FN;
    }

    // 코드 30-5 제네릭 싱글턴을 사용하는 예 (178쪽)
    public static void main(String[] args) {
        String[] strings = { "삼베", "대마", "나일론" };
        Function<String, String> sameString = identityFunction();
        for (String s : strings)
            System.out.println(sameString.apply(s));

        Number[] numbers = { 1, 2.0, 3L };
        Function<Number, Number> sameNumber = identityFunction();
        for (Number n : numbers)
            System.out.println(sameNumber.apply(n));
    }

}
