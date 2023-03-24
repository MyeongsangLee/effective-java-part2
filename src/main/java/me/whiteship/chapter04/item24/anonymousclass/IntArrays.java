package me.whiteship.chapter04.item24.anonymousclass;

import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class IntArrays {
    static List<Integer> intArrayAsList(int[] a) {
        Objects.requireNonNull(a);

        return new AbstractList<Integer>() {
            @Override
            public Integer get(int i) {
                return a[i];
            }

            @Override
            public int size() {
                return a.length;
            }

            @Override
            public Integer set(int i, Integer val) {
                int oldVal = a[i];
                a[i] = val;
                return oldVal;
            }
        };
    }

    public static void main(String[] args) {
        int[] ints = new int[10];
        for (int i = 0; i < ints.length ; i++) {
            ints[i] = i;
        }

        List<Integer> list = intArrayAsList(ints);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
