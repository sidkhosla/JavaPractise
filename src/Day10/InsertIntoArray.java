package Day10;

import java.util.Arrays;
import java.util.Scanner;

public class InsertIntoArray{
    static int[] array = new int[5];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        for(int i = 0;i<5;i++){
            System.out.println("Enter "+i+" element of the array: ");
                array[i] = sc.nextInt();
            }
        System.out.println(Arrays.toString(array));
        System.out.println("Enter position int: ");
        int position = sc.nextInt();
//        System.out.println("Enter value to be added to that position: ");
//        int value = sc.nextInt();
//        insertInto(array,position,value);
        delFrom(array,position);
//        System.out.println(Arrays.toString(array));
    }

    static void insertInto(int[] array, int position, int value) {
        for (int i = array.length-1;i>position;i--) {
            array[i] = array[i-1];
        }
        array[position] = value;
    }
    static void delFrom(int[] array, int position){
        for (int i = position;i< array.length-1;i++){
            array[i] = array[i+1];
        }
        for(int i = 0; i<array.length-1; i++){
            System.out.println(array[i]);
        }
    }
}
