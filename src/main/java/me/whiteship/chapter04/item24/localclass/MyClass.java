package me.whiteship.chapter04.item24.localclass;

public class MyClass {

    private int number = 10;

    void doSomething() {
        class InnerClass {
            void printNumber() {
                System.out.println(number);
            }
        }

        InnerClass innerClass = new InnerClass();
        innerClass.printNumber();
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.doSomething();
    }

}
