import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Customer cus1 = new Customer(" Maryam", "Maryam@gmail.com", "Mar633", "56677888", "Ibri");
        Customer cus2 = new Customer(" Reem", "Reem@gmail.com", "Reem633", "23434535", "Muscat");
        Customer cus3 = new Customer(" Fatma", "Fatma@gmail.com", "Fat777", "76543998", "Sohar");

        // String sel1pro []= {" t-shirt", "makeup", " bags", " shose"};   ,sel1pro
        Seller sel1 = new Seller("Ebtihal", "Ebtihal@gmail.com", "Ebt@5656", "4556677878");

        // String sel2pro []= {" t-shirt", "makeup", " bags", " shose"};  ,sel2pro
        Seller sel2 = new Seller("Athari", "Athari@gmail.com", "Ath@5656", "33474889");

        while (true) {
            System.out.println(" if you are admin enter 1 , if you are customer enter 2 , if you are seller enter 3");

            int x = scanner.nextInt();
            if (x == 1) {
                System.out.println("Welcome to Admin page");
                System.out.println(" to add customer enter 1 , to add seller enter 2");
                int y = scanner.nextInt();
                        if (y == 1) {

                            System.out.println("Enter customer name : ");
                            String cusName = scanner.next();

                            System.out.println("Enter customer email : ");
                            String cuse = scanner.next();

                            System.out.println("Enter customer password : ");
                            String cusPass = scanner.next();


                            System.out.println("Enter customer address : ");
                            String addr = scanner.next();

                            System.out.println("Enter customer phone number : ");
                            String phn = scanner.next();


                            Customer newCustomer = new Customer(cusName, cuse, cusPass, addr, phn);
                            List<Customer> customers = new ArrayList<>();
                            customers.add(cus1);
                            customers.add(cus2);
                            customers.add(cus3);
                            customers.add(newCustomer);
                            System.out.print(newCustomer);

                            System.out.println();
                            String [] arrc ={  "customer name ", "  Email "," Address"};
                            for (int i = 0; i<3; i++){
                                System.out.print(arrc[i] + "\t");
                            }
                            System.out.println();
                            for (Customer customer : customers) {

                                System.out.println(customer.cusName + " \t\t"+ customer.cusEmail + " \t\t"+ customer.address );
                            }

                        } else if (y == 2) {
                            System.out.println("Enter seller name : ");
                            String sName = scanner.next();

                            System.out.println("Enter seller email : ");
                            String sele = scanner.next();

                            System.out.println("Enter seller password : ");
                            String selPass = scanner.next();


                            System.out.println("Enter seller phone : ");
                            String selph = scanner.next();

                            Seller newSeller = new Seller(sName, sele, selPass, selph);
                            List<Seller> sellers = new ArrayList<>();
                            sellers.add(sel1);
                            sellers.add(sel2);
                            sellers.add(newSeller);

                           // show list seller

                            String [] arrse ={  "seller name ", "  Email "," phone"};
                            for (int i = 0; i<3; i++){
                                System.out.print(arrse[i] + "\t");
                            }
                            System.out.println();
                            for (Seller seller : sellers) {

                                System.out.println(seller.sellName + " \t\t"+ seller.sellEmail + " \t\t"+ seller.sellPhone );
                            }

                        }

            }else if (x == 2) {
                System.out.println("Welcome to customer page");

                System.out.println("Enter your name : ");
                String name = scanner.next();

                System.out.println("Enter your password : ");
                String pass = scanner.next();


//                if (){
//
//                }
                //show
                Cart cart = new Cart();

                cart.showProduct();

                cart.addToCart();

                cart.showProduct();

            } else if (x == 3) {
                System.out.println("Welcome to seller page");
                Cart cart = new Cart();
                cart.addToCart();

            } else {

                System.out.println("you will exist , thank you !");
                break;
            }


        }
    }
}