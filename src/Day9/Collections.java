package Day9;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {
    static ArrayList<String> ary=new ArrayList<String>();
    static LinkedList ll = new LinkedList<>();
//    public static void main(String[] args) {
//        ary.add("qwer");
//        ary.add(12);
//        ary.add(true);
//        for(Object x:ary){
//            if(x instanceof Integer) {
//                int y=Integer.parseInt(x.toString());
//                System.out.println(y+12);
//            }
//        }
//   }

    public static void main(String[] args) {
        ll.add("Hi");
        ll.add(12);
        ll.add(true);
        for(Object x:ll){
            System.out.println(x);
        }
    }
}
