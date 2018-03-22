package test23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int input = scanner.nextInt();
            System.out.println(getResult(input));
        }
    }

    private static int getResult(int input) {
        int num = 1;
        int count = 2;
        int day = 1;
        while(day<input){
            if(count%2==0){
                if(input<(day+count/2)){
                    num+=input -day;
                    day +=input -day;
                }else {
                    day += count / 2;
                    num += count / 2;
                }
            }else{
                num--;day++;
            }
            count++;
        }
        return num;
    }
}
