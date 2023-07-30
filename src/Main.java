import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        {
                Scanner read = new Scanner(System.in);
                System.out.println("please answer this questions:");
                System.out.println("enter your name");
                String name = read.next();
                System.out.println("enter number of question");
                int num = read.nextInt();



                String[] q= {"1+1= " ,"1+3= " , "3+3= ", "2+0= " , "5+3= "} ;
                int [] a= {2 ,4 , 6, 2 , 8} ;
                int total = 0;
                for (int i=0; i<num; i++){
                    System.out.println(q[i]);
                    int answer = read.nextInt();
                    if (answer == a[i]){
                        System.out.println("True");
                        total++;
                    }else {
                        System.out.println("False");}
                }
                System.out.println("the total "+ total);
            }
        }




            }







