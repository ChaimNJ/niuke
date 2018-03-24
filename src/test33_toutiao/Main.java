package test33_toutiao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String[] strings= new String[n];
            for (int i = 0; i < n; i++) {
                strings[i]=sc.next();
            }
            for (int i = 0; i < n; i++) {
//                printNum(caculate(strings[i]));
            }
            
        }
    }

//    private static String caculate(String string) {
//
//    }
//
//    private static void printNum(String string) {
//
//
//    }
}
