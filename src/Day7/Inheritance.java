package Day7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class inheritance {
   public  String Name;
   public String cls;
   public String rollno;
//--Small project to learn inheritance
  inheritance(String nm,String cl,String rll){
    setName(nm);
    setCls(cl);
    setRollno(rll);
  }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
}
class gettingValues {
    static inheritance[] in = null;
    static Scanner sc = new Scanner(System.in);
    static Scanner scstr = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("please enter how many entries do you want to store ");
        int n = sc.nextInt();
        in = new inheritance[n];

        for (int i = 0; i < n; i++) {
            System.out.println("enter the name of the student");
            String nam = scstr.nextLine();
            System.out.println("enter the class of the student");
            String cls = scstr.nextLine();
            System.out.println("enter the roll number of the student");
            String rollNo = scstr.nextLine();
            in[i] = new inheritance(nam, cls, rollNo);
            // System.out.println(in.getName()+" "+in.getRollno()+" "+in.getCls());
        }


        for (int i = 0; i < n; i++) {
            try {
                FileWriter myWriter = new FileWriter("File.txt", true);
                myWriter.write(in[i].getName() + " " + in[i].getCls() + " " + in[i].getRollno() + "\n");
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
//-------Switch
        System.out.println("Enter the number for the option you want to execute\n" +
                "1. Read the file\n" +
                "2. Search by roll number\n" +
                "3. Search and change by roll number\n");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                rf();
                break;
            case 2:
                search(n);
                break;
            case 3:
                searchAndChange(n);
                break;
            default:
                // code block
        }


    }
//read search

    private static String data;

    public static void rf() {
        try {
            File myObj = new File("File.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //Search
    public static void search(int n) {
        System.out.println("Enter the roll number you want to search for: ");
        String s = scstr.nextLine();
        int b = 0;
        for (int i = 0; i < in.length; i++) {
            if (s.equals(in[i].getRollno())) {
                System.out.println(in[i].getName() + " " + in[i].getCls());
                b++;
            }

        }
        if (b == 0) {
            System.out.println("No Match");

        }

    }

    //---Search and edit.
    public static void searchAndChange(int t) {
        System.out.println("Enter the roll number you want to change the record for: ");
        String s = scstr.nextLine();

        for (int i = 0; i < in.length; i++) {
            if (s.equals(in[i].getRollno())) {
                System.out.println("Press 1 to update name or 2 to update class\n");
                String upNameOrClass = scstr.nextLine();
                switch (upNameOrClass) {
                    case "1":
                        System.out.println("Enter new name: ");
                        String setNewName = scstr.nextLine();
                        in[i].setName(setNewName);
                        break;
                    case "2":
                        System.out.println("Enter new class: ");
                        String setNewClass = scstr.nextLine();
                        in[i].setCls(setNewClass);
                        break;

                    // code block
                }
            }
//                System.out.println(in[i].getName() + " " + in[i].getCls());

        }
        //System.out.println("Do you want to print the change to the file: \n" + "answer in y/n \n");
        //String answer = scstr.nextLine();
        //if (answer.equals("y")) {
        System.out.println(in.length);
        try{
            FileWriter myWriter = new FileWriter("File.txt");
            myWriter.write((""));
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        for (int j = 0; j < in.length; j++) {
            try {
                FileWriter myWriter = new FileWriter("File.txt",true);
                myWriter.write(in[j].getName() + " " + in[j].getCls() + " " + in[j].getRollno() + "\n");
                myWriter.close();
//            System.out.println(in[j].getName() + " " + in[j].getCls() + " " + in[j].getRollno());

            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}
//-- edit student details by roll number
//user should be asked what they want to change name or class record of the student with that roll number.