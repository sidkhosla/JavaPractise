package Day7;
//----OOPs concepts in action.
import java.util.Scanner;
class arithmetic {
    public int add(int a,int b){
        return (a+b);
    }
    public int subtract(int a, int b){
        return (a-b);
    }
    public int multiply(int a, int b){
        return (a*b);
    }
    public int divide(int a, int b){
        return (a/b);
    }

}
class Main {
    public static void main(String[] args) {
        arithmetic arth = new arithmetic();
        Scanner sc = new Scanner(System.in);

        int c = 10;
        for (int i = 0; i < c; i++) {
            System.out.println("Type 2 numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Enter switch case: \n"+ "Enter 5 for exit");
            int s = sc.nextInt();
            int result;
            switch (s) {
                case 1:
                    result = arth.add(a, b);
                    System.out.println("Result= "+result);
                    break;
                case 2:
                    result = arth.divide(a, b);
                    System.out.println("Result= "+result);
                    break;
                case 3:
                    result = arth.multiply(a, b);
                    System.out.println("Result= "+result);
                    break;
                case 4:
                    result = arth.subtract(a, b);
                    System.out.println("Result= "+result);
                    break;
                case 5:
                    c=0;
            }
        }
    }
}
