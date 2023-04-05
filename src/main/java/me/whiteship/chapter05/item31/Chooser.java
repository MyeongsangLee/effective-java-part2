package me.whiteship.chapter05.item31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser<T> {
    private final List<T> choiceList;

    public Chooser(Collection<? extends T> choices) {
        this.choiceList = new ArrayList<>(choices);
    }

    public T choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }

    public static void main(String[] args) {
        //List<Integer> lists = List.of(1, 2, 3, 4, 5, 6);
        List<Double> lists = List.of(1.1, 2.1, 3.2, 4.5, 5.6, 6.7);

        Chooser<Number> chooser = new Chooser(lists);

        for (int i = 0; i < 10; i++) {
            Number choice = chooser.choose();
            System.out.println(choice);
        }

    }
}
