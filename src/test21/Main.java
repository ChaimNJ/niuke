package test21;

import java.util.*;

public class Main {
    //        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            while (sc.hasNext()) {
//                String s = sc.next();
//                Set<Character> set = new HashSet<>();
//                char[] schar = s.toCharArray();
//                for (int i = 0; i < schar.length; i++) {
//                    set.add(schar[i]);
//                }
//                System.out.println(set.size());
//            }
//        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            ArrayList<String> list = new ArrayList();
            for (int i = 0; i < a; i++) {
                String s = sc.next();
                list.add(s);
            }
            Collections.sort(list);
            for (String s:list) {
                System.out.println(s);
            }


        }
    }


}
