package test026;

import java.util.*;

public class MaxInnerRec {
    public static int countArea(int[] A, int n) {
        return count(A,0,n-1);
    }
    public static int count(int[] A,int start,int end){
        if(start>end){
            return 0;
        }
        if(start==end){
            return A[start];
        }
        int minP = 0;
        int min  = 999999;
        for(int i = start;i<=end;i++){
            if(A[i]<min){
                min = A[i];
                minP = i;
            }
        }
        int cuArea = Math.max(min*(end-start+1),count(A,start,minP-1));
        cuArea = Math.max(cuArea,count(A,minP+1,end));
        return cuArea;
    }

    public static void main(String[] args) {
        int[] A = new int[]{2,7,9,4,1};
        int n= 5;
        countArea(A,5);
    }

}
