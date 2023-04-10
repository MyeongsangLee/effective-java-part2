package me.whiteship.chapter05.item32;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Dangerous {

    static void dangerous(List<String>... stringLists) {
        List<Integer> intList = List.of(42);
        Object[] objects = stringLists;
        objects[0] = intList;  //heap 오염 발생
        String s = stringLists[0].get(0); //ClasCastException
    }

    public static void main(String[] args) {
        //dangerous(Arrays.asList("there be dragons"));
        dangerous(List.of("there be dragons"));
    }
}
