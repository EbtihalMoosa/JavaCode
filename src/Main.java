
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Employees e1 = new Employees();
        e1.Id = 8883;
        e1.name = "ahmed";
        e1.phoneNumber = 29838;
        e1.salary = 200;
        Employees e2 = new Employees();
        e2.Id = 93927;
        e2.phoneNumber = 738732;
        e2.name = "sara";
        e2.salary = 350;
        Employees e3 = new Employees();
        e3.Id = 283;
        e3.phoneNumber = 9876;
        e3.name = "Noor";
        e3.salary = 600;

        List<Employees> e = new ArrayList<>();
        e.add(e1);
        e.add(e2);
        e.add(e3);

        while (true) {
            System.out.println(" Enter 1= create a new employee, 2 = show all employee salaries, 3 = exit ");
            int choice = read.nextInt();
                if (choice == 1) {
                    System.out.print("enter your name: ");
                    String name = read.next();
                    System.out.print("enter your phone number: ");
                    int phn = read.nextInt();
                    System.out.print("enter your email: ");
                    String email = read.next();}

                else if (choice ==2) {
//                    for (int i = 0; i < e.size(); i++) {
                        for (int i = 0; i < 3; i++) {

                            System.out.println(" ");
                        System.out.println("Name: " + e.get(i).name +"\t");
                        System.out.println("ID: " + e.get(i).Id + "\t");
                        System.out.println("Phone number: " + e.get(i).phoneNumber + "\t");
                        System.out.println("Salary " + e.get(i).salary + "\t");

                    }
                } else {

                    System.out.println("you will exist , thank you !");
                    break;
                    }
}
        }
    }















//        Student student2 = new Student();
//        student2.sId= 2;
//        student2.sName= "Ebtihal";
//        student2.phone = "888733";
//        Student student3 = new Student();
//        student3.sId= 3;
//        student3.sName= "Safa";
//        student3.phone = "22388";
//        Student student4 = new Student();
//        student4.sId= 4;
//        student4.sName= "Shahad";
//        student4.phone = "00036635";
//        Student student5 = new Student();
//        student5.sId= 5;
//        student5.sName= "Huda";
//        student5.phone = "00036635";


        //user input

//        List<Student> students = new ArrayList<>();
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//        students.add(student4);
//        students.add(student5);
//
//
////
//        while (true) {
//            System.out.println(" Enter 1= attendance register, 2 = show attendance list, 3 = exit ");
//            int x = read.nextInt();
//            if (x == 1) {
//                System.out.println("Enter your name : ");
//                String name = read.next();
//                if (
//                                   student1.sName.equals(name)
//                                || student2.sName.equals(name)
//                                || student3.sName.equals(name)
//                                || student4.sName.equals(name)
//                                || student5.sName.equals(name)
//                )
//                {
//                    System.out.println(" you are already registered !");
//                }
//                else {
//                    System.out.println("Pleas enter your details for attendance: ");
//                    System.out.println("Enter your ID : ");
//                    Student student = new Student();
//                    student.sId = read.nextInt();
//                    System.out.println("Enter your name : ");
//                    student.sName = read.next();
//                    System.out.println("Enter your phone number : ");
//                    student.phone = read.next();
//                    students.add(student);
//
//                    for (int i = 0; i < students.size(); i++) {
//                        System.out.print(students.get(i).sId + "\t");
//                        System.out.print(students.get(i).sName + "\t");
//                        System.out.println(students.get(i).phone + "\t");
//                    }
//
//                }
//
//
//            } else if (x == 2) {
//                for (int i = 0; i < students.size(); i++) {
//                    System.out.print(students.get(i).sId + "\t");
//                    System.out.print(students.get(i).sName + "\t");
//                    System.out.println(students.get(i).phone + "\t");
//                }
//            } else {
//
//                System.out.println("you will exist , thank you !");
//                break;
//            }
//        }
//    }