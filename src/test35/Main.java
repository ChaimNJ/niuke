package test35;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s=sc.next();
            System.out.println(getResult(s));
        }
    }

    private static int getResult(String s) {
        Set<Character> set = new HashSet<>();
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            set.add(c[i]);
        }
        if(set.size()==1){
            return 1;
        }else if(set.size()==2){
            return 2;
        }else{
            return 0;
        }
    }
}
