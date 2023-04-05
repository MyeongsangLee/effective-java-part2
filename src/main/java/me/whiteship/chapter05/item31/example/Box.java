package me.whiteship.chapter05.item31.example;


public class Box <T extends Comparable<T>> implements Comparable<Box<T>>  {

    protected T value;

    public Box(T value) {
        this.value = value;
    }

    public void change(T value) {
        this.value = value;
    }

    @Override
    public int compareTo(Box<T> o) {
        return this.value.compareTo((T)o.value);
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }
}
