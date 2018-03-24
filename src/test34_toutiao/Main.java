package test34_toutiao;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n  = sc.nextInt();
            int k = sc.nextInt();
            int h = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            System.out.println(getRe(n,k,h,a));
        }
    }

    private static int getRe(int n, int k, int h, int[] a) {
        int pre = 0;
        Arrays.sort(a);
        int start = 0;
        int tmp = 0;
        int g = 0;
        while(k>0){
            for (int i = start; i < n; i++) {
                if(a[i]>pre&&a[i]<=pre+h) {
                    tmp = a[i];
                }
                if(a[i]>pre+h||i==n-1){
                    g=tmp;
                    start = i;
                    break;
                }
            }
            if(g!=pre)
            pre = pre+(g-pre)*2;
            k--;
        }
        return pre;
    }
}
