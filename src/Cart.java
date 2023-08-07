import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart {
    Scanner read = new Scanner(System.in);

    Prodcut pro1 = new Prodcut("t55", "shoes",33.3);
    Prodcut pro2 = new Prodcut("r35", "Makeup",20.1);
    Prodcut pro3 = new Prodcut("w45", "t-shirt", 32.2);
    Prodcut pro4 = new Prodcut("b23", "bag",44);
    List<Prodcut> prodcuts = new ArrayList<>();
    public void showProduct(){
        prodcuts.add(pro1);
        prodcuts.add(pro2);
        prodcuts.add(pro3);
        prodcuts.add(pro4);

        String [] arr ={  "Product code", "   Product name "," Price"};
        for (int i = 0; i<3; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        for (Prodcut prodcut : prodcuts) {

            System.out.println(prodcut.prodCode + " \t\t\t\t"+ prodcut.prodName + " \t\t"+ prodcut.price +"  OR");
        }
    }


    public void addToCart(){
        System.out.println("Enter product code : ");
        String id = read.next();

        System.out.println("Enter Product name: ");
        String pName = read.next();

        System.out.println("Enter product price : ");
        Double proPrice = read.nextDouble();

        Prodcut newProduct = new Prodcut(id, pName,proPrice);
        prodcuts.add(newProduct);




    }
}
