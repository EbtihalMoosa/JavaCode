import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner s = new Scanner((System.in));

        System.out.println("enter the Radius");
        double r = s.nextDouble();

//the rules
        double per = 2 * r * 3.14;
        double area = 3.1*r*r;
        System.out.println("the perimeter: 2" + "*" + r + "*" + "3.14 = " + per);
        System.out.println("the area: 3.1 " +"*" +r +"*= "+ r + "=" + area);

    }}

