package test46;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            String[] string = s.split(";");
            int x = 0;
            int y = 0;
            for (int i = 0; i < string.length; i++) {
                if (Pattern.matches("^[WASD]\\d{1,2}$", string[i])) {
                    int d = 0;
                    if (string[i].length() == 2) {
                        d = Integer.parseInt(string[i].substring(1, 2));
                    } else {
                        d = Integer.parseInt(string[i].substring(1, 3));
                    }
                    switch (string[i].charAt(0)) {
                        case 'W':
                            y += d;
                            break;
                        case 'A':
                            x -= d;
                            break;
                        case 'S':
                            y -= d;
                            break;
                        case 'D':
                            x += d;
                            break;
                    }
                }
            }
            System.out.println(x + "," + y);
        }
    }
}
