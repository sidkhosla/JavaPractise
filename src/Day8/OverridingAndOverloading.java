package Day8;

import java.util.Timer;
import java.util.TimerTask;

public class OverridingAndOverloading {
    public static void method1() {
        System.out.println("method1");
    }

    public static void method2() {
        System.out.println("method2");
    }


//--Overriding method this is used to use the same name of a method but with a different
// code which would be only usable in the class that extends the main class.
//class mainExtender extends OverridingAndOverloading {

//    public static void method1(){
//        System.out.println("Welcome");
//    }
//--Overloading- calling the main method directly
//    public static void main(String[] args) {
//        method1();
//        method2();
//    }
//----------------------------
//Example of over loading
    static class OverloadingExample {
        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }
    }

//---Example of overriding with the timer function
    public  static void ok(){
        Timer tmr=new Timer();
        TimerTask tsk=new TimerTask() {
            int y=0;
            @Override
            public void run() {
                y++;
                if(y==10){
                    cancel();
                    System.exit(0);
                }
                System.out.println("ok");
            }
        };
        tmr.schedule(tsk,0,1000);
    }
//--- running both examples and overloaded methods.
    public static void main(String[] args) {
//            ok();
        OverloadingExample oe = new OverloadingExample();
        int oe1 = oe.add(1,2);
        int oe2 = oe.add(1,2,3);
        System.out.println(oe1);
        System.out.println(oe2);
    }

}