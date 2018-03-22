package test27_meituan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String a = sc.next();
            String b = sc.next();
            int num = a.length()-b.length()+1;
            int dsum = 0;
            for (int i = 0; i < num; i++) {
                dsum+=getDistance(a.substring(i,i+b.length()),b);
            }
            System.out.println(dsum);
        }
    }

    private static int getDistance(String substring, String b) {
        int d=0;
        for (int i = 0; i < b.length(); i++) {
            if (substring.charAt(i)!= b.charAt(i)){
                d++;
            }
        }
        return d;
    }
}
