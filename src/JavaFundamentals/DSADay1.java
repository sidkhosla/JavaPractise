package JavaFundamentals;

import java.util.Scanner;

public class DSADay1 {
    public static void main(String[] args) {
//        System.out.println("*****\n" +
//                "   * \n" +
//                "  * \n" +
//                " *    \n" +
//                "*****");
//        System.out.println("   * ");
//        System.out.println("  *  ");
//        System.out.println(" *   ");
//        System.out.println("*****");
//        int a = 102, b = 104, c = 105;
//
//        if(a>b){
//            if(a>c){
//                System.out.println("a is largest");
//            } else{
//                System.out.println("c is largest");
//            }
//        }else if(b>c){
//            System.out.println("b is the largest");
//        }else{
//            System.out.println("c is the largest");
//        }

        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
        if (marks > 90) {
            System.out.println(" excellent");
        } else if (marks > 80) {
            System.out.println(" good ");
        } else if (marks > 70) {
            System.out.println(" fair ");
        }
            else if (marks > 60) {
                System.out.println(" meets Expectations ");
            } else {
                System.out.println(" below Par");
            }
        }
    }

