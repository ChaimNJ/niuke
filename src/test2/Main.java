package test2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        String s ="";
            s = sc.next();
            String pre = s.toLowerCase();
            s=sc.next();
            String goal = s.toLowerCase();
            String [] a = pre.split(goal.toLowerCase());
            System.out.println(a.length-1);
    }
}
