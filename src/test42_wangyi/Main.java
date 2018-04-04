package test42_wangyi;

import java.util.Scanner;

public class Main {
    public static int a =0;
    public int b = 0;
    public int aa(){
        a++;
        return a;
    }
    public int bb(){
        b++;
        return b;
    }
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.bb());
        System.out.println(m.aa());
    }
}
