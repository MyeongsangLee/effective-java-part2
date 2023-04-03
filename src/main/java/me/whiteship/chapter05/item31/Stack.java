package me.whiteship.chapter05.item31;

import java.util.*;

public class Stack<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unckecked")
    public Stack() {
        this.elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        E result = elements[--size];
        elements[size] = null;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            Arrays.copyOf(elements, 2 * size + 1);
        }
    }

//    public void pushAll(Iterable<E> src) {
//        for (E e : src) {
//            push(e);
//        }
//    }

    public void pushAll(Iterable<? extends E> src) {
        for (E e : src) {
            push(e);
        }
    }

    public void popAll(Collection<? super E> dst) {
        while (!isEmpty()) {
            dst.add(pop());
        }
    }

    public static void main(String[] args) {
        Stack<Number> numberStack = new Stack<>();
        Iterable<Integer> integers = Arrays.asList(3, 2, 4, 1, 5, 9);
        numberStack.pushAll(integers);

        Iterable<Double> doubles = Arrays.asList(3.1, 2.1, 4.1, 1.1, 5.2, 9.2);
        numberStack.pushAll(doubles);

        ArrayList<Object> objects = new ArrayList<>();
        numberStack.popAll(objects);

        System.out.println(objects);
    }

}
