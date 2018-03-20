package test20;




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            System.out.println(getResult(a));
        }
    }
    public static int getResult(int a){
        StringBuffer sb = new StringBuffer(String.valueOf(a));
        sb = sb.reverse();
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            for (int j = i+1; j < sb.length(); j++) {
                if(sb.charAt(j)==c){
                    sb.deleteCharAt(j);
                }
            }
        }
        return Integer.parseInt(sb.toString());
    }
}

