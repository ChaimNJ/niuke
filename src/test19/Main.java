package test19;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            TreeMap<Integer,Integer> map =  new TreeMap<Integer, Integer>();
            for (int i = 0; i < a; i++) {
                int key = sc.nextInt();
                int value = sc.nextInt();
                if(map.containsKey(key)){
                    map.put(key,map.get(key)+value);
                }else{
                    map.put(key,value);
                }
            }
            for (Map.Entry e:map.entrySet()) {
                System.out.println(e.getKey()+" "+e.getValue());
            }
        }
    }
}
