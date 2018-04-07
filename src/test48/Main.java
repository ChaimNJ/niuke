package test48;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            String result = "OK";
            if (s.length() <= 8) {
                result = "NG";
            }
            int[] f = new int[4];
            if (Pattern.matches(".*[a-z]+.*", s)) {
                f[0] = 1;
            }
            if (Pattern.matches(".*[A-Z]+.*", s)) {
                f[1] = 1;
            }
            if (Pattern.matches(".*\\d+.*", s)) {
                f[2] = 1;
            }
            if (Pattern.matches(".*\\W+.*", s)) {
                f[3] = 1;
            }
            int sum = 0;
            for (int i = 0; i < f.length; i++) {
                sum += f[i];
            }
            if (sum < 3) {
                result = "NG";
            }
            for (int i = 0; i < s.length()-1; i++) {
                for (int j = 3; j < s.length()/2&&(i+j)<s.length(); j++) {
                    if(s.substring(i+1).contains(s.substring(i,i+j))){
                        result ="NG";
                    }
                }
            }
            System.out.println(result);
        }
    }
}

