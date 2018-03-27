package test41_wangyi;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long cnt = 0;
            if (k == 0) {
                System.out.println(n * n);
            } else {
                for (int i = k+1; i <=n ; i++) {
                    cnt+=(n/i)*(i-k);
                    if(n/i>=k) cnt+=n/i-k+1;
                }
                System.out.println(cnt);
            }
//            for (int i = 1; i <=n-k ; i++) {
//                cnt+=i;
//            }
//
//            for (int i = k; i <=n ; i++) {
//                for (int j = 2; j <=i-k ; j++) {
//                    if(i%j>=k){
//                        cnt++;
//                    }
//                }
//            }
            System.out.println(cnt);
        }
    }
}
