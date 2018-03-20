package test22;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int num = sc.nextInt();
            int[] price = new int[num + 1];
            int[] val = new int[num + 1];
            int[] flag = new int[num + 1];
            for (int i = 1; i <= num; i++) {
                price[i] = sc.nextInt();
                val[i] = sc.nextInt() * price[i];
                flag[i] = sc.nextInt();
            }
            System.out.println(getResult(n, num, price, val, flag));
        }
    }

    private static int getResult(int n, int num, int[] price, int[] val, int[] q) {
        int[][] dp = new int[num+1][n+1];
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <= n; j++) {
                if(q[i]==0)
                {
                    if(price[i]<=j)
                        dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-price[i]]+val[i]);
                }
                if(q[i]>0)
                {
                    if(price[i]+price[q[i]]<=j)
                        dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-price[i]-price[q[i]]]+val[i]+val[q[i]]);
                }
            }

        }
        return dp[num][n];
    }
}
