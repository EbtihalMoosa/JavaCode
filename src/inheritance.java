public class inheritance {

    public static void main(String[] args) {

        Person p = new Person();
        p.email = "hkda";
        p.id = 553;
        p.name="hjgj";
        p.phoneNumber= 557;
        p.printName();

    }
}
//class1 - employee
class Employee {
    //var
    String email;
    int id;
    //fun
    void printName(){
    }
}

//class 2 -person
class Person extends Employee {
    String name;
    int phoneNumber;

}



