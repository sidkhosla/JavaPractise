package Day5;
//----Q.You get an array of numbers, return the sum of all of the positives ones.
// Example [1,-4,7,12] => 1 + 7 + 12 = 20
//public class Main {
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
public class Main {
    //--Print number of repeating alphabets in a string
    public static void main(String[] args) {
        String strAll = "sidHantTnahdiS";
        String str = strAll.toLowerCase();
        int y = 0;
        String nw = "";
        for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        y++;
                    }
                }
                String h = ""+str.charAt(i);
                if(nw.contains(h)){

                }else{
                    nw=nw+h;
                    System.out.println(h+"  "+y);
                }
                y = 0;
            }
        }

















    }
