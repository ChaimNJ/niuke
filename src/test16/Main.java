package test16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int r = sc.nextInt();
            int[][] pos = new int[4][2];
            for (int i = 0; i < 4; i++) {
                pos[i][0] = sc.nextInt();
                pos[i][1] = sc.nextInt();
            }
            System.out.println(getResult(r, pos));
        }
    }

    private static String getResult(int r, int[][] pos) {
        int damage = 0;
        for (int i = 0; i < 3; i++) {
            if (Math.sqrt(Math.pow(pos[i][0] - pos[3][0], 2) + Math.pow(pos[i][1] - pos[3][1], 2)) <= r) {
                damage++;
            }
        }
        return String.valueOf(damage) + "x";
    }
}
