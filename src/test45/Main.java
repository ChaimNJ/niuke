package test45;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String[] string = s.split(" ");
            Stack stack = new Stack();
            for (int i = 0; i < string.length; i++) {
                stack.push(string[i]);
            }
            for (int i = 0; i < string.length-1; i++) {
                System.out.print(stack.pop()+" ");
            }
            System.out.print(stack.pop());
        }
    }
}
