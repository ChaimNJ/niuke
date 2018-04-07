package test49;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            int[] max = new int[26];
            char[] ch = s.toCharArray();
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < ch.length; i++) {
                max[ch[i]-'a']++;
                min=min>max[ch[i]-'a']?max[ch[i]-'a']:min;
            }
            for (int i = 0; i < max.length; i++) {
                if(max[i]==min){
                    s = s.replaceAll(String.valueOf((char)(i+'a')),"");
                }
            }
            System.out.println(s);
        }
    }
}
