package Day11;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

//A.isFoo(String param) should return true if param is equal to the String "foo", false otherwise.
//Implement A.isFoo (String Param)
//Test case - sout(A.isFoo("foo"));
//starter code
//check for nulls always
//q1 - 10 mins in the first test not sure for the second
public class Day11 {
//
//    static boolean isFoo(String param) {
//        if (param != null && !param.trim().isEmpty() || Objects.equals(param, "foo")) {
//            return true;
//
//        } else {
//            return false;
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//        System.out.println(isFoo(null));
//    }

    //q2 - 10 mins
    /*A.a(int i, int j) should return true if one of the arguments equals 1 or if their sum is equal to 1.
    for example:
    A.a(1,5) returns true
    A.a(2,3) returns false
    A.a(-3,4) returns true
     */
//    public static boolean a(int i, int j) {
//        return i == 1 || j == 1 || i + j == 1;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(a(1,0));
//        System.out.println(a(1,6));
//        System.out.println(a(-5,6));
//        System.out.println(a(-5,8));
//
//    }

    //q3 in desktop screenshots
//    public static void main(String[] args) {
//        String[] arry = new String[]{"f", "o", "o", "bar"};
//        System.out.println(arryToString(arry));
//    }
//    static String str="";
//    public static String arryToString(String[] strings){
//        for(int i=0;i<strings.length;i++){
//
//            str = str + "" +strings[i];
//        }
//        return str;
//    }

    //q4
//    public static int calc(int[] array,int n1,int n2){
//        int sum = 0;
//        for(int i = n1; i<=n2;i++){
//            sum = sum + array[i];
//        }return sum;
//    }
//
//    public static void main(String[] args) {
//        int[] Test = new int[]{0,1,2,3,4,5,6};
//        System.out.println(calc(Test,1,5));
//    }
//
//    public static String stringConcat(String[] arr,String o){
//        String str = "";
//        for(int i=0;i<arr.length;i++){
//            for(int j = 0;j<o.length();j++){
//                String chr = o.charAt(j) +"";
//
//                if(chr.equals(arr[i])){
//                    str = str + arr[i];
//                }
//            }
//        }return str;
//    }
//
//    public static void main(String[] args) {
//        String[] arr = new String[]{"N","A","L","L","O"};
//        System.out.println(stringConcat(arr,"NAV"));
//    }
    //
    //return the count of how mnay times that int is in the array
//public static int dupCheck(int[] arr, int value){
//    int counter = 0;
//    for(int i = 0;i<arr.length;i++)
//        if(arr[i]==value){
//            counter++;
//        }return counter;
//}
//
//public static void main(String[] args) {
//
//    int[] arr = new int[]{1,2,3,5,4,5};
//    System.out.println(dupCheck(arr,5));
//

//    public static int[] noDupArrayGetter() {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//        int y=0;
//        for (int i = 0; i < 5; i++) {
//            System.out.print("Please enter a unique number for the array\n");
//            int arrayFiller = sc.nextInt();
//
//            for (int j = 0; j < arr.length; j++) {
//                if (arrayFiller == arr[j]) {
//                    y++;
//                }
//            }
//            if(y!=0){
//                System.out.println("duplicate, ");
//                i--;
//            }else{
//                arr[i]=arrayFiller;
//            }
//            y=0;
//        }return arr;
//    }
//
//        public static void main (String[]args){
//            System.out.println(Arrays.toString(noDupArrayGetter()));
//        }


//Get 2 arrays and do a dupcheck with themselvs as you type them in and for the second array do a dup check for the first one too as you type it in.
    public static void noDup2ArrayGetter() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int[] arr2 = new int[5];
        int y = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Please enter a unique number for the array\n");
            int arrayFiller = sc.nextInt();

            for (int j = 0; j < arr.length; j++) {
                if (arrayFiller == arr[j]) {
                    y++;
                }
            }
            if (y != 0) {
                System.out.println("duplicate, ");
                i--;
            } else {
                arr[i] = arrayFiller;
            }
            y = 0;
        }
        int c = 0;
        for (int x = 0; x < arr2.length; x++) {
            System.out.println("Please enter a unique number for the 2nd array\n");
            int arrayFiller = sc.nextInt();
            for (int j = 0; j < arr.length; j++) {
                if (arrayFiller == arr[j]) {
                    c++;
                }
            }
            for (int i = 0; i < arr2.length; i++) {
                if (arrayFiller == arr2[i]) {
                    c++;
                }
            }

            if (c == 0) {
                arr2[x] = arrayFiller;

            } else {
                System.out.println("duplicate");
                x--;
            }
            c = 0;
        }

            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(arr2));

        }

        public static void main (String[]args){
            noDup2ArrayGetter();
        }
}
