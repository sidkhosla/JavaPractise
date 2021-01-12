package Day12;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

class Student{
    String name;
    int rll;
    int marks;
    String grade;
    //default constructor
//    public Student(){
//
//    }
    //paramitersied constructor
    public Student(String name, int rll, int marks){
        setName(name);
        setRll(rll);
        setMarks(marks);
        grade = calcGrade(marks);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRll() {
        return rll;
    }

    public void setRll(int rll) {
        this.rll = rll;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String calcGrade(int marks) {
        if(marks > 90){
            return "A";
        }
        else if(marks>80 && marks<90){
            return "B";
        }else if(marks>70 && marks<80){
            return "C";
        }else if(marks>60 && marks<70){
            return "D";
        }else if(marks>40 && marks<60){
            return "PASS";
        }else{
            return "FAIL";
        }
    }
}

public class Main {
    static Main mn = new Main();

    static Student[] stu;
static  int choice;
    //1 - add
    //2 - view
    //3 - search
    //4 - sort
    static Scanner sc = new Scanner(System.in);
    static Scanner scs = new Scanner(System.in);
    public void studentRecordGenerator(){
        printer();
    }
    public static void printer() {
        System.out.println("Options to select from: ");
        Main mn = new Main();
        System.out.println("1 - View\n" + "2 - Search\n" + "3 - Sort Alphabetically\n");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                mn.viewStudentRecord();
                break;
            case 2:
                mn.searchStudentRecord();
                break;
            case 3:
                mn.sortRecords();
                break;
        }
    }

    public void viewStudentRecord(){
        for (Student student : stu) {
            System.out.println(student.getName() + " " + student.getRll() + " " + student.getMarks());
        }
    }
    public void searchStudentRecord(){
        System.out.println("Enter the roll number you want to search for: ");
        int input = sc.nextInt();
        for (Student student : stu) {
            if (student.getRll() == input) {
                System.out.println(student.getName() + " " + student.getRll() + " " + student.getMarks());
            }
        }
    }
    public void sortRecords(){
        int ct=0;
        int t= stu.length-1;
        for(int y=0;y<stu.length;y++){
            for(int z=0;z< stu.length;z++){
                if(stu[y].getMarks()>stu[z].getMarks()){
                    ct++;

                }

            }
            if(ct==t){
                System.out.println(stu[y].getName()+" "+ stu[y].getRll());
                t--;
                y=-1;
            }
            ct=0;
        }
    }

    public static void main(String[] args) {
        System.out.println("How many students you want to store: ");
        choice = sc.nextInt();
        stu=new Student[choice];
        for(int i = 0;i<choice;i++){
            String nm=scs.nextLine();
            int rll = sc.nextInt();
            int marks = sc.nextInt();
            stu[i]=new Student(nm,rll,marks);
        }
        printer();

    }
    }

