package CodeWarsPractise;

import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;

public class CodeWarsPractiseDay1 {
//CodeWars Challenge- 6
//Sum all the numbers of the array (in F# and Haskell you get a list) except the highest
// and the lowest element (the value, not the index!).
// (The highest/lowest element is respectively only one element at each edge, even if there
// are more than one with the same value!)
//
//Examples Given:
//
//{ 6, 2, 1, 8, 10 } => 16
//{ 1, 1, 11, 2, 3 } => 6
//If array is empty, null or None, or if only 1 Element exists, return 0.
//
//Note:In C++ instead null an empty vector is used. In C there is no null. ;-)
//public static int sum(int[] numbers)
//{
//    if (numbers == null || numbers.length == 0 || numbers.length == 1) return 0;
//    int min,max,sum;
//    sum = min = max = numbers[0];
//    for (int i = 1; i < numbers.length; i++)
//    {
//        sum += numbers[i];
//        if (numbers[i] < min) min = numbers[i];
//        if (numbers[i] > max) max = numbers[i];
//    }
//    return sum - min - max;
//}
//    =============================
//    Given a non-empty array of integers, return the result of multiplying the values together in order. Example:
//
//[1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24

//    public static int sortArray(int[] number) {
//
//        int sum = 1;
//        for (int i=0; i< number.length; i++) {
//            sum = sum * number[i];
//
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(sortArray(new int[]{1,2,3, 5, 8}));
////        assertEquals(6, Kata.grow(new int[]{1,2,3}));

    //    }
//    =================
//    Count the divisors of a number
//    public static long numberOfDivisors(int n) {
//        long counter = 0;
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                counter++;
//            }
//        }
//        return counter;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(numberOfDivisors(30));
//    }
//    In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
//
//Examples
//highAndLow("1 2 3 4 5")  // return "5 1"
//highAndLow("1 2 -3 4 5") // return "5 -3"
//highAndLow("1 9 3 4 -5") // return "9 -5"
//Notes
//All numbers are valid Int32, no need to validate them.
//There will always be at least one number in the input string.
//Output string must be two numbers separated by a single space, and highest number is first.
//
//    public static String HighAndLow(String numbers) {
//        String[] stringArray = numbers.split(" ");
//        int[] intArray = new int[numbers.length()];
//        for(int i = 0; i < intArray.length; i++){
//            intArray[i] = Integer.parseInt(stringArray[i]);
//        }
//        Arrays.sort(intArray);
//        return Integer.toString(intArray[intArray.length-1]) + " " + Integer.toString(intArray[0]);
//    }
//
//
//    public static void main(String[] args) {
//        HighAndLow("1 2 3 4 5");
//    }




}
