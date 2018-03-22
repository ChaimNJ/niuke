package test025_visit;
import java.util.*;
public class Visit {
    public static int countPath(int[][] map, int n, int m) {
        int mPosx = 0;
        int mPosy = 0;
        int cPosx = 0;
        int cPosy = 0;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                if(map[i][j]==1){
                    mPosx = i;
                    mPosy = j;
                }
                if(map[i][j]==2){
                    cPosx = i;
                    cPosy = j;
                }
            }
        }
        if(mPosx==cPosx&&mPosy==cPosy){
            return  1;
        }
        if(mPosx>cPosx){
            int temp = mPosx;
            mPosx = cPosx;
            cPosx = temp;
            temp = mPosy;
            mPosy = cPosy;
            cPosy = temp;
        }
        int[][] f = new int[n][m];
        if(mPosy<cPosy){
            f[mPosx][mPosy] =1;
            for (int i = mPosx+1; i <=cPosx; i++) {
                f[i][mPosy] = map[i][cPosy]==-1?0:f[i-1][mPosy];
            }
            for (int i = mPosy+1; i <=cPosy ; i++) {
                f[mPosx][i]=map[mPosx][i]==-1?0:f[mPosx][i-1];
            }
            for (int i = mPosx+1; i <=cPosx ; i++) {
                for (int j = mPosy+1; j <=cPosy ; j++) {
                    f[i][j]=map[i][j]==-1?0:f[i-1][j]+f[i][j-1];
                }
            }
        }else{
            f[mPosx][mPosy] =1;
            for (int i = mPosx+1; i <=cPosx; i++) {
                f[i][mPosy] = map[i][cPosy]==-1?0:f[i-1][mPosy];
            }
            for (int i = mPosy-1; i >=cPosy ; i--) {
                f[mPosx][i]=map[mPosx][i]==-1?0:f[mPosx][i+1];
            }
            for (int i = mPosx+1; i <=cPosx ; i++) {
                for (int j = mPosy-1; j >=cPosy ; j--) {
                    f[i][j]=map[i][j]==-1?0:f[i-1][j]+f[i][j+1];
                }
            }
        }
        return f[cPosx][cPosy];

    }

    public static void main(String[] args) {
        int[][] map =new int[][]{{0},{1},{2}};
        System.out.println(countPath(map,3,1));
    }
}
