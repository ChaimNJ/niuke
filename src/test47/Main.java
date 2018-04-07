package test47;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new LinkedHashMap<String,Integer>();
        while(sc.hasNext()){
            String s =  sc.next();
            if(s=="-1"||"-1".equals(s)){
                break;
            }
            String lineNum = sc.next();
            String fileName = s.substring(s.lastIndexOf("\\")+1);
            if(fileName.length()>16){
                fileName = fileName.substring(fileName.length()-16);
            }
            String key = fileName+" "+lineNum;
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,1);
            }
        }
        int cnt = 0;
        for (Map.Entry entry:map.entrySet()) {
            cnt++;
            if(cnt>map.size()-8) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
