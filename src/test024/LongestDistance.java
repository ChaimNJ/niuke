package test024;

import java.util.*;

public class LongestDistance {
    public int getDis(int[] A, int n) {
        int maxd = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[j] - A[i] > maxd) {
                    maxd = A[j]-A[i];
                }
            }
        }
        return maxd;
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{1,2},{2,3,4}};
        System.out.println(a.length);
    }
}
