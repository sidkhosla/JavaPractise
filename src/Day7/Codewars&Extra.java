package Day7;

//public class OverridingAndOverloading {
//    //---get 5 values an arrays if the user adds a duplicate value prompt the user of the error and ask again.
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Size of the array user wants: ");
//        int z = sc.nextInt();
//        int[] array=new int[z];
//        int j;
//        System.out.println("Enter the " +z+ " elements of an array");
//        for(int i = 0;i<array.length;i++){
//            int addedElement = sc.nextInt();
//            for(j = 0;j<array.length;j++) {
//
//                if (addedElement == array[j]){
//                    System.out.println("Please enter a valid value, try again: ");
//                    addedElement = sc.nextInt();
//                    j=-1;
//                }
//            }array[i] = addedElement;
//
//        }System.out.println(Arrays.toString(array));
//
//    }
//}

//Write function alternateCase which switch every letter in string from upper to lower and from lower to upper.
// E.g: Hello World -> hELLO wORLD
//    class OverridingAndOverloading {
//        private static String st="";
//
//        public static String alternateCase(final String string) {
//            for (int i = 0; i < string.length(); i++) {
//                if (string.charAt(i) == string.toLowerCase().charAt(i)) {
//                    st = "" +st+ string.toUpperCase().charAt(i);
//                } else if (string.charAt(i) == string.toUpperCase().charAt(i)) {
//                    st = ""+st+string.toLowerCase().charAt(i);
//                }
//            }
//            return st;
//        }
//        public static void main(String[] args) {
//            String c = alternateCase("ABC");
//            System.out.println(c);
//        }
//    }

