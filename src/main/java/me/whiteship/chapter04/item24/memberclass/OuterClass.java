package me.whiteship.chapter04.item24.memberclass;

public class OuterClass {

    private int number = 10;

    private class InnerClass {
        void doSomething() {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new OuterClass().new InnerClass();
        innerClass.doSomething();
    }

}
