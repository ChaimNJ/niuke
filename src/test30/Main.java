package test30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Thread_B b = new Thread_B();
        Thread_A a = new Thread_A(b);
        a.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread_C c =new Thread_C(b);
        c.start();

    }
}
