package test15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int capcity = sc.nextInt();
            int[] boss = new int[num];
            for (int i = 0; i < num; i++) {
                boss[i] = sc.nextInt();
            }
            System.out.println(getResult(capcity, boss));
        }
    }

    public static int getResult(int capacity, int[] boss) {
        for (int i = 0; i < boss.length; i++) {
            if (capacity >= boss[i]) {
                capacity += boss[i];
            } else {
                capacity += MaxDivisor(capacity, boss[i]);
            }
        }
        return capacity;
    }

    public static int MaxDivisor(int a, int b) {
        int min = a>b?b:a;
        int maxdivisor = 1;
        for (int i = 1; i <= min ; i++) {
            if(a%i == 0&&b%i==0){
                maxdivisor = i;
            }
        }
        return maxdivisor;
    }
}
