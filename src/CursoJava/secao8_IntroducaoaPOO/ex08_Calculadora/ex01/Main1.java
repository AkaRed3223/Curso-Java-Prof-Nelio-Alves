package CursoJava.secao8_IntroducaoaPOO.ex08_Calculadora.ex01;

//Calculadora com os métodos na classe principal

import java.util.Locale;
import java.util.Scanner;

public class Main1 {

    public static final double PI = 3.14159;

    public static double circumference(double radius) {
        return 2 * PI * radius;
    }
    public static double volume(double radius) {
        return 4 * PI * radius * radius * radius / 3;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double c = circumference(radius);
        double v = volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI Value: %.2f%n", PI);

        input.close();
    }
}
