package test14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
            }
            System.out.println(getRe(arr,0,arr.length-1));
        }
    }

    public static int getRe(int[] arr,int start,int end){
        if(start>end){
            return 0;
        }
        if(start==end){
            return arr[start];
        }
        int min = Integer.MAX_VALUE;
        int pos = -1;
        int area = 0;
        for (int i = start; i <= end; i++) {
            if(arr[i]<min){
                min = arr[i];
                pos=i;
            }
        }
        area = min*(end-start+1);
        int lefrarea = getRe(arr,start,pos-1);
        int rightarea = getRe(arr,pos+1,end);
        return Math.max(area,Math.max(lefrarea,rightarea));

    }
}
