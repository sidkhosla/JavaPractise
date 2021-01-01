package Day8;

interface  ok{
    public  int add(int a,int b);

}
class add{
    public static void add1(){
        System.out.println("ok");
    }

}
public class Interface extends add implements  ok{
    @Override
    public int add(int a, int b) {
        return (a+b);
    }


    public static void main(String[] args) {
        Interface in=new Interface();
        System.out.println(in.add(2,4));
        add1();
    }
}
