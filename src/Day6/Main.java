package Day6;

public class Main {
    //    public static void main(String[] args) {
//---Finding the greatest number in an array
//        int z = 0;
//        int[] arrayOfNumbers={9,2,7,4,5,6};
//        for(int i=0; i<arrayOfNumbers.length;i++){
//            if(z<arrayOfNumbers[i]){
//                z=arrayOfNumbers[i];
//            }
//
//
//        }
//        System.out.println(z);
//---finding the greatest number using---count sort.
//        int[] a = {11,15,18,7,9};
//        int z = 0; int ct = a.length-1;
//        for(int x = 0;x < a.length;x++){
//            for(int y=0;y<a.length;y++){
//                if(a[x]>a[y]){
//                    z++;
//                }
//            }
//                if(z==ct){
//                    System.out.println(a[x]);
//                    ct--;
//                    x=-1;
//                }
//                z=0;
//            }
//        }
//    }
//finding the smallest number
//public static void main(String[] args) {
//
//    int[] arrayOfNumbers={10,3,7,4,5,2};
//    int z = arrayOfNumbers.length;
//    for(int i = 0;i<arrayOfNumbers.length;i++){
//        if(z>arrayOfNumbers[i]){
//            z=arrayOfNumbers[i];
//        }
//    }
//    System.out.println(z);
//
//
//}
//---finding and printing only duplicates from an array.
    public static void main(String[] args) {
        int[] arrayOfNumbers = {10, 10,5,6,7,8,2,2};
        int z = 0;
        String numbers="";
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = 0; j < arrayOfNumbers.length; j++) {
                if (arrayOfNumbers[i] == arrayOfNumbers[j]) {
                    z++;
                }
            }
            if(z>1){
                if (numbers.contains("" + arrayOfNumbers[i])) {

                } else {
                    numbers = numbers + "" + arrayOfNumbers[i];
                    System.out.println(arrayOfNumbers[i]);
                }
            }
                z = 0;
            }

        }
    }

//----We need a function that can transform a string into a number. What ways of achieving this do you know?
//
//Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.

//public class StringToNumber {
//    public static int stringToNumber(String str) {
//        return Integer.parseInt(str);
//    }
//}
//---get 5 values an arrays if the user adds a duplicate value prompt the usser of the error and ask again.




