package LengthOfLastWord;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        String s = "";
        while (sc.hasNext()) {
            s = sc.next();
            String[] re = s.split(" ");
            System.out.println(re[re.length-1].length());
        }
    }
}



