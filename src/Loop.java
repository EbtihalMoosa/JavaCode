
import java.util.Scanner;

//while (print even number)**
public class Loop
{
    public static void main(String[] args) {
        System.out.println("numbers from 1 to 100");
        for (int i = 0; i <= 100; i++)
            if (i % 2 == 0)
                System.out.println("The Even number is: " + i);

//another answer
        for (int c = 0; c <= 100; c++)
            if (c + 2 == 0)
                System.out.println("The Even number is: " + c);

//while (print odd number)**
        int i = 1;
        while (i <= 100) {
            System.out.println("The odd number is: " + i);
            i = i + 2;
        }


//do while (print prime numbers)**
        int z=1;
        do {
            if (
                    z!=1
                            && z % 2 != 0
                            && z % 3 != 0
                            && z % 5 != 0
                            && z % 7 != 0
                            || z == 2
                            || z == 3
                            || z == 5
                            || z == 7)
            {
                System.out.println("Prime numbers from 1 to 100 are :" +z);}
            z++;}
        while (z<=100);}}
