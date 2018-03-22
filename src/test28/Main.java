package test28;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();
            System.out.println(getResult(s));
        }
    }

    private static String getResult(String s) {
        Map<Integer, Integer> map = new HashMap<>();
        char[] schar = s.toCharArray();
        for (int i = 0; i < schar.length; i++) {
            int cu = schar[i]-'0';
            if (map.containsKey(cu)) {
                map.put(cu, map.get(cu) + 1);
            } else {
                map.put(cu, 1);
            }
        }
        int min  = 10001;
        int num = -1;
        for (int i = 1; i <= 9; i++) {
            if(map.get(i)==null){
                return String.valueOf(i);
            }
            if(map.get(i)<min){
                min = map.get(i);
                num = i;
            }
        }
        if(map.get(0)==null){
            return "10";
        }
        String ss = "";
        for (int i = 0; i <=min ; i++) {
            ss+=String.valueOf(num);
        }
        return ss;

    }
}
