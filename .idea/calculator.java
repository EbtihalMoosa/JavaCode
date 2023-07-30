import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {


        Scanner read = new Scanner(System.in);

        System.out.println("enter number 1");
        int x = read.nextInt();
        System.out.println("enter number 2 ");
        int y = read.nextInt();
        System.out.println("enter operator ");
        String o = read.next();

        if (o.equals("+")) {
            System.out.println("result= " + x + "+" + y + "=" + (x+y));}
        else if (o.equals("-")){
            System.out.println("result= " + x + "-" + y + "=" + (x-y));}
        else if (o.equals("/")){
            System.out.println("result= " + x + "/" + y + "=" + (x/y));}
        else if (o.equals("*")){
            System.out.println("result= " + x + "*" + y + "=" + (x*y));}
        else
            System.out.println("please enter right operator");
    }
}

