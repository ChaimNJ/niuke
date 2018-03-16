package test10;

import java.util.Scanner;

public class Main {
    /**
     * 分类讨论下。
     * <p>
     * 显然，任意数和 4 的倍数相乘，其结果仍是 4 的倍数；
     * 显然，若存在任意数量 2 的倍数，两两之间乘起来就是 4 的倍数；
     * 如果存在一个数不是 2 的倍数，即它是一个奇数：
     * 放在 2 的倍数旁边，一定不符合要求；
     * 放在 4 的倍数旁边，相乘结果仍是 4 的倍数。
     * <p>
     * <p>
     * 因此符合要求的排列分两种情况：
     * <p>
     * 存在 2 的倍数，所有 2 的倍数相邻排列，需要一个 4 的倍数连接剩下的数，奇数最多和 4 的倍数数量相等，要求 countMod4 >= countOdd
     * 没有 2 的倍数，原本放 2 的倍数一端可以改放一个奇数，countMod4 >= countOdd - 1
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int i = 0;
            while (i < n) {
                arr[i++] = sc.nextInt();
            }
            System.out.println(isSatis(arr));
        }
    }

    public static String isSatis(int[] arr) {
        int count2 = 0;
        int count4 = 0;
        int countodd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] % 4 != 0) {
                count2++;
            } else if (arr[i] % 4 == 0) {
                count4++;
            } else {
                countodd++;
            }
        }
        if(count2==0){
            if(countodd<=count4+1){
                return "Yes";
            }else{
                return "No";
            }
        }else{
            if(countodd<=count4){
                return "Yes";
            }else {
                return "No";
            }
        }

    }
}
