package CursoJava.secao8_IntroducaoaPOO.ex08_Calculadora.ex02.program;

//Mesma calculadora, agora utilizando instanciação de classe.

import CursoJava.secao8_IntroducaoaPOO.ex08_Calculadora.ex02.util.Calculator2;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Calculator2 calc = new Calculator2();

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        System.out.printf("Circumference: %.2f%n", calc.circumference(radius));
        System.out.printf("Volume: %.2f%n", calc.volume(radius));
        System.out.printf("PI Value: %.2f%n", calc.PI);

        input.close();
    }
}
