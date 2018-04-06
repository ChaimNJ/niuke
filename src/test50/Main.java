package test50;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String s_lower = s.toLowerCase();
            String[] f = new String[26];
            for (int i = 0; i < s.length(); i++) {
                if (s_lower.charAt(i) >= 'a' && s_lower.charAt(i) <= 'z') {
                    if (f[s_lower.charAt(i) - 'a'] == null) {
                        f[s_lower.charAt(i) - 'a'] = String.valueOf(s.charAt(i));
                    } else {
                        f[s_lower.charAt(i) - 'a'] += String.valueOf(s.charAt(i));
                    }
                }
            }
            String string = "";
            for (int i = 0; i < f.length; i++) {
                if (f[i] != "" && f[i] != null) {
                    string += f[i];
                }
            }
            int cnt = 0;
            StringBuffer sb = new StringBuffer();
            int j = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    if (s.charAt(cnt) != string.charAt(j)) {
                        sb.append(string.charAt(j));
                    } else {
                        sb.append(s.charAt(cnt));
                    }
                    j++;
                } else {
                    sb.append(s.charAt(i));
                }

            }
            System.out.println(sb.toString());

        }
    }
}
