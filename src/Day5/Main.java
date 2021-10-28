package Day5;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

//----Q.You get an array of numbers, return the sum of all of the positives ones.
// Example [1,-4,7,12] => 1 + 7 + 12 = 20
class OverridingAndOverloading {
    //        public static class Positive {
//            public static int sum(int[] arr) {
//                int sum = 0;
//                for (int i = 0; i < arr.length; i++) {
//                    if (arr[i] >= 0) {
//                        sum = sum + arr[i];
//                    }
//                }
//
//                return sum;
//            }
//        }
//    }
//---Q.Nathan loves cycling.
//
//Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
//
//You get given the time in hours and you need to return the number of litres Nathan will drink,
// rounded to the smallest value.
//
//For example:
//
//time = 3 ----> litres = 1
//
//time = 6.7---> litres = 3
//
//time = 11.8--> litres = 5
//public class KeepHydrated  {
//--First solution
//    public int Liters(double time)  {
//        return (int) Math.floor(time / 2);
//    }
//}
//public class Main {
////    --Print number of repeating alphabets in a string
//    public static void main(String[] args) {
//        String strAll = "sidHantTnahdiSs";
//        String str = strAll.toLowerCase();
//        int y = 0;
//        StringBuilder nw = new StringBuilder();
//        for (int i = 0; i < str.length(); i++) {
//                for (int j = 0; j < str.length(); j++) {
//                    if (str.charAt(i) == str.charAt(j)) {
//                        y++;
//                    }
//                }
//                String h = ""+str.charAt(i);
//                if(nw.toString().contains(h)){
//
//                }else{
//                    nw.append(h);
//                    System.out.println(h+"  "+y);
//                }
//                y = 0;
//            }
//        }
//----get input from usser to tget the size of an array. Add all the elements of an array and store the sum to be the value of all the elements of that same array.
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the array: ");
//        int z = sc.nextInt();
//        int sum = 0;
//        int[] a= new int[z];
//        for(int i=0;i<a.length;i++){
//            System.out.println("Please enter the number to fill the array");
//            int filler = sc.nextInt();
//            a[i]=filler;
//        }
//        System.out.println("Array before the filler");
//        System.out.println(Arrays.toString(a));
//        for (int i : a) {
//            sum += i;
//        }
//
//        System.out.println("Sum of all the elements of the original array: "+sum);
//        System.out.println("Array after the filler: ");
//        for(int i=0;i<a.length;i++){
//            a[i]=sum;
//        }
//        System.out.println(Arrays.toString(a));
//    }
//--- Get two arrays store the values to a third array one by one from both the arrays
//        int[] array1 ={1,3,5,7,9};
//        int[] array2 = {2,4,6,8,10};
//        int length = array1.length + array2.length;
//        int[] finalArray = new int[length];
//        int a = 0;
//        int b =0;
//        for(int i=0; i<length;i++){
//            if(i%2==0){
//                finalArray[i]=array1[a];
//                a++;
//            }else{
//                finalArray[i]=array2[b];
//                b++;
//            }
//        }
//        System.out.println(Arrays.toString(finalArray));
//    }
// array with 6 values swap the elements with their consecutive numbers.
    public static void main(String[] args) {


        int[] arrayUnswapped = {2, 1, 4, 3, 6, 5, 8, 7};
        int length = arrayUnswapped.length;
        int[] finalArray = new int[length];
        for (int i = 0; i < arrayUnswapped.length; i = i + 2) {
            int temp = arrayUnswapped[i];
            arrayUnswapped[i] = arrayUnswapped[i + 1];
            arrayUnswapped[i + 1] = temp;


        }
        System.out.println(Arrays.toString(arrayUnswapped));
//
//
//
//
//
//    }
        //--Count sort
    }
}