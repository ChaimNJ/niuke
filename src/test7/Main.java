package test7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long a = sc.nextLong();
            getResult(a);
        }
    }

    public static void getResult(long a) {
        StringBuffer sb = new StringBuffer();
        while (a != 0) {
            if (a % 2 == 0) {
                a = (a - 2) / 2;
                sb.insert(0, "2");
            } else {
                a = (a - 1) / 2;
                sb.insert(0, "1");
            }
        }
        System.out.println(sb.toString());
    }
}
