package me.whiteship.chapter05.item29.bounded_type;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<E extends Number> {
    private Number[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {

        this.elements = (E[]) new Number[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0)
            throw new EmptyStackException();
        E result = (E) elements[--size];
        this.elements[size] = null;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            this.elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    // 코드 29-5 제네릭 Stack을 사용하는 맛보기 프로그램 (174쪽)
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (Integer arg : List.of(1, 2, 3))
            stack.push(arg);
        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }
}
