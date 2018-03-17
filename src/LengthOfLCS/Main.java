package LengthOfLCS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            System.out.println(getRe(s1,s2));
        }
    }

    public static int getRe(String s1, String s2) {
        if (s1.length() > s2.length()) {
            String tmp = s1;
            s1 = s2;
            s2 = tmp;
        }
        int max = 0;
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        for (int i = 0; i < chars2.length; i++) {
            int start = i;
            for (int j = 0; j < chars1.length; j++) {
                int length=0;
                for (int k = j; k <chars1.length ; k++) {
                    if(start>=chars2.length){
                        break;
                    }
                    if(chars1[k]==chars2[start]){
                        length++;
                    }else{
                        max = Math.max(length,max);
                        length = 0;
                        k=j-1;
                    }
                    start++;
                }
                max = Math.max(length,max);
                start=i;
            }
        }
        return max;
    }

}
