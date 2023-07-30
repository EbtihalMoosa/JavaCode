import java.util.Scanner;

public class CalculatingScore {




    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("enter grade 1");
        double g1 = read.nextDouble();
        System.out.println("enter grade 2 ");
        double g2 = read.nextDouble();
        System.out.println("inter grade 3");
        double g3 = read.nextDouble();
        System.out.println("inter grade 4");
        double g4 = read.nextDouble();
        System.out.println("inter grade 5");
        double g5 = read.nextDouble();


        double total = (g1+g2+g3+g4+g5)/5;
        System.out.println("the total grade is " + total);


        if (total>=90)
        {
            System.out.println("your grade is A");
        }
        else if (total>=80 && total <90) {
            System.out.println("your grade is B");
        }
        else if (total>=70 && total< 80)
        {
            System.out.println("your grade is C");
        }
        else if (total>=60 && total<70){
            System.out.println("your grade is D");}
        else{
            System.out.println("your grade is F");
        }
    }}

