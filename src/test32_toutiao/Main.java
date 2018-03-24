package test32_toutiao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int cnt = 0;
            if (a >= 6)
                while (a != 0 && a % 3 == 0) {
                    if (a % 6 == 0) {
                        cnt += 3;
                        a = a / 6;
                    }else {
                        cnt += 2;
                        a = a / 3;
                    }
                }
            while (a != 0 && a % 2 == 0) {
                cnt += a / 2;
                a = a % 2;
            }
            if (a != 0)
                cnt += a - 1;
            System.out.println(cnt);
        }
    }
}
