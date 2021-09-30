package CursoJava.secao10_ArraysEListas.ex02.program;

//Mesmo programa que o exercício anterior, mas dessa vez utilizando vetor de classe.

import CursoJava.secao10_ArraysEListas.ex02.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            input.nextLine();
            String name = input.nextLine();
            double price = input.nextDouble();
            vect[i] = new Product(name,price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.printf("AVERAGE PRICE: %.2f",avg);

        input.close();

    }

}
