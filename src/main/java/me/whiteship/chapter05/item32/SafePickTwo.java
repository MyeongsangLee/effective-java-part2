package me.whiteship.chapter05.item32;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class SafePickTwo {

    static <T> List<T> pickTwo(T a, T b, T c) {
        switch (ThreadLocalRandom.current().nextInt(3)) {
            case 0 :
                return List.of(a, b);
            case 1 :
                return List.of(a, c);
            case 2 :
                return List.of(b, c);
        }
        throw new AssertionError(); //도달 할 수 없다.
    }

    public static void main(String[] args) {
        List<String> attributes = pickTwo("좋은", "빠른", "저렴함");
        System.out.println(attributes);
    }
}
