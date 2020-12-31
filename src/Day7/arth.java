package Day7;
//--Call by reference
public class arth {

    public static int add(int a,int b){
        return (a+b);
    }
    public static int subtract(int a, int b){
        return (a-b);
    }
    public static int multiply(int a, int b){
        return (a*b);
    }
    public static int divide(int a, int b){
        return (a/b);
    }

    public static void main(String[] args) {
        System.out.println(add(1,2));
    }
}
