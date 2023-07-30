import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    Scanner d = new Scanner(System.in);
        String input = d.nextLine();
        String[] word = input.split(" ");




            System.out.println("reverse sentence");
            for (int i = word.length- 1; i >= 0; i--) {
                System.out.print(word[i] + " ");


            }
        }}






