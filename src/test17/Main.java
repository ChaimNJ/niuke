package test17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[][] pos= new int[n+1][m+1];
            for (int i = 0; i < k; i+=1) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                pos[x][y]+=1;
            }
            System.out.println(getResult(n,m,k, pos));
        }
    }

    private static int getResult(int n, int m, int k, int[][] pos) {
        int re = 0;
        for (int i = 0; i < 2; i++) {
            int maxBomb=0;
            int firstPosx =0;
            int firstPosy =0;
            for (int j = 1; j <=n-2 ; j++) {
                for (int h = 1; h <=m-2; h++) {
                    int areanum = areaBomb(j,h,pos);
                    if(areanum>maxBomb){
                        maxBomb = areanum;
                        firstPosx = j;
                        firstPosy = h;
                    }
                }
            }
            re+=maxBomb;
            clearPos(firstPosx,firstPosy,pos);
        }
        return re;
    }

    private static void clearPos(int j, int h, int[][] pos) {
        for (int i = j; i < j+3; i++) {
            for (int k = h; k < h+3; k++) {
                if(pos[i][k]>=1){
                    pos[i][k]-=1;
                }
            }
        }
    }

    private static int areaBomb(int j, int h,int[][] pos) {
        int num = 0;
        for (int i = j; i < j+3; i++) {
            for (int k = h; k < h+3; k++) {
                if(pos[i][k]>=1){
                    num+=1;
                }
            }
        }
        return num;
    }

}
