package test18;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                double a = sc.nextDouble();
                int b = (a-(int)a)*10>=5?(int)a+1:(int)a;
                System.out.println(b);
            }
        }
    }
