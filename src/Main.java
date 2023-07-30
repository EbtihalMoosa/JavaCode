import java.util.Scanner;



public class Main

{
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.print("Enter the width of the rectangle: ");
 double width = scanner.nextDouble();

 System.out.print("Enter the height of the rectangle: ");
 double height = scanner.nextDouble();

 // Calculate the area and perimeter of the rectangle
 double area = width * height;
 double perimeter = 2 * (width + height);

 // Print the results
 System.out.println("Area is " + width + " * " + height + " = " + area);
 System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);

 scanner.close();
 }
}








