package test12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int re=0;
            switch (a){
                case 1:re=1;break;
                case 2:re=2;break;
                case 3:re=4;break;
                case 4:re=8;break;
                case 5:re=16;break;
                case 6:re=32;break;
            }
            System.out.println(re);
        }
    }
}
