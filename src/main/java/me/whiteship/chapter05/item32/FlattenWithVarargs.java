package me.whiteship.chapter05.item32;

import java.util.ArrayList;
import java.util.List;

public class FlattenWithVarargs {

    static <T> List<T> flatten(List<? extends T>... lists) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists) {
            result.addAll(list);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> flatList = flatten(List.of(1, 2), List.of(2, 3), List.of(3, 4));
        System.out.println(flatList);
    }
}
