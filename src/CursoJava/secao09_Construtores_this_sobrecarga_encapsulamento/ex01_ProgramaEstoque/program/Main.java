package CursoJava.secao09_Construtores_this_sobrecarga_encapsulamento.ex01_ProgramaEstoque.program;

//Igual ao ex04 da seção 08 mas dessa vez com construtores personalizados.

import CursoJava.secao09_Construtores_this_sobrecarga_encapsulamento.ex01_ProgramaEstoque.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter product data");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = input.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = input.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = input.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        input.close();

    }
}
