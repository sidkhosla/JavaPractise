package Day9;

public class Example {
    private String name;
    private String rollNumber;

    public  Example(){


    }
    public Example(String nm, String rll) {
        setName(nm);
        setRollNumber(rll);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

}

class subject extends Example{
    private  int Java;
    private  int python;
    public  subject(String nm,String rll,int java,int python){
        super(nm,rll);
        setJava(java);
        setPython(python);
    }

    public int getJava() {
        return Java;
    }

    public void setJava(int java) {
        Java = java;
    }

    public int getPython() {
        return python;
    }

    public void setPython(int python) {
        this.python = python;
    }
}
class Main{
    public static void main(String[] args) {

        subject sb = new subject("aman","b12",12, 23);
        System.out.println(sb.getName()+"\t"+ sb.getRollNumber()+"\t"+ sb.getJava());
        sb.setJava(245);
        System.out.println(sb.getJava());
        System.out.println(sb.getPython());
        sb.setPython(444);
        System.out.println(sb.getPython());
    }
}