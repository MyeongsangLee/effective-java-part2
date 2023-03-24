package me.whiteship.chapter04.item24.anonymousclass;

public class MyAnony {

    private int number = 10;

    void printNumber() {
        System.out.println(number);
    }


    public static void main(String[] args) {
        MyAnony myAnony = new MyAnony() {
            public void myMethod() {
                System.out.println(10);
            }

            @Override
            void printNumber() {
                System.out.println(20);
            }
        };

        myAnony.printNumber();
        //myAnony.myMethod();
    }
}
