package test11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String year = sc.next();
            String month = sc.next();
            String day = sc.next();
            System.out.println(getResult(year, month, day));
        }
    }

    public static int getResult(String year, String month, String day) {
        int sum = 0;
        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);
        int[] md = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (y % 4 == 0 && y % 100 != 0 && y % 400 == 0) {
            md[1] = 29;
        }
        for (int i = 0; i < m - 1; i++) {
            sum+=md[i];
        }
        sum+=d;
        return sum;
    }
}
