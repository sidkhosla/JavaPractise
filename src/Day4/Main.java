package Day4;

import java.util.Scanner;

public class Main {
    //Finding duplicate characters in words in a string of words.
//    public static void main(String[] args) {
//        String z = "Hello ok Bye";
//        String y[] = z.split(" ");
//        String nw = " ";
//        String nw1 = " ";
//
//        for (int i = 0; i < y.length; i++) {
//            for (int j = 0; j < y[i].length(); j++) {
//                char t = y[i].charAt(j);
//                String t1 = "" + t;
//                if (nw.contains(t1)) {
//
//                }
//                else
//                    {
//                    nw = nw + t1;
//                }
//            }
//            nw1 = nw1 +nw+" ";
//            nw = "";
//        }
//
//        System.out.println(nw1);
//    }
    //---Return true if string contains numbers return false if it has no numbers
//    public static boolean chkString(String str){
//        int g=0;
//        for (int i = 0; i < str.length(); i++) {
//            char t = str.charAt(i);
//            int y=t;
//                if (y>=48 && y<=57) {
//                    g++;
//                }
//            }
//
//        if(g==0){
//            return true;
//        }else{
//            return  false;
//        }
//
//
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        for(int i = 0; i < 10; i++) {
//            i=0;
//            String s = sc.nextLine();
//            if (chkString(s)) {
//                System.out.println("Valid Value");
//                break;
//            } else {
//                System.out.println("Invalid value please try again");
//            }
//        }

//----Type casting
//public static void main(String[] args) {
//    char c = '9';
//    //int y = c;-implicit conversion
//    int y = (int)c;-- explicit conversion
//    System.out.println(y);
//---Coverting askii value to char

    //---get a string and check is it pure int or not
//    public static boolean checkPureInt(String num) {
//        int g = 0;
//        if(num.length()==10) {
//            for (int i = 0; i < num.length(); i++) {
//                char t = num.charAt(i);
//                int y = t;
//                if (y >= 65 && y <= 90 || y >= 97 && y <= 122) {
//                    g++;
//                }
//            }
//            if (g == 0) {
//                return true;
//            } else return false;
//
//        }else{
//
//            return  false;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < 10; i++) {
//            i = 0;
//            String s = sc.nextLine();
//            if (checkPureInt(s)) {
//                System.out.println("Valid Value");
//                break;
//            } else {
//                System.out.println("Invalid value please try again");
//            }
//        }
//    }
//---Code wars problem sum 2

    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};


    }

    public static boolean comp(int[] a, int[] b) {
        int y = 0;
        int z = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[i] == (a[j] * b[j])) {
                    y++;
                }
            }

            if (y == 1) {
                z++;
            }
            y = 0;

        }
        if (z != a.length)
            return true;
        else
            return false;

    }
}










