package CursoJava.secao14_Heranca_E_Polimorfismo.ex02_Products.application;

import CursoJava.secao14_Heranca_E_Polimorfismo.ex02_Products.entities.ImportedProduct;
import CursoJava.secao14_Heranca_E_Polimorfismo.ex02_Products.entities.Product;
import CursoJava.secao14_Heranca_E_Polimorfismo.ex02_Products.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported? ");
            char option = input.next().charAt(0);
            System.out.print("Name: ");
            input.nextLine();
            String prodName = input.nextLine();
            System.out.print("Price: ");
            double prodPrice = input.nextDouble();
            if (option == 'c') {
                productList.add(new Product(prodName,prodPrice));
            } else if (option == 'i') {
                System.out.print("Customs fee: ");
                Double prodCustomsFee = input.nextDouble();
                productList.add(new ImportedProduct(prodName,prodPrice,prodCustomsFee));
            } else if (option == 'u') {
                System.out.print("Manufacture date: ");
                Date prodManufactureDate = sdf.parse(input.next());
                productList.add(new UsedProduct(prodName,prodPrice,prodManufactureDate));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product prod : productList) {
            System.out.println(prod.priceTag());
        }

        input.close();
    }
}
