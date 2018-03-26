package test37;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            if(s.length()<=1){
                System.out.println(1);
            }
            char[] c = s.toCharArray();
            int count = 1;
            int max = 0;
            for (int i = 1; i < c.length; i++) {
                if(c[i]!=c[i-1]){
                    count++;
                }else {
                    max = Math.max(max,count);
                    count = 1;
                }
            }
            max = Math.max(max,count);
            System.out.println(max);
        }
    }
}
