import java.util.Scanner;
public class Task3 {
        public static void main(String[] args) {
//Task 1
                double a = 1;

                Scanner read = new Scanner(System.in);
                System.out.print("enter number: ");
                double n = read.nextDouble();

                System.out.print("enter power: ");
                double p = read.nextDouble();
// اذا البور لايساوي الصفر
                while (p != 0) {
                        a = n * a;
                        --p;
                        System.out.println("=" + a);


//Task2
                        {
//                                Scanner read = new Scanner(System.in);
                                int number = 1 + (int) (100 * Math.random());
                                int x = 10;
                                int i;

                                for (i = 0; i < x; i++) {
                                        System.out.println("Guess a number between 1 to 100: ");
                                        int guess = read.nextInt();

                                        if (number == guess) {
                                                System.out.println("Right Answer");
                                                break;
                                        } else if (number > guess) {
                                                System.out.println("Wrong, Larger");
                                        } else if (number < guess) {
                                                System.out.println("Wrong, Less ");
                                        }
                                }
                        }
                }
        }

// Task 3

//public class Task3 {
//    public static void main(String[] args) {

        char[][] chars = {
                {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'j', 'h', 'i'}};
        //                String word= "abcdd";
        Scanner read = new Scanner(System.in);
                System.out.println("write word");
        String word = read.next();

        char[] cs = word.toCharArray();
        boolean isThisWordValid = true;
                for(
        char c :cs)

        {
                System.out.println(c + " : " + isExist(chars, c));
                if (!isExist(chars, c)) {
                        isThisWordValid = false;
                        break;
                }
        }
        // while (isExist(chars, c)){
}
static boolean isExist(char[][] chars, char c){
        for (int i=0; i < chars.length; i++) {
        for (int j = 0; j < chars[0].length; j++) {
        if (c == chars[i][j]) {
        return true;
        }

        }
        }

        return false;
        }}
