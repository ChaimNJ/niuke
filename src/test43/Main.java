package test43;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int w = sc.nextInt();
            int[] we = new int[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                we[i] = sc.nextInt();
                sum+=we[i];
            }
            Arrays.sort(we);
            int cnt = 0;
            if(w>=sum){
                System.out.println((int)Math.pow(2,n));
            }else{
                for (int i = 0; i < n; i++) {
                    int tmpsum = 0;
                    for (int j = i; j <n; j++) {
                        tmpsum+=we[j];
                        if(tmpsum<=w){
                            cnt+=Math.pow(2,j-i+1)-1;
                        }else{
                            break;
                        }
                    }
                }
                System.out.println(cnt);
            }


        }
    }
}
