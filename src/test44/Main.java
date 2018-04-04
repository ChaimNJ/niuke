package test44;

import org.omg.CORBA.MARSHAL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            int l = sc.nextInt();
            System.out.println(getRe(s, l));
        }
    }

    //O(n^2)
    private static int getResult(String s, int l) {
        int max = 1;
        int pos = 0;
        for (int i = 1; i < l - 1; i++) {
            int left = i - 1;
            int right = i + 1;
            int tmpmax = 1;
            int f = 1;
            while (left >= 0 && right < l) {
                if (s.charAt(left) == s.charAt(i) && f == 1) {
                    left--;
                    tmpmax++;
                } else if (s.charAt(i) == s.charAt(right) && f == 1) {
                    right++;
                    tmpmax++;
                } else if (s.charAt(left) == s.charAt(right)) {
                    tmpmax += 2;
                    left--;
                    right++;
                    f = 0;
                } else {
                    break;
                }
            }
            max = Math.max(max, tmpmax);
        }
        return max;
    }

    //动态规划
    public static int getRe(String s, int l) {
        boolean[][] dp = new boolean[l][l];
        int max = 0;
        for (int d = 0; d < l; d++) {
            for (int i = 0; i < l - d; i++) {
                int j = i + d;
                if (s.charAt(i) == s.charAt(j)) {
                    if (d == 0 || d == 1) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                    if (dp[i][j])
                        max = Math.max(max, d + 1);
                }
            }
        }
        return max;
    }

        //暴力O(n^3)

    public static int getLongestPalindrome(String s, int l) {
        int max = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                String s1 = s.substring(i, j);
                if (ishuiwen(s)) {
                    max = Math.max(s1.length(), max);
                }
            }
        }
        return max;
    }

    public static boolean ishuiwen(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
