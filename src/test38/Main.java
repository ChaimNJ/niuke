package test38;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            getResult(arr);
        }
    }

    private static void getResult(int[] arr) {
        int[] tmp = new int[arr.length];
        int start = 0;
        int end = arr.length-1;
        for (int i = arr.length-1,cnt = 0; i >=0; i--,cnt++) {
            if(start>end){
                break;
            }
            if(cnt%2==0){
                tmp[start++] = arr[i];
            }else{
                tmp[end--]=arr[i];
            }
        }

        for (int i = 0; i < tmp.length; i++) {
            if(i==tmp.length-1) {
                System.out.print(tmp[i]);
            }else{
                System.out.print(tmp[i]+" ");
            }
        }
    }
}
