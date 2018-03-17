package test13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            System.out.println(getRe(a));
        }
    }

    public static int getRe(int a) {
        int[] b = new int[]{1, 2, 4, 11, 57, 1596};
        int[] b1 = new int[b.length];
        int tmp = a;
        while (tmp >= 5) {
            if (tmp - 100 >= 0) {
                b1[5]++;
                tmp -= 100;
                continue;
            } else if (tmp - 50 >= 0) {
                b1[4]++;
                tmp -= 50;
                continue;
            } else if (tmp - 20 >= 0) {
                b1[3]++;
                tmp -= 20;
                continue;
            } else if (tmp - 10 >= 0) {
                b1[2]++;
                tmp -= 10;
                continue;
            } else if (tmp - 5 >= 0) {
                b1[1]++;
                tmp -= 5;
                continue;
            }
        }
        int sum = 1;
        for (int i = 1; i < b.length; i++) {
                sum *= Math.pow(b[i],b1[i]);
        }
        return sum;

    }
}
