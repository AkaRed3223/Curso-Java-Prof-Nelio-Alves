package CursoJava.secao08_IntroducaoaPOO.ex08_Calculadora.ex03.program;

//Mesma calculadora, agora utilizando uma classe Calculator com métodos estáticos
//de modo que é dispensável a instanciação.

import CursoJava.secao08_IntroducaoaPOO.ex08_Calculadora.ex03.util.Calculator3;

import java.util.Locale;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        System.out.printf("Circumference: %.2f%n", Calculator3.circumference(radius));
        System.out.printf("Volume: %.2f%n", Calculator3.volume(radius));
        System.out.printf("PI Value: %.2f%n", Calculator3.PI);

    }
}
