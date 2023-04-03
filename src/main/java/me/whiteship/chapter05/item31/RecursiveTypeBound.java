package me.whiteship.chapter05.item31;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class RecursiveTypeBound {

    public static <E extends Comparable<? super E>> E max(List<? extends E> list) {
        if (c.isEmpty()) {
            throw new IllegalArgumentException("컬렉션이 비어 있습니다.");
        }

        E result = null;
        for (E e : c)
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);

        return result;
    }

    public static void main(String[] args) {
//        List<IntegerBox> list = new ArrayList<>();
//        list.add(new IntegerBox(10, "keesun"));
//        list.add(new IntegerBox(2, "whiteship"));
//
//        System.out.println(max(list));
    }
}
