package test9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int sum = 0;
            int num = 0;
            String s = sc.next();
            while (s.length() != 0) {
                int end = getFirstEnd(s);
                sum+=end+1;
                num+=1;
                if (end == s.length() - 1) {
                    break;
                } else {
                    s = s.substring(getFirstEnd(s) + 1);
                }
            }
//            DecimalFormat df = new DecimalFormat("#.00");
            System.out.printf("%.2f\n",(double) sum/num);
        }
    }

    public static int getFirstEnd(String s) {
        char[] c = s.toCharArray();
        char a = c[0];
        int p = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == a) {
                p=i;
                continue;
            } else {
                p = i-1;
                break;
            }
        }
        return p;
    }
}
