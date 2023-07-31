import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("enter first number");
        int x = number.nextInt();
        System.out.print("enter second number");
        int y = number.nextInt();
        System.out.print("enter third number ");
        int z = number.nextInt();

        System.out.println("the average ="+ (x+y+z)/3);


    }}
