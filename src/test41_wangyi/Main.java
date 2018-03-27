package test41_wangyi;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n =sc.nextInt();
            int k =sc.nextInt();
            int cnt = 0;
            for (int i = 1; i <=n-k ; i++) {
                cnt+=i;
            }

            for (int i = k; i <=n ; i++) {
                for (int j = 2; j <=i-k ; j++) {
                    if(i%j>=k){
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
