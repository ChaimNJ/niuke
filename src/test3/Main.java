package test3;



import java.io.IOException;
import java.util.*;

public class Main {
     public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        List<Integer> list=new ArrayList();
        int c;
        int a = 0;
        int cou = 0;
            while(scan.hasNext()){
                c=scan.nextInt();
                    if(a==0){
                        a = c;
                    }else{
                        if (!list.contains(c)) {
                            list.add(c);
                        }
                cou++;
                    }
                if(cou==a){
                    list.sort((o1,o2)->o1-o2);
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                    list.clear();
                        a=0;
                        cou=0;
                }
            }

    }
}
