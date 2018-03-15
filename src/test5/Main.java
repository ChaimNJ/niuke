package test5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String f = sc.nextLine();
            int l = f.length();
            if (l % 8 != 0) {
                for (int i = 0; i < 8 - l % 8; i++) {
                    f += "0";
                }
            }
            while(f.length()!=0) {
                System.out.println(f.substring(0, 8));
                f=f.substring(8);
            }
        }

    }
}
