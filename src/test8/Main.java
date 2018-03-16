package test8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String a = sc.next();
            StringBuffer sb = new StringBuffer(a);
            System.out.println(Integer.parseInt(sb.reverse().toString())+Integer.parseInt(a));
        }
    }

}
