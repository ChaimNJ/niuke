package test31_toutiao;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
            }
            System.out.println(getResult(n, k, num));
        }
    }

    private static int getResult(int n, int k, int[] num) {
        int count = 0;
        int prekey = Integer.MAX_VALUE;
        int preval = Integer.MAX_VALUE;
        Arrays.sort(num);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(num[i] - num[j]) == k) {
                    if (num[i] == prekey||num[j]==preval) {
                        continue;
                    }else{
                        count++;
                        prekey = num[i];
                        preval = num[j];
                    }

                }
            }
        }
        return count;

    }
}
