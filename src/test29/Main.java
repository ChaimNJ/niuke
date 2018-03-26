package test29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintService service = new PrintService();
        for (int i = 0; i < 20; i++) {
            Thread a = new Thread(new TheadA(service));
            Thread b = new Thread(new ThreadB(service));
            a.start();
            b.start();
        }

    }
}
