package Day3;

import java.util.Scanner;

public class Main {
//---Complete the square sum function so that it squares each number passed into it and then sums the results together.

    //           For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.

//    public static class Kata
//    {
//        public static int squareSum(int[] numbers) {
//            int sum = 0;
//            for (int n : numbers) {
//                sum += n * n;
//            }
//
//            return sum;
//        }
//    }

//    public static void main(String[] args) {
//        int result = Kata.squareSum(new int[] {1,2,2});
//        System.out.println(result);
//    }
//----------------------------------------------------------

    public static void main(String[] args) {

//        int b = 0;
//        for (int x = 1; x<=10;x++){
//            b++;
//            System.out.println(b);
//            if(b == 10){
//                x = 0;
//            }
//            else if(b == 20) x = 12;
//            }
//----------------------
        //--------.split

//        Scanner sc = new Scanner(System.in);
//
//        String c = sc.nextLine();
//        String z[]= c.split(" ");
//        int ct = 0;
//        int x;
//        for(x=0; x < z.length; x++){
//            for(int y=0; y<z[x].length(); y++){
//                if(z[x].charAt(y)=='l'){
//                    ct++;
//                }
//            }
//            System.out.println(z[x]+" l "+ct);
//            ct=0;
//        }------------------------
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Give me a word\n");
//        String word = sc.nextLine();
//        System.out.println("Give me a alphabet you want to replace\n");
//        String findAlphabet = sc.nextLine();
//        System.out.println("Give me a alphabet you want to replace it with\n");
//        String replacingAlphabet = sc.nextLine();
//        String newString = "";
//
//        for(int x=0;x<word.length();x++){
//            char c = word.charAt(x);
//            String h=""+c;
//            if(h.equals(findAlphabet)){
//                newString =newString+replacingAlphabet;
//            }
//            else{
//                newString = newString + c;
//            }
//        }
//            System.out.println(newString);
//        ----------------------------------------
//        String st = "I am great and good";
//        String replacing = " "+"bad";
//        String newString = "";
//        String z[] = st.split(" ");
//        int x;
//        for (x = 0; x < z.length; x++) {
//
//
//                if (z[x].equals("great")) {
//                    newString = newString + replacing;
//
//                }
//                else{
//                    newString = newString +" "+ z[x];
//                }
//            }
//
//        System.out.println(newString);
//-------------------------------
        String st = "I am good am good and bad good good bad";
        String z[] = st.split(" ");
//        int y = 0;
        String nw = "";
        for (int i = 0; i < z.length;i++){
//            for(int j=0;j < z.length;j++) {
//                if (z[i].equals(z[j])) {
//                    y++;
//                }
//            }
                if(nw.contains(z[i])){

                }
                else{
                    nw = nw+z[i]+" ";
                }


        }
        System.out.println(nw);


    }

    //----Read inbuilt string functions-----
}










