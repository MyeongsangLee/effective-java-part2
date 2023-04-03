package me.whiteship.chapter05.item29.technique1;

import java.util.Arrays;
import java.util.List;

public class Stack<E> {
    private E[] elements;
    private int size = 0;

    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        elements[size++] = e;
    }

    public E pop() {
        ensureCapacity();
        E result = elements[--size];
        elements[size] = null;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        for (String arg : List.of("a", "b", "c"))
            stack.push(arg);
        while (!stack.isEmpty())
            System.out.println((stack.pop()).toUpperCase());
    }

}
