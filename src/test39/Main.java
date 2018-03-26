package test39;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int max = arr[n - 1];
            int min = arr[0];
            int maxCrazy = max - min;
            int minIndex = 1;
            int maxIndex = n - 2;
            while (minIndex < maxIndex) {
                maxCrazy += arr[maxIndex] - min;
                maxCrazy += max - arr[minIndex];
                min = arr[minIndex++];
                max = arr[maxIndex--];
            }
            maxCrazy += Math.max(arr[maxIndex] - min, max - arr[minIndex]);
            System.out.println(maxCrazy);
        }
    }
}
