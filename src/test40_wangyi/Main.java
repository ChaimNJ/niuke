package test40_wangyi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String s = sc.next();
            char[] c = s.toCharArray();
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if('L'==c[i]){
                    cnt--;
                }else{
                    cnt++;
                }
            }
            cnt%=4;
            String p ="";
            switch (cnt){
                case -3:p="E";break;
                case -2:p="S";break;
                case -1:p="W";break;
                case 1:p="E";break;
                case 2:p="S";break;
                case 3:p="W";break;
                case 0:p="N";break;
            }
            System.out.println(p);

        }
    }
}
