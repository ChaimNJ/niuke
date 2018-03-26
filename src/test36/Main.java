package test36;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
            }
            if(getResult(num)){
                System.out.println("Possible");
            }else{
                System.out.println("Impossible");
            }
        }
    }

    private static boolean getResult(int[] num) {
        if(num.length<=2){
            return true;
        }
        Arrays.sort(num);
        int d = num[1]-num[0];
        for (int i = 2; i < num.length; i++) {
            if(num[i]-num[i-1]!=d){
                return false;
            }
        }
        return true;
    }
}
