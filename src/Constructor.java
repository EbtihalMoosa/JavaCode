import java.util.Scanner;

public class Constructor {

        public static void main(String[] args) {
//call class -3
            students s = new students();
//call var or attrubues-4
            s.name = "Ahmed";
            s.age = 22;
            s.course = "IT";
            s.grade = "A";
            s.Id = 221;
            System.out.println(s.name);


            System.out.println(s.age);
            System.out.println(s.course);
            System.out.println(s.grade);
            System.out.println(s.Id);
//call function -6
            s.printName();
            s.printAge();
            s.print();
// call constract -8
            students n1 = new students();
            students n2 = new students();
            students n3 = new students();
            students n4 = new students();

//call parameter constract -10
            students x = new students("ebtihal",24,"IT","A",13093);
            System.out.println(x);
        }
    }
    //new class -1
    class students {
        //variables or attrubues -2
        String name;
        int age;
        String course;
        String grade;
        int Id;
        //function -5
        void printName(){
            System.out.println(name);}
        void printAge(){
            System.out.println(age);}
        static void print(){
            System.out.println("welcome");
        }
        //default constract (to enter new value) -7
        students(){
            System.out.println("create new student");
        }
        //parameter constract -9
        students (String n, int a, String c, String g, int i){
            name = n;
            age = a;
            course = c;
            grade = g;
            Id = i;



        }}
