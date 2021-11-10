package CodeWarsPractise;

public class Practise {

    public static void calcEngine(){
        double value1 = 100;
        double value2 = 50;
        double result = 0.0d;
        char opCode = 'b';

        switch (opCode){
            case 'a':
                result = value1 + value2;
                break;
            case 's':
                result = value1 - value2;
                break;
            case 'm':
                result = value1 * value2;
                break;
            case 'd':
            result = value2 != 0 ? value1 / value2 : 0.0d;
            break;
            default:
            System.out.println("Invalid opCode: " + opCode);
            result = 0.0d;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        calcEngine();
    }
}
