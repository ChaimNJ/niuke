package test6;

import java.util.Scanner;

public class Main {
    public static String getResult(long ulDataInput) {
        String re = "";
        long tmp = ulDataInput;
        for (long i = 2; i <=ulDataInput / 2 && tmp >= 1; i++) {
            if(!isPrime(i)){
                continue;
            }
            if (tmp % i == 0) {
                re += String.valueOf(i) + " ";
                tmp /= i;
                i--;
            }
        }
        if(re.equals("")){
            re+=String.valueOf(ulDataInput)+" ";
        }
        return re;
    }

    public static boolean isPrime(long num) {
        for (long i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long n = sc.nextLong();
            System.out.println(getResult(n));

        }
    }
}
