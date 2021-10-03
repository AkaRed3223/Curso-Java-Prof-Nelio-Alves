package CursoJava.secao09_Construtores_this_sobrecarga_encapsulamento.ex03_ProgramaEstoque.program;

//Continuando o mesmo programa, agora com encapsulamento e Getters and Setters.

import CursoJava.secao09_Construtores_this_sobrecarga_encapsulamento.ex03_ProgramaEstoque.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data");
        System.out.print("Name: ");
        product.setName(input.nextLine());
        System.out.print("Price: ");
        product.setPrice(input.nextInt());


        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = input.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = input.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println("Updated name: " + product.getName());
        System.out.printf("Updated price: %.2f%n", product.getPrice());
        System.out.println("Updated quantity: " + product.getQuantity());

        input.close();

    }
}
