package CursoJava.secao10_ArraysEListas.ex03.program;

import CursoJava.secao10_ArraysEListas.ex03.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nRent #" + i + ":");
            input.nextLine();
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();
            System.out.print("Room: ");
            int room = input.nextInt();
            vect[room] = new Rent(name,email);

        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        input.close();

    }

}
