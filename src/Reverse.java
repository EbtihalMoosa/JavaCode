
import java.util.Scanner;

public class Reverse  {
        public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

                    String reverse = "";
                    System.out.print("Enter word to get reverse: ");
                    String word = read.next();
                    for (int i = word.length() - 1; i >= 0; i--) {
                        reverse = reverse + word.charAt(i);
                    }
                    System.out.println(" reverse word is : " + reverse);


                }}


